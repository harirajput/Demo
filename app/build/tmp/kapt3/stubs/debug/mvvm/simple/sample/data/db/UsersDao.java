package mvvm.simple.sample.data.db;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'\u00a8\u0006\n"}, d2 = {"Lmvvm/simple/sample/data/db/UsersDao;", "", "deleteData", "", "data", "Lmvvm/simple/sample/data/model/ListModel;", "insertData", "", "selectAllData", "", "app_debug"})
public abstract interface UsersDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract long insertData(@org.jetbrains.annotations.NotNull()
    mvvm.simple.sample.data.model.ListModel data);
    
    @android.arch.persistence.room.Delete()
    public abstract int deleteData(@org.jetbrains.annotations.NotNull()
    mvvm.simple.sample.data.model.ListModel data);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from ListModel")
    public abstract java.util.List<mvvm.simple.sample.data.model.ListModel> selectAllData();
}