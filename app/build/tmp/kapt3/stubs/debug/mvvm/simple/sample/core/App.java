package mvvm.simple.sample.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lmvvm/simple/sample/core/App;", "Landroid/app/Application;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static mvvm.simple.sample.data.network.ApiService api;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty instance$delegate = null;
    public static final mvvm.simple.sample.core.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lmvvm/simple/sample/core/App$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "api", "Lmvvm/simple/sample/data/network/ApiService;", "getApi", "()Lmvvm/simple/sample/data/network/ApiService;", "setApi", "(Lmvvm/simple/sample/data/network/ApiService;)V", "<set-?>", "Lmvvm/simple/sample/core/App;", "instance", "getInstance", "()Lmvvm/simple/sample/core/App;", "setInstance", "(Lmvvm/simple/sample/core/App;)V", "instance$delegate", "Lkotlin/properties/ReadWriteProperty;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final mvvm.simple.sample.data.network.ApiService getApi() {
            return null;
        }
        
        public final void setApi(@org.jetbrains.annotations.Nullable()
        mvvm.simple.sample.data.network.ApiService p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mvvm.simple.sample.core.App getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        mvvm.simple.sample.core.App p0) {
        }
        
        private Companion() {
            super();
        }
    }
}