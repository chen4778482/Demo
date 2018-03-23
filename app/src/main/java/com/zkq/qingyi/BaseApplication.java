package com.zkq.qingyi;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.zkq.qingyi.sqlbean.DaoMaster;
import com.zkq.qingyi.sqlbean.DaoSession;

/**
 * GreenDao不支持kotlin ,只能写java版本的了
 * Created by Administrator on 2018/3/23.
 */
public class BaseApplication extends Application {
    //数据库
    private static DaoSession daoSession = null;


    public static DaoSession getDaoInstant() {
        return daoSession;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    private void setupDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "jjfw.db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
}
