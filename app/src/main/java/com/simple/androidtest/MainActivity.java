package com.simple.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Jacoco custom report
 * task
 * ---jacocoTestReport
 * ---jacocoUnitTestReport1 // TODO
 * ---ref
 * ---https://www.jianshu.com/p/4b03123b4f81
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void onClick(View view){
        int i = view.getId();
        if (i == R.id.am_tv_test) {
            Toast.makeText(this,getResources().getText(com.simple.espressolibrary.R.string.ae_tv_text),Toast.LENGTH_SHORT).show();
        }
    }
}
