package mvvm.simple.sample.data.db;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {mvvm.simple.sample.data.model.ListModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lmvvm/simple/sample/data/db/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "usersDao", "Lmvvm/simple/sample/data/db/UsersDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DB_NAME = "users.db";
    public static final int VERSION = 1;
    private static final kotlin.Lazy instance$delegate = null;
    public static final mvvm.simple.sample.data.db.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract mvvm.simple.sample.data.db.UsersDao usersDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\r\u0010\t\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lmvvm/simple/sample/data/db/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "VERSION", "", "instance", "Lmvvm/simple/sample/data/db/AppDatabase;", "getInstance", "()Lmvvm/simple/sample/data/db/AppDatabase;", "instance$delegate", "Lkotlin/Lazy;", "create", "context", "Landroid/content/Context;", "getInstance$app_debug", "app_debug"})
    public static final class Companion {
        
        private final mvvm.simple.sample.data.db.AppDatabase getInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized mvvm.simple.sample.data.db.AppDatabase getInstance$app_debug() {
            return null;
        }
        
        private final mvvm.simple.sample.data.db.AppDatabase create(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}