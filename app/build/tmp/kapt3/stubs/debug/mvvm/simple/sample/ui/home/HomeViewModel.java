package mvvm.simple.sample.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0016\u0010\"\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lmvvm/simple/sample/ui/home/HomeViewModel;", "Landroid/arch/lifecycle/ViewModel;", "apiService", "Lmvvm/simple/sample/data/network/ApiService;", "appDatabase", "Lmvvm/simple/sample/data/db/AppDatabase;", "(Lmvvm/simple/sample/data/network/ApiService;Lmvvm/simple/sample/data/db/AppDatabase;)V", "TAG", "", "getApiService", "()Lmvvm/simple/sample/data/network/ApiService;", "getAppDatabase", "()Lmvvm/simple/sample/data/db/AppDatabase;", "error", "Landroid/arch/lifecycle/MutableLiveData;", "getError", "()Landroid/arch/lifecycle/MutableLiveData;", "error$delegate", "Lkotlin/Lazy;", "homeData", "Lmvvm/simple/sample/data/model/UsersDto;", "getHomeData", "homeData$delegate", "showToast", "Lmvvm/simple/sample/ui/util/SingleLiveEvent;", "getShowToast", "()Lmvvm/simple/sample/ui/util/SingleLiveEvent;", "showToast$delegate", "getData", "", "removeFromDB", "results", "", "Lmvvm/simple/sample/data/model/ListModel;", "saveInDB", "app_debug"})
public final class HomeViewModel extends android.arch.lifecycle.ViewModel {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy error$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy showToast$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final mvvm.simple.sample.data.network.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final mvvm.simple.sample.data.db.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<mvvm.simple.sample.data.model.UsersDto> getHomeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mvvm.simple.sample.ui.util.SingleLiveEvent<java.lang.String> getShowToast() {
        return null;
    }
    
    public final void getData() {
    }
    
    private final void saveInDB(java.util.List<mvvm.simple.sample.data.model.ListModel> results) {
    }
    
    private final void removeFromDB(java.util.List<mvvm.simple.sample.data.model.ListModel> results) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mvvm.simple.sample.data.network.ApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mvvm.simple.sample.data.db.AppDatabase getAppDatabase() {
        return null;
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    mvvm.simple.sample.data.network.ApiService apiService, @org.jetbrains.annotations.NotNull()
    mvvm.simple.sample.data.db.AppDatabase appDatabase) {
        super();
    }
    
    public HomeViewModel() {
        super();
    }
}