package com.example.anjali.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(),"OnCreate()",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
    protected void onStart()
    {
        super.onStart();
        Toast t1=Toast.makeText(getApplicationContext(),"OnStart()",Toast.LENGTH_SHORT);
        t1.show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(),"OnResume()",Toast.LENGTH_SHORT).show();
    }
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),"OnPause()",Toast.LENGTH_SHORT).show();
    }
    protected void onStop()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),"OnStop()",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy()",Toast.LENGTH_SHORT).show();
    }
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart()",Toast.LENGTH_SHORT).show();
    }
}
