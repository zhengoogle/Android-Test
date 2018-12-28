package com.simple.espressolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Activity test
 * Jacoco default mode
 * task
 * ---createDebugCoverageReport
 */
public class EspressoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso);
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
        if (i == R.id.ae_tv_test) {
            Toast.makeText(this,getResources().getText(R.string.ae_tv_text),Toast.LENGTH_SHORT).show();
        }
    }
}
