package sample.com.glp.ui.home

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.util.Log
import sample.com.glp.core.App
import sample.com.glp.data.db.AppDatabase
import sample.com.glp.data.model.ListModel
import sample.com.glp.data.model.UsersDto
import sample.com.glp.data.network.ApiService
import sample.com.glp.ui.util.SingleLiveEvent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel(
    val apiService: ApiService = App.api!!,
    val appDatabase: AppDatabase = AppDatabase.getInstance()): ViewModel(){
    var results : MutableList<ListModel>? = null
    private val TAG: String = HomeViewModel::class.java.simpleName
    val homeData: MutableLiveData<UsersDto> by lazy { MutableLiveData<UsersDto>() }
    val error : MutableLiveData<String> by lazy { MutableLiveData<String>() }
    val showToast : SingleLiveEvent<String> by lazy { SingleLiveEvent<String>() }
    private var mNetworkReceiver: BroadcastReceiver? = null

    init {
         mNetworkReceiver = NetworkChangeReceiver()

        getData()
    }
     fun getData() {
        apiService.getData().enqueue(object : Callback<UsersDto?> {
            override fun onFailure(call: Call<UsersDto?>?, t: Throwable?) {
                error.postValue("error happened")
            }

            override fun onResponse(call: Call<UsersDto?>?, response: Response<UsersDto?>?) {
                    if (response != null) {
                        if (response.isSuccessful) {
                            homeData.postValue(response.body())
                            showToast.postValue("success")
                            if (response.body()!!.results.size > 0) {
                                saveInDB(response.body()!!.results)
                                results=response.body()!!.results
                            }

                        } else {
                          error.postValue(response.errorBody()!!.string())
                        }
                    }
                }

        })

    }
    private fun saveInDB(results: MutableList<ListModel>) { // add data to databse
            for (i in results) {
                Log.d(TAG, "${i.name} inserted to databade")
                appDatabase.usersDao().insertData(i)
            }

    }

    private fun removeFromDB(results: MutableList<ListModel>) {  // remove data from database
            for (i in results) {
                Log.d(TAG, "${i.name} deleted from databade")
                appDatabase.usersDao().deleteData(i)
            }

    }


    inner class NetworkChangeReceiver : BroadcastReceiver() {  // braodcast recwiver to check network state
        override fun onReceive(context: Context, intent: Intent) {
            try {
                if (isOnline(context)) {
                    getData()
                    Log.e("tag", "Online Connect Intenet ")
                } else {
                    results?.let { removeFromDB(it) }
                    Log.e("tag", "Conectivity Failure !!! ")
                }
            } catch (e: NullPointerException) {
                e.printStackTrace()
            }

        }

        private fun isOnline(context: Context): Boolean {
            try {
                val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                val netInfo = cm.activeNetworkInfo
                //should check null because in airplane mode it will be null
                return netInfo != null && netInfo.isConnected
            } catch (e: NullPointerException) {
                e.printStackTrace()
                return false
            }

        }
    }


}