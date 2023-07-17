package com.example.michi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metodo para el boton check in
    public void wow (View view){
        Intent entrada = new Intent(this,Rooms.class);
        startActivity(entrada);
    }
    public void way (View view){
        Intent entrada1 =  new Intent(this, CheckIn.class);
        startActivity(entrada1);
    }


}