package com.example.thomychanca.finalthomy.ui.operator;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.example.thomychanca.finalthomy.R;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class OperatorActivity extends AppCompatActivity {
    private String[]mAreas;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);
    }
}
