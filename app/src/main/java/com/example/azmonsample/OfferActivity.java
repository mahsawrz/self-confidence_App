package com.example.azmonsample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OfferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
    }

    public void moshavereVoid(View view) {
        View v_moshavere = getLayoutInflater().inflate(R.layout.moshavere, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(OfferActivity.this);
        builder1.setView(v_moshavere);
        AlertDialog alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void kelidVoid(View view) {
        Intent intent = new Intent(this , KelidActivity.class);
        startActivity(intent);
    }

    public void risheVoid(View view) {
            Intent intent = new Intent(this , RisheActivity.class);
            startActivity(intent);
    }

    public void hefzVoid(View view) {
        Intent intent = new Intent(this , HefzActivity.class);
        startActivity(intent);
    }

    public void sheklVoid(View view) {
        Intent intent = new Intent(this , SheklActivity.class);
        startActivity(intent);
    }
}