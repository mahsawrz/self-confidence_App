package com.example.azmonsample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AfzayeshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afzayesh);
    }

    public void moshavereVoid(View view) {
        View v_moshavere = getLayoutInflater().inflate(R.layout.moshavere, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(AfzayeshActivity.this);
        builder1.setView(v_moshavere);
        AlertDialog alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void etamadVoid(View view) {
        Intent intent =  new Intent(this , EtemadActivity.class);
        startActivity(intent);
    }

    public void cheraVoid(View view) {
        Intent intent = new Intent(this , CheraActivity.class);
        startActivity(intent);
    }

    public void rahkarVoid(View view) {
        Intent intent =  new Intent(this , RahkarActivity.class);
        startActivity(intent);
    }

    public void vizhegiVoid(View view) {
        Intent intent =  new Intent(this , VizhegiActivity.class);
        startActivity(intent);
    }
}