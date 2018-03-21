package com.zkq.qingyi.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zkq.qingyi.R;

/**
 * Created by Administrator on 2018/3/21.
 */

public class PersonalFragment extends Fragment {
    View view = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fm_personal, container, false);
        return view;
    }

}
