package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Calculate, Mode;
    private EditText et1, et2;
    private TextView et3;
    int i = 0;
    double a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        Calculate = (Button) findViewById(R.id.button2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (TextView) findViewById(R.id.et3);
        Mode = (Button) findViewById(R.id.bt4);

    }
        public void mode_select (View view)
        {
            try {

                i++;
                if (i == 1) {
                    add(view);
                    Mode.setText("MODE ADDITION");
                } else if (i == 2) {
                    sub(view);
                    Mode.setText("MODE SUBTRACTION");
                } else if (i == 3) {
                    mul(view);
                    Mode.setText("MODE MULTIPLICATION");
                } else {
                    div(view);
                    Mode.setText("MODE DIVISION");
                    i = 0;
                }
            } catch (Exception e) {
                Toast.makeText(this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
            }
        }

        public void add(View view)
        {
            et1.getText().toString();
            et2.getText().toString();
            double a1 = Double.valueOf(et1.getText().toString());
            double a2 = Double.valueOf(et2.getText().toString());
            a3 = a1 + a2;

        }
        public void sub(View view)
        {
            et1.getText().toString();
            et2.getText().toString();
            double a1 = Double.valueOf(et1.getText().toString());
            double a2 = Double.valueOf(et2.getText().toString());
            a3 = a1 - a2;

        }
        public void mul(View view)
        {
            et1.getText().toString();
            et2.getText().toString();
            double a1 = Double.valueOf(et1.getText().toString());
            double a2 = Double.valueOf(et2.getText().toString());
            a3 = a1 * a2;

        }
        public void div(View view)
        {
            et1.getText().toString();
            et2.getText().toString();
            double a1 = Double.valueOf(et1.getText().toString());
            double a2 = Double.valueOf(et2.getText().toString());
            a3 = a1 / a2;

        }



    public void disp(View view) throws Exception {
        try {
            et3.setText(Double.toString(a3));
        } catch (Exception e) {
            Toast.makeText(this, "Please Press Mode Button", Toast.LENGTH_SHORT).show();
        }
    }

  }
