package com.ajs.fragmentbackstack;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmenTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        Log.d(Constant.TAG, "onCreateView " +  FragmenTwo.class.getSimpleName());
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(Constant.TAG, "onViewCreated " +  FragmenTwo.class.getSimpleName());
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(Constant.TAG, "onActivityCreated " +  FragmenTwo.class.getSimpleName());
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(Constant.TAG, "onStart " +  FragmenTwo.class.getSimpleName());
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(Constant.TAG, "onResume " +  FragmenTwo.class.getSimpleName());
        super.onResume();
    }
}
