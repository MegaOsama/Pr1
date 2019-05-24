package com.apps.sam.calcolator;

import android.app.Activity;
import android.widget.Toast;

public class Messeages {
    public void doSomthing(Activity activity, String msg) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }
}
