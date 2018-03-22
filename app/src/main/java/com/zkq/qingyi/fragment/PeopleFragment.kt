package com.zkq.qingyi.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import com.zkq.qingyi.R
import kotlinx.android.synthetic.main.fm_people.*

/**
 * Created by Administrator on 2018/3/21.
 */

class PeopleFragment : Fragment() {
    internal var view: View? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater!!.inflate(R.layout.fm_people, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pe_userRadioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener() { radioGroup, i ->
            pe_userRadioGroupToo.clearCheck()
            when (i) {
            //国家单位
                R.id.pe_userGuobut -> {

                }
            //事业单位
                R.id.pe_userShibut -> {

                }
            //国有企业
                R.id.pe_userYoubut -> {

                }
            //外资企业
                R.id.pe_userWaibut -> {

                }
            }
        })

        pe_userRadioGroupToo.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener() { radioGroup, i ->
            pe_userRadioGroup.clearCheck()
            when (i) {
            //民营企业
                R.id.pe_userMinbut -> {

                }
            //团体
                R.id.pe_userTuanbut -> {

                }
            //其他
                R.id.pe_userQibut -> {

                }
            }
        })
    }
}
