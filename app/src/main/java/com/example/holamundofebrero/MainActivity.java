package com.example.holamundofebrero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Se ha ejecutado el metodo OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Se aha ejecutado el metodo OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Se ha ejecutado el metodo OnResume");
    }



    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Se ha ejectuado el metodo OnRestart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Se ha ejecutado el metodo OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Se ha ejecutado el metodo OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Se ha ejecutado el metodo onDestroy");
    }
}