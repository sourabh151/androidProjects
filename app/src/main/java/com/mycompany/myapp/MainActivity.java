package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	}
    public void displayToastMsg(View v) {
        toastMsg("Hello how are you today!!");
    }
    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
        //hola
    }
}
