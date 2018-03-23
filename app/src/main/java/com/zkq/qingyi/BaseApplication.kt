package com.zkq.qingyi

import android.app.Application
import com.zkq.qingyi.sqlbean.DaoMaster
import com.zkq.qingyi.sqlbean.DaoSession

/**
 * Created by Administrator on 2018/3/23.
 */
class BaseApplication : Application() {
    companion object {
        //数据库
        private var daoSession: DaoSession? = null

        fun getDaoInstant(): DaoSession? {
            return daoSession
        }
    }

    override fun onCreate() {
        super.onCreate()
        setupDatabase()
    }

    /**
     * 配置数据库
     */
    private fun setupDatabase() {
        val helper = DaoMaster.DevOpenHelper(this, "qingyi.db", null)
        val db = helper.getWritableDatabase()
        val daoMaster = DaoMaster(db)
        daoSession = daoMaster.newSession()
    }



}