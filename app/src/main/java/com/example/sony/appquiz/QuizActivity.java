package com.example.sony.appquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {




    private static final String TAG = "QuizActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t=(TextView) findViewById(R.id.question);
        RandomNumber r=new RandomNumber();
        int x=r.randomNoInRange(1,1000);
        String text=Integer.toString(x)+" "+getString(R.string.PrimeString);
        t.setText(text);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "Inside onSaveInstance");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "Inside OnStart");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG,"Inside OnPause");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"Inside OnREsume");

    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "Inside OnSTop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Inside OnDestroy");
    }

    public void onCorrectClick(View v){

        TextView textView=(TextView) findViewById(R.id.question);
        String value = textView.getText().toString();
        value = value.trim().replaceAll("[^0-9]","|").replaceAll("(\\D)\\1+","$1");
        String values[] = value.trim().split("\\|");
        int intValues[] = new int[values.length];
        for(int i = 0; i < values.length; i ++){
            intValues[i] = Integer.parseInt(values[i]);
        }
        PrimeCheck p=new PrimeCheck();
        int number = intValues[0];
        if(p.checkPrime(number)){

            Context context = getApplicationContext();
            CharSequence text = "Smart!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();



        }
        else
        {

            Context context = getApplicationContext();
            CharSequence text = "Try Again!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();



        }


    }
    public void onIncorrectClick(View v){





        TextView textView=(TextView) findViewById(R.id.question);
        String value = textView.getText().toString();
        value = value.trim().replaceAll("[^0-9]","|").replaceAll("(\\D)\\1+","$1");
        String values[] = value.trim().split("\\|");
        int intValues[] = new int[values.length];
        for(int i = 0; i < values.length; i ++){
            intValues[i] = Integer.parseInt(values[i]);
        }
        PrimeCheck p=new PrimeCheck();
        int number = intValues[0];
        if(p.checkPrime(number)){

            Context context = getApplicationContext();
            CharSequence text = "Try Again!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();



        }
        else
        {

            Context context = getApplicationContext();
            CharSequence text = "Smart!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();



        }

    }
    public void onNextClick(View v){

        TextView t=(TextView) findViewById(R.id.question);
        RandomNumber r=new RandomNumber();
        int x=r.randomNoInRange(1,1000);
        String text=Integer.toString(x)+" "+getString(R.string.PrimeString);
        t.setText(text);

    }






}
