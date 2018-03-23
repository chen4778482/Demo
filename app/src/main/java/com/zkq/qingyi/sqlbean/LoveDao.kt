package com.zkq.qingyi.sqlbean

import com.zkq.qingyi.BaseApplication


/**
 * Created by ${小强同学} on 2017/11/27
 */

object LoveDao {


    //    --------------------------PhoneBean  表  ----------------------------

    /**
     * 添加数据
     *
     * @param shop
     */
    fun insertLove(shop: PhoneBean) {
        BaseApplication.getDaoInstant()!!.phoneBeanDao.insert(shop)
    }

    /**
     * 删除数据
     *
     * @param id
     */
    fun deleteLove(id: Long) {
        BaseApplication.getDaoInstant()!!.phoneBeanDao.deleteByKey(id)
    }


    /**
     * 查询条件为Type=TYPE_LOVE的数据
     *
     * @return
     */
    fun queryLove(Years: String): List<PhoneBean> {
        return BaseApplication.getDaoInstant()!!.phoneBeanDao.queryBuilder().where(PhoneBeanDao.Properties.Years.eq(Years)).list()
    }

    /**
     * 更新数据
     *
     * @param shop
     */
    fun updateLove(shop: PhoneBean) {
        BaseApplication.getDaoInstant()!!.phoneBeanDao.update(shop)
    }

}
