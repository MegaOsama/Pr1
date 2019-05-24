package com.apps.sam.pr1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apps.sam.calcolator.Messeages;

public class MainActivity extends AppCompatActivity {

    Messeages messeages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messeages.doSomthing(this,"ok");
    }
}
