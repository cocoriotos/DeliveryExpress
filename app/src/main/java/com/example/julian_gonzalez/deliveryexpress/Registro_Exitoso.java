package com.example.julian_gonzalez.deliveryexpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro_Exitoso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_exitoso);
    }

    public void OnButtonExitClick(View view) {
        finish();
        System.exit(0);
    }
}
