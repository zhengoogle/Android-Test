package com.simple.pmocklibrary.robolectric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.simple.pmocklibrary.R;

public class RobolectricRunnerActivity extends AppCompatActivity {

    protected Button rraBtnTest;
    protected TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robolectric_runner);

        rraBtnTest = (Button)findViewById(R.id.rra_btn_test);
        message = (TextView)findViewById(R.id.rra_tv_test);
    }
}
