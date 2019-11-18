package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridlayoutActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnsub, btnmul, btndiv, btnequal, btndot, btnback;
    EditText etview;
    boolean add, sub, mul, div;
    int first , second, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);

        this.btn0 = findViewById(R.id.btn0);
        this.btn1 = findViewById(R.id.btn1);
        this.btn2 = findViewById(R.id.btn2);
        this.btn3 = findViewById(R.id.btn3);
        this.btn4 = findViewById(R.id.btn4);
        this.btn5 = findViewById(R.id.btn5);
        this.btn6 = findViewById(R.id.btn6);
        this.btn7 = findViewById(R.id.btn7);
        this.btn8 = findViewById(R.id.btn8);
        this.btn9 = findViewById(R.id.btn9);
        this.btnadd = findViewById(R.id.btnadd);
        this.btnsub = findViewById(R.id.btnsub);
        this.btnmul = findViewById(R.id.btnmul);
        this.btndiv = findViewById(R.id.btndiv);
        this.btndot = findViewById(R.id.btndot);
        this.btnequal = findViewById(R.id.btnequal);
        this.etview = findViewById(R.id.etview);
        this.btnback = findViewById(R.id.btnback);

        this.btn0.setOnClickListener(this);
        this.btn1.setOnClickListener(this);
        this.btn2.setOnClickListener(this);
        this.btn3.setOnClickListener(this);
        this.btn4.setOnClickListener(this);
        this.btn5.setOnClickListener(this);
        this.btn6.setOnClickListener(this);
        this.btn7.setOnClickListener(this);
        this.btn8.setOnClickListener(this);
        this.btn9.setOnClickListener(this);
        this.btnadd.setOnClickListener(this);
        this.btnsub.setOnClickListener(this);
        this.btnmul.setOnClickListener(this);
        this.btndiv.setOnClickListener(this);
        this.btndot.setOnClickListener(this);
        this.btnequal.setOnClickListener(this);
        this.btnback.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn0:
                etview.setText(etview.getText() + "0");
                break;
            case R.id.btn1:
                etview.setText(etview.getText() + "1");
                break;
            case R.id.btn2:
                etview.setText(etview.getText() + "2");
                break;
            case R.id.btn3:
                etview.setText(etview.getText() + "3");
                break;
            case R.id.btn4:
                etview.setText(etview.getText() + "4");
                break;
            case R.id.btn5:
                etview.setText(etview.getText() + "5");
                break;
            case R.id.btn6:
                etview.setText(etview.getText() + "6");
                break;
            case R.id.btn7:
                etview.setText(etview.getText() + "7");
                break;
            case R.id.btn8:
                etview.setText(etview.getText() + "8");
                break;
            case R.id.btn9:
                etview.setText(etview.getText() + "9");
                break;

            case R.id.btndot:
                etview.setText(etview.getText() + ".");;
                break;



        }
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etview.getText().toString());
                add = true;
                etview.setText(null);
            }

        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etview.getText().toString());
                sub = true;
                etview.setText(null);
            }

        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etview.getText().toString());
                mul = true;
                etview.setText(null);
            }

        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(etview.getText().toString());
                div = true;
                etview.setText(null);
            }

        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Integer.parseInt(etview.getText().toString());
                if(add == true) {
                    result = first + second;
                    etview.setText(String.valueOf(result));
                    add = false;
                }
                else if(sub == true) {
                    result = first - second;
                    etview.setText(String.valueOf(result));
                    sub = false;
                }
                else if(mul == true) {
                    result = first * second;
                    etview.setText(String.valueOf(result));
                    mul = false;
                }
                else if(div == true) {
                    result = first / second;
                    etview.setText(String.valueOf(result));
                    div = false;
                }
            }
        });



    }
}
