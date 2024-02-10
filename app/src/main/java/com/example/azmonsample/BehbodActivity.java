package com.example.azmonsample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BehbodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behbod);
    }

    public void moshavereVoid(View view) {
        View v_moshavere = getLayoutInflater().inflate(R.layout.moshavere, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(BehbodActivity.this);
        builder1.setView(v_moshavere);
        AlertDialog alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void anvaVoid(View view) {
        Intent intent =  new Intent(this , AnvaActivity.class);
        startActivity(intent);
    }

    public void tosieVoid(View view) {
        Intent intent =  new Intent(this , TosieActivity.class);
        startActivity(intent);
    }

    public void taqviatVoid(View view) {
        Intent intent =  new Intent(this , RahkarActivity.class);
        startActivity(intent);
    }

    public void vizhegiVoid(View view) {
        Intent intent =  new Intent(this , VizhegiActivity.class);
        startActivity(intent);
    }
}