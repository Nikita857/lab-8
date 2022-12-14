package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
    }
    public void onclick(View view){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()){
            Toast toast1 = Toast.makeText(getApplicationContext(), "Подключение есть, Добро пожаловать", Toast.LENGTH_LONG);
            toast1.show();
        }else{
            Toast toast2 = Toast.makeText(getApplicationContext(), "Подключения нет", Toast.LENGTH_LONG);
            toast2.show();
        }
    }

}
