package com.zkq.qingyi.sqlbean;

import com.zkq.qingyi.BaseApplication;

import java.util.List;

/**
 * Created by ${小强同学} on 2017/11/27
 */

public class LoveDao {


    //    --------------------------PhoneBean  表  ----------------------------

    /**
     * 添加数据
     *
     * @param shop
     */
    public static void insertLove(PhoneBean shop) {
        BaseApplication.getDaoInstant().getPhoneBeanDao().insert(shop);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void deleteLove(long id) {
        BaseApplication.getDaoInstant().getPhoneBeanDao().deleteByKey(id);
    }


    /**
     * 查询条件为Type=TYPE_LOVE的数据
     *
     * @return
     */
    public static List<PhoneBean> queryLove(String Years) {
        return BaseApplication.getDaoInstant().getPhoneBeanDao().queryBuilder().where(PhoneBeanDao.Properties.Years.eq(Years)).list();
    }

    /**
     * 更新数据
     *
     * @param shop
     */
    public static void updateLove(PhoneBean shop) {
        BaseApplication.getDaoInstant().getPhoneBeanDao().update(shop);
    }

}
