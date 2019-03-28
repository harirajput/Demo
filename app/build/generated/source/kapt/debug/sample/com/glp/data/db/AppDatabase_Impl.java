package sample.com.glp.data.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.util.TableInfo;

import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile UsersDao _usersDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ListModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `username` TEXT, `email` TEXT, `address` TEXT, `phone` TEXT, `website` TEXT, `company` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"938f4f6968194da7ebc255b98d42254a\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ListModel`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsListModel = new HashMap<String, TableInfo.Column>(8);
        _columnsListModel.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsListModel.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsListModel.put("username", new TableInfo.Column("username", "TEXT", false, 0));
        _columnsListModel.put("email", new TableInfo.Column("email", "TEXT", false, 0));
        _columnsListModel.put("address", new TableInfo.Column("address", "TEXT", false, 0));
        _columnsListModel.put("phone", new TableInfo.Column("phone", "TEXT", false, 0));
        _columnsListModel.put("website", new TableInfo.Column("website", "TEXT", false, 0));
        _columnsListModel.put("company", new TableInfo.Column("company", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysListModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesListModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoListModel = new TableInfo("ListModel", _columnsListModel, _foreignKeysListModel, _indicesListModel);
        final TableInfo _existingListModel = TableInfo.read(_db, "ListModel");
        if (! _infoListModel.equals(_existingListModel)) {
          throw new IllegalStateException("Migration didn't properly handle ListModel(mvvm.simple.sample.data.model.ListModel).\n"
                  + " Expected:\n" + _infoListModel + "\n"
                  + " Found:\n" + _existingListModel);
        }
      }
    }, "938f4f6968194da7ebc255b98d42254a", "ad3c4d20d9a90a37b1fd9e3479434f12");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "ListModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ListModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UsersDao usersDao() {
    if (_usersDao != null) {
      return _usersDao;
    } else {
      synchronized(this) {
        if(_usersDao == null) {
          _usersDao = new UsersDao_Impl(this);
        }
        return _usersDao;
      }
    }
  }
}
