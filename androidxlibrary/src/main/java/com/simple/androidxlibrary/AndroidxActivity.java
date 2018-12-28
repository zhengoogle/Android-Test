package com.simple.androidxlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AndroidxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidx);
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
        if (i == R.id.aa_tv_test) {
            Toast.makeText(this,getResources().getText(R.string.aa_tv_text),Toast.LENGTH_SHORT).show();
        }
    }
}
