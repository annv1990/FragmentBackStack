package com.ajs.fragmentbackstack;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button btnF1;
    Button btnF2;
    Button btnF3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnF1: {
                changeFragment(new FragmenOne());
                break;
            }
            case R.id.btnF2: {
                changeFragment(new FragmenTwo());
                break;
            }
            case R.id.btnF3: {
                changeFragment(new FragmenThree());
                break;
            }
        }
    }

    private void initView(){
        btnF1 = findViewById(R.id.btnF1);
        btnF1.setOnClickListener(this);
        btnF2 = findViewById(R.id.btnF2);
        btnF2.setOnClickListener(this);
        btnF3 = findViewById(R.id.btnF3);
        btnF3.setOnClickListener(this);
    }

    private void changeFragment(Fragment fragment){
        String tag = fragment.getClass().getSimpleName();
        FragmentManager mgr = getSupportFragmentManager();
        FragmentTransaction ft = mgr.beginTransaction();
        if(mgr.findFragmentByTag(tag) == null){
            Log.d(Constant.TAG, "create new fragment");
            ft.replace(R.id.frFragment, fragment);
            ft.addToBackStack(tag);
            ft.commit();
        } else {
            Log.d(Constant.TAG, "show exist fragment");
            ft.show(mgr.findFragmentByTag(tag));
            ft.commit();
        }

    }
}
