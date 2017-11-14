package com.example.bsc1.guidelinesq2;

import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private static final int TL =Toast.LENGTH_SHORT;
    private static final String TAG="LifeCycle ";
    private static String message ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message="onCreate() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);

    }
    @Override
    protected void onStart(){
        super.onStart();
        message="onStart() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onResume(){
        super.onResume();
        message="onResume() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onPause(){
        super.onPause();
        message="onPause() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        message="onRestart() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }

    @Override
    protected void onStop(){
        super.onStop();
        message="onStop() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        message="onDestroy() called ";
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(Bundle outState);
        message="onSaveInstanceState called ";
        message += " Bundle mapping ="+outState.size();
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(Bundle inState);
        message="onrestoreInstanceState called ";
        message += " Bundle mapping ="+inState.size();
        Toast .makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
}
}