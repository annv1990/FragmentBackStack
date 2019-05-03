package com.ajs.fragmentbackstack;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmenThree extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        Log.d(Constant.TAG, "onCreateView " +  FragmenThree.class.getSimpleName());
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d(Constant.TAG, "onViewCreated " +  FragmenThree.class.getSimpleName());
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(Constant.TAG, "onActivityCreated " +  FragmenThree.class.getSimpleName());
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d(Constant.TAG, "onStart " +  FragmenThree.class.getSimpleName());
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d(Constant.TAG, "onResume " +  FragmenThree.class.getSimpleName());
        super.onResume();
    }
}
