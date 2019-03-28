package sample.com.glp.data.db

import android.arch.persistence.room.*
import sample.com.glp.data.model.ListModel

@Dao
interface UsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(data: ListModel): Long

    @Delete
    fun deleteData(data: ListModel): Int

    @Query("SELECT * from ListModel")
    fun selectAllData(): MutableList<ListModel>

}