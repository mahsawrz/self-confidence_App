package com.example.azmonsample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private AlertDialog alertDialog;
    private AlertDialog alertDialog1;
    RadioButton rb1, rb2, rb3, rb4;
    RadioButton b1, b2, b3, b4;
    Button  next1,next , btnBack , btnBack1 , btnOffer , btnOffer2;
    public static int sum1= 0;
    public static int sum= 0;
    public int flag = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }
    public void firstQ(View view) {

        View v_ratos = getLayoutInflater().inflate(R.layout.alert_testratos_layout, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        next = v_ratos.findViewById(R.id.btnNextfirst);
        rb1 = v_ratos.findViewById(R.id.rb1);
        rb2 = v_ratos.findViewById(R.id.rb2);
        rb3 = v_ratos.findViewById(R.id.rb3);
        rb4 = v_ratos.findViewById(R.id.rb4);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    secondQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    secondQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    secondQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    secondQ();
                }

            }
        });
        builder.setView(v_ratos);
        alertDialog = builder.create();
        alertDialog.show();
    }


    public void secondQ() {
        View v_ratos_second = getLayoutInflater().inflate(R.layout.ratos_second, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_second);
        Button next = v_ratos_second.findViewById(R.id.btnNextSecond);


        rb1 = v_ratos_second.findViewById(R.id.rb1);
        rb2 = v_ratos_second.findViewById(R.id.rb2);
        rb3 = v_ratos_second.findViewById(R.id.rb3);
        rb4 = v_ratos_second.findViewById(R.id.rb4);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    thirdQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    thirdQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    thirdQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    thirdQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void thirdQ() {
        View v_ratos_third = getLayoutInflater().inflate(R.layout.ratos_third, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_third);
        Button next = v_ratos_third.findViewById(R.id.btnNextThird);

        rb1 = v_ratos_third.findViewById(R.id.rb1);
        rb2 = v_ratos_third.findViewById(R.id.rb2);
        rb3 = v_ratos_third.findViewById(R.id.rb3);
        rb4 = v_ratos_third.findViewById(R.id.rb4);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    forthQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    forthQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    forthQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    forthQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void forthQ() {
        View v_ratos_forth = getLayoutInflater().inflate(R.layout.ratos_forth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_forth);
        Button next = v_ratos_forth.findViewById(R.id.btnNextforth);

        rb1 = v_ratos_forth.findViewById(R.id.rb1);
        rb2 = v_ratos_forth.findViewById(R.id.rb2);
        rb3 = v_ratos_forth.findViewById(R.id.rb3);
        rb4 = v_ratos_forth.findViewById(R.id.rb4);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    fifthQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    fifthQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    fifthQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    fifthQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void fifthQ() {
        View v_ratos_fifth = getLayoutInflater().inflate(R.layout.ratos_fifth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_fifth);
        Button next = v_ratos_fifth.findViewById(R.id.btnNextfifth);

        rb1 = v_ratos_fifth.findViewById(R.id.rb1);
        rb2 = v_ratos_fifth.findViewById(R.id.rb2);
        rb3 = v_ratos_fifth.findViewById(R.id.rb3);
        rb4 = v_ratos_fifth.findViewById(R.id.rb4);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    sixthQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    sixthQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    sixthQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    sixthQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void sixthQ() {
        View v_ratos_sixth = getLayoutInflater().inflate(R.layout.ratos_sixth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_sixth);
        Button next = v_ratos_sixth.findViewById(R.id.btnNextSixth);

        rb1 = v_ratos_sixth.findViewById(R.id.rb1);
        rb2 = v_ratos_sixth.findViewById(R.id.rb2);
        rb3 = v_ratos_sixth.findViewById(R.id.rb3);
        rb4 = v_ratos_sixth.findViewById(R.id.rb4);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    seventhQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    seventhQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    seventhQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    seventhQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void seventhQ() {
        View v_ratos_seventh = getLayoutInflater().inflate(R.layout.ratos_seventh, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_seventh);
        Button next = v_ratos_seventh.findViewById(R.id.btnNextSeventh);

        rb1 = v_ratos_seventh.findViewById(R.id.rb1);
        rb2 = v_ratos_seventh.findViewById(R.id.rb2);
        rb3 = v_ratos_seventh.findViewById(R.id.rb3);
        rb4 = v_ratos_seventh.findViewById(R.id.rb4);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    eighthQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    eighthQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    eighthQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    eighthQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void eighthQ() {
        View v_ratos_eighth = getLayoutInflater().inflate(R.layout.ratos_eighth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_eighth);
        Button next = v_ratos_eighth.findViewById(R.id.btnNextEighth);
        rb1 = v_ratos_eighth.findViewById(R.id.rb1);
        rb2 = v_ratos_eighth.findViewById(R.id.rb2);
        rb3 = v_ratos_eighth.findViewById(R.id.rb3);
        rb4 = v_ratos_eighth.findViewById(R.id.rb4);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    ninthQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    ninthQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    ninthQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    ninthQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void ninthQ() {
        View v_ratos_nineth = getLayoutInflater().inflate(R.layout.ratos_nineth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_nineth);
        Button next = v_ratos_nineth.findViewById(R.id.btnNextNinth);

        rb1 = v_ratos_nineth.findViewById(R.id.rb1);
        rb2 = v_ratos_nineth.findViewById(R.id.rb2);
        rb3 = v_ratos_nineth.findViewById(R.id.rb3);
        rb4 = v_ratos_nineth.findViewById(R.id.rb4);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    tenthQ();
                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    tenthQ();
                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    tenthQ();
                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    tenthQ();
                }
            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void tenthQ() {

        View v_ratos_tenth = getLayoutInflater().inflate(R.layout.ratos_tenth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_ratos_tenth);
        Button next = v_ratos_tenth.findViewById(R.id.btnNextTenth);

        rb1 = v_ratos_tenth.findViewById(R.id.rb1);
        rb2 = v_ratos_tenth.findViewById(R.id.rb2);
        rb3 = v_ratos_tenth.findViewById(R.id.rb3);
        rb4 = v_ratos_tenth.findViewById(R.id.rb4);

        next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (rb1.isChecked() && rb1.getText().toString().trim().equals("کاملا درست")) {
                    sum += 3;
                    res(sum);
                    sum = 0;
                    flag = 2;


                } else if (rb2.isChecked() && rb2.getText().toString().trim().equals("درست")) {
                    sum += 2;
                    res(sum);
                    sum = 0;
                    flag = 2;


                } else if (rb3.isChecked() && rb3.getText().toString().trim().equals("این طور نیست")) {
                    sum += 1;
                    res(sum);
                    sum = 0;
                    flag = 2;



                } else if (rb4.isChecked() && rb4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum += 0;
                    res(sum);
                    sum = 0;
                    flag = 2;


                }


            }
        });
        alertDialog = builder1.create();
        alertDialog.show();
    }

    public void res(int s) {

        View v_ratos_res = getLayoutInflater().inflate(R.layout.ratos_res, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(FirstActivity.this);
        builder1.setView(v_ratos_res);
        TextView txtResult = v_ratos_res.findViewById(R.id.txtResult);
        TextView txt = v_ratos_res.findViewById(R.id.txt);
        btnOffer = v_ratos_res.findViewById(R.id.btnOffer);

        if (s >= 26 && s <= 30) {
            txt.setText("امتیاز شما " + s + " است. ");
            btnOffer.setText("راه های حفظ اعتماد به نفس");
            txtResult.setText("این عدد نشان می دهد که اعتماد به نفس خوبی دارید به خودتان ببالید و از والدین خود تشکر کنید.");
        } else if (s >= 15 && s <= 25) {
            txt.setText("امتیاز شما " + s + " است. ");
            btnOffer.setText("راه های تقویت اعتماد به نفس");
            txtResult.setText("این عدد نشان می دهد که اعتماد به نفستان خوب است ولی باید با روش هایی آن را بهتر کنید.");
        } else if (s <= 15) {
            txt.setText("امتیاز شما " + s + " است. ");
            btnOffer.setText("راه های پرورش اعتماد به نفس");
            txtResult.setText("این عدد نشان می دهد که باید از تکنیک های افزایش اعتماد به نفس استفاده کنید تا آن را در خود بپرورید.");
        }
        alertDialog = builder1.create();
        alertDialog.show();

    }



    //*****************************************************************************************************************
    //*****************************************************************************************************************
    public void firstQu(View view) {

        View v_rozen_first = getLayoutInflater().inflate(R.layout.rozen_first, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        next1 = v_rozen_first.findViewById(R.id.btnNextFirstR);
        b1 = v_rozen_first.findViewById(R.id.b1);
        b2 = v_rozen_first.findViewById(R.id.b2);
        b3 = v_rozen_first.findViewById(R.id.b3);
        b4 = v_rozen_first.findViewById(R.id.b4);


        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    secondQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    secondQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    secondQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    secondQu();
                }

            }
        });
        builder.setView(v_rozen_first);
        alertDialog1 = builder.create();
        alertDialog1.show();
    }


    public void secondQu() {
        View v_rozen_second = getLayoutInflater().inflate(R.layout.rozen_second, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_second);
        next1 = v_rozen_second.findViewById(R.id.btnNextSecondR);
        b1 = v_rozen_second.findViewById(R.id.b1);
        b2 = v_rozen_second.findViewById(R.id.b2);
        b3 = v_rozen_second.findViewById(R.id.b3);
        b4 = v_rozen_second.findViewById(R.id.b4);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    thirdQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    thirdQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    thirdQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    thirdQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void thirdQu() {
        View v_rozen_third = getLayoutInflater().inflate(R.layout.rozen_third, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_third);
        Button next = v_rozen_third.findViewById(R.id.btnNextThirdR);
        b1 = v_rozen_third.findViewById(R.id.b1);
        b2 = v_rozen_third.findViewById(R.id.b2);
        b3 = v_rozen_third.findViewById(R.id.b3);
        b4 = v_rozen_third.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    forthQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    forthQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    forthQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    forthQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void forthQu() {
        View v_rozen_forth = getLayoutInflater().inflate(R.layout.rozen_forth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_forth);
        Button next = v_rozen_forth.findViewById(R.id.btnNextForthR);
        b1 = v_rozen_forth.findViewById(R.id.b1);
        b2 = v_rozen_forth.findViewById(R.id.b2);
        b3 = v_rozen_forth.findViewById(R.id.b3);
        b4 = v_rozen_forth.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    fifthQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    fifthQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    fifthQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    fifthQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void fifthQu() {
        View v_rozen_fifth = getLayoutInflater().inflate(R.layout.rozen_fifth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_fifth);
        Button next = v_rozen_fifth.findViewById(R.id.btnNextFifthR);
        b1 = v_rozen_fifth.findViewById(R.id.b1);
        b2 = v_rozen_fifth.findViewById(R.id.b2);
        b3 = v_rozen_fifth.findViewById(R.id.b3);
        b4 = v_rozen_fifth.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    sixthQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    sixthQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    sixthQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    sixthQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void sixthQu() {
        View v_rozen_sixth = getLayoutInflater().inflate(R.layout.rozen_sixth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_sixth);
        Button next = v_rozen_sixth.findViewById(R.id.btnNextSixthR);
        b1 = v_rozen_sixth.findViewById(R.id.b1);
        b2 = v_rozen_sixth.findViewById(R.id.b2);
        b3 = v_rozen_sixth.findViewById(R.id.b3);
        b4 = v_rozen_sixth.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    seventhQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    seventhQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    seventhQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    seventhQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void seventhQu() {
        View v_rozen_seventh = getLayoutInflater().inflate(R.layout.rozen_seventh, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_seventh);
        Button next = v_rozen_seventh.findViewById(R.id.btnNextSeventhR);
        b1 = v_rozen_seventh.findViewById(R.id.b1);
        b2 = v_rozen_seventh.findViewById(R.id.b2);
        b3 = v_rozen_seventh.findViewById(R.id.b3);
        b4 = v_rozen_seventh.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    eighthQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    eighthQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    eighthQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    eighthQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void eighthQu() {
        View v_rozen_eighth = getLayoutInflater().inflate(R.layout.rozen_eighth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_eighth);
        Button next = v_rozen_eighth.findViewById(R.id.btnNextEighthR);
        b1 = v_rozen_eighth.findViewById(R.id.b1);
        b2 = v_rozen_eighth.findViewById(R.id.b2);
        b3 = v_rozen_eighth.findViewById(R.id.b3);
        b4 = v_rozen_eighth.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    ninthQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    ninthQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    ninthQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    ninthQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void ninthQu() {
        View v_rozen_nineth = getLayoutInflater().inflate(R.layout.rozen_ninth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_nineth);
        Button next = v_rozen_nineth.findViewById(R.id.btnNextNinthR);
        b1 = v_rozen_nineth.findViewById(R.id.b1);
        b2 = v_rozen_nineth.findViewById(R.id.b2);
        b3 = v_rozen_nineth.findViewById(R.id.b3);
        b4 = v_rozen_nineth.findViewById(R.id.b4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    tenthQu();
                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    tenthQu();
                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    tenthQu();
                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    tenthQu();
                }
            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void tenthQu() {
        View v_rozen_tenth = getLayoutInflater().inflate(R.layout.rozen_tenth, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setView(v_rozen_tenth);
        Button next = v_rozen_tenth.findViewById(R.id.btnNextTenthR);
        b1 = v_rozen_tenth.findViewById(R.id.b1);
        b2 = v_rozen_tenth.findViewById(R.id.b2);
        b3 = v_rozen_tenth.findViewById(R.id.b3);
        b4 = v_rozen_tenth.findViewById(R.id.b4);
        next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (!b1.isChecked() && !b2.isChecked() && !b3.isChecked() && !b4.isChecked()) {
                    Toast.makeText(FirstActivity.this, "لطفا به سوال پاسخ دهید", Toast.LENGTH_SHORT).show();
                } else if (b1.isChecked() && b1.getText().toString().trim().equals("کاملا درست")) {
                    sum1 += 3;
                    res1(sum1);
                    sum1 = 0;

                } else if (b2.isChecked() && b2.getText().toString().trim().equals("درست")) {
                    sum1 += 2;
                    res1(sum1);
                    sum1 = 0;

                } else if (b3.isChecked() && b3.getText().toString().trim().equals("این طور نیست")) {
                    sum1 += 1;
                    res1(sum1);
                    sum1 = 0;


                } else if (b4.isChecked() && b4.getText().toString().trim().equals("اصلا اینطور نیست")) {
                    sum1 += 0;
                    res1(sum1);
                    sum1 = 0;

                }


            }
        });
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }

    public void res1(int s) {
        flag = 2;
        View v_rozen_res = getLayoutInflater().inflate(R.layout.rozen_res, null);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(FirstActivity.this);
        builder1.setView(v_rozen_res);
        TextView txtResult = v_rozen_res.findViewById(R.id.txtResult1);
        TextView txt = v_rozen_res.findViewById(R.id.txt1);
        btnOffer2 = v_rozen_res.findViewById(R.id.btnOffer2);
        if (s >= 26 && s <= 30) {
            txt.setText("امتیاز شما " + s + " است. ");
            btnOffer2.setText("راه های حفظ اعتماد به نفس");
            txtResult.setText("این عدد نشان می دهد که اعتماد به نفس خوبی دارید و به موانع اجازه نمی دهید بر برداشتتان از اتفاقات اثر بگذارد.");
        } else if (s >= 15 && s <= 25) {
            txt.setText("امتیاز شما " + s + " است. ");
            btnOffer2.setText("راه های بهبود اعتماد به نفس");
            txtResult.setText("این عدد نشان می دهد که اعتماد به نفستان خوب است ولی باید چگونگی بهبود آن را بیاموزید و به مهارتهای خود ایمان بیاورید.");
        } else if (s <= 15) {
            txt.setText("امتیاز شما " + s + " است. ");
            btnOffer2.setText("راه های افزایش اعتماد به نفس");
            txtResult.setText("این عدد نشان می دهد که باید از تکنیک های افزایش اعتماد به نفس استفاده کنید و وقت بیشتری را به خود اختصاص دهید.");
        }
        alertDialog1 = builder1.create();
        alertDialog1.show();
    }


    public void backVoid(View view) {
        View v_ratos_res = getLayoutInflater().inflate(R.layout.ratos_res, null);
        btnBack = v_ratos_res.findViewById(R.id.btnBack);
        Intent intent = new Intent(v_ratos_res.getContext() , FirstActivity.class);
        startActivity(intent);
        finish();
    }

    public void offerVoid(View view) {
        if (btnOffer.getText().equals("راه های پرورش اعتماد به نفس")) {
            Intent intent = new Intent(this, AfzayeshActivity.class);
            startActivity(intent);
        }
        if (btnOffer.getText().equals("راه های تقویت اعتماد به نفس")){
            Intent intent = new Intent(this, BehbodActivity.class);
            startActivity(intent);
        }
        if (btnOffer.getText().equals("راه های حفظ اعتماد به نفس")){
            Intent intent = new Intent(this, OfferActivity.class);
            startActivity(intent);
        }

    }

    public void offerVoid1(View view) {
        if (btnOffer2.getText().equals("راه های افزایش اعتماد به نفس")) {
            Intent intent = new Intent(this, AfzayeshActivity.class);
            startActivity(intent);
        }
        if (btnOffer2.getText().equals("راه های بهبود اعتماد به نفس")){
            Intent intent = new Intent(this, BehbodActivity.class);
            startActivity(intent);
        }if (btnOffer2.getText().equals("راه های حفظ اعتماد به نفس")){
            Intent intent = new Intent(this, OfferActivity.class);
            startActivity(intent);
        }

    }

    public void backVoid1(View view) {
        View v_rozen_res = getLayoutInflater().inflate(R.layout.rozen_res, null);
        btnBack1 = v_rozen_res.findViewById(R.id.btnBack1);
        Intent intent = new Intent(v_rozen_res.getContext() , FirstActivity.class);
        startActivity(intent);
        finish();
    }

}