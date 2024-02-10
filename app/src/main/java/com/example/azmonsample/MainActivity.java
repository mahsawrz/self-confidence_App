package com.example.azmonsample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void examVoid(View view) {
        Intent intent = new Intent(this , FirstActivity.class);
        startActivity(intent);
    }

    public void appVoid(View view) {
        View v_app = getLayoutInflater().inflate( R.layout.aboutapp , null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v_app);
        AlertDialog alertDialog1 = builder.create();
        alertDialog1.show();
    }
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("بستن برنامه");
        builder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        builder.setMessage("آیا می خواهید از برنامه خارج شوید؟");
        builder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("لغو", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


        //super.onBackPressed();
    }

}