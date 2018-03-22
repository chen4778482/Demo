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

class PersonalFragment : Fragment() {
    internal var view: View? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater!!.inflate(R.layout.fm_personal, container, false)
        return view
    }



}
