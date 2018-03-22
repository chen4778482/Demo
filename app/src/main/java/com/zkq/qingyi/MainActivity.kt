package com.zkq.qingyi

import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.RadioGroup
import com.zkq.qingyi.fragment.PeopleFragment
import com.zkq.qingyi.fragment.PersonalFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    private var personal: PersonalFragment? = null
    private var people: PeopleFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment1(1)
        mRadioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener() {
            radioGroup, i ->

            when (i) {
                R.id.mPersonalBut -> {
                    initFragment1(1)
                }
                R.id.mPeopleBut -> {
                    initFragment1(2)
                }
            }

        })

    }

    //显示第一个fragment
    private fun initFragment1(t: Int) {
        //开启事务，fragment的控制是由事务来实现的
        val transaction = supportFragmentManager.beginTransaction()

        //第一种方式（add），初始化fragment并添加到事务中，如果为null就new一个
        if (personal == null) {
            personal = PersonalFragment()
            transaction.add(R.id.main_frame_layout, personal)
        }
        if (people == null) {
            people = PeopleFragment()
            transaction.add(R.id.main_frame_layout, people)
        }
        //隐藏所有fragment
        hideFragment(transaction)
        when (t) {
            1 ->{
                //显示需要显示的fragment
                transaction.show(personal)
                mPersonalBut.setTextColor(ContextCompat.getColor(this,R.color.white))
                mPeopleBut.setTextColor(ContextCompat.getColor(this,R.color.black))
            }
            2 ->{
                //显示需要显示的fragment
                transaction.show(people)
                mPersonalBut.setTextColor(ContextCompat.getColor(this,R.color.black))
                mPeopleBut.setTextColor(ContextCompat.getColor(this,R.color.white))
            }
        }


        //第二种方式(replace)，初始化fragment
        //        if(f1 == null){
        //            f1 = new MyFragment("消息");
        //        }
        //        transaction.replace(R.id.main_frame_layout, f1);
        //提交事务
        transaction.commit()
    }

    //隐藏所有的fragment
    private fun hideFragment(transaction: FragmentTransaction) {
        if (personal != null) {
            transaction.hide(personal)
        }
        if (people != null) {
            transaction.hide(people)
        }

    }
}
