package com.zkq.qingyi.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.zkq.qingyi.R
import com.zkq.qingyi.sqlbean.LoveDao
import com.zkq.qingyi.sqlbean.PhoneBean


/**
 * Created by Administrator on 2018/3/21.
 */

class PersonalFragment : Fragment() {

    internal var view: View? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater!!.inflate(R.layout.fm_personal, container, false)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val phoneBean = PhoneBean()
        phoneBean.setYears("11")
        phoneBean.setPhone("18970544993")
        phoneBean.setTime("2018-12-12")
        phoneBean.setSpecificDate("hahha")

        LoveDao.insertLove(phoneBean)
    }


}
