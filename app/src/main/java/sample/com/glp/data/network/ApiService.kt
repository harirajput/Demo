package sample.com.glp.data.network


import sample.com.glp.data.model.UsersDto
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("users/")
    fun getData(
    ): Call<UsersDto>


}