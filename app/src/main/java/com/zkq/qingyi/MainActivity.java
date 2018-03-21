package com.zkq.qingyi;

import android.app.Activity;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioGroup;

import com.zkq.qingyi.fragment.PeopleFragment;
import com.zkq.qingyi.fragment.PersonalFragment;

public class MainActivity extends FragmentActivity {
    private RadioGroup radio = null;

    private PersonalFragment personal;
    private PeopleFragment people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio = findViewById(R.id.radio);
        initFragment1(1);
    }

    //显示第一个fragment
    private void initFragment1(int t) {
        //开启事务，fragment的控制是由事务来实现的
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //第一种方式（add），初始化fragment并添加到事务中，如果为null就new一个
        if (personal == null) {
            personal = new PersonalFragment();
            transaction.add(R.id.main_frame_layout, personal);
        }
        if (people == null) {
            people = new PeopleFragment();
            transaction.add(R.id.main_frame_layout, personal);
        }
        //隐藏所有fragment
        hideFragment(transaction);
        switch (t) {
            case 1:
                //显示需要显示的fragment
                transaction.show(personal);
                break;
            case 2:
                //显示需要显示的fragment
                transaction.show(people);
                break;
        }


        //第二种方式(replace)，初始化fragment
//        if(f1 == null){
//            f1 = new MyFragment("消息");
//        }
//        transaction.replace(R.id.main_frame_layout, f1);
        //提交事务
        transaction.commit();
    }

    //隐藏所有的fragment
    private void hideFragment(FragmentTransaction transaction) {
        if (personal != null) {
            transaction.hide(personal);
        }
        if (people != null) {
            transaction.hide(people);
        }

    }
}
