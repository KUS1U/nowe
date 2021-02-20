package com.kusiu.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btnPlus, btnMinus, btnMnozenie, btnDzielenie, btnEnter, btnClear;
    TextView txtPodglad;

    int firstNumber, secondNumber;
    String Akcja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnDot = findViewById(R.id.btn_dot);
        btnPlus = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_minus);
        btnMnozenie = findViewById(R.id.btn_mnozenie);
        btnDzielenie = findViewById(R.id.btn_dzielenie);
        btnEnter = findViewById(R.id.btn_enter);
        btnClear = findViewById(R.id.btn_cut);
        txtPodglad = findViewById(R.id.txt_out);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + ".");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "-");
            }
        });

        btnMnozenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "x");
            }
        });

        btnDzielenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText(txtPodglad.getText() + "/");
            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wynik = txtPodglad.getText().toString();
                if(wynik.contains("/")) {
                    String[] splitNumber = wynik.split("/");
                    System.out.println("SplitNumber - " + splitNumber[0]);
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtPodglad.setText(String.valueOf(dzielenie(firstNumber, secondNumber)));
                } else if(wynik.contains("x")) {
                    String[] splitNumber = wynik.split("x");
                    System.out.println("SplitNumber - " + splitNumber[0]);
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtPodglad.setText(String.valueOf(mnozenie(firstNumber, secondNumber)));
                }  else if(wynik.contains("-")) {
                    String[] splitNumber = wynik.split("-");
                    System.out.println("SplitNumber - " + splitNumber[0]);
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtPodglad.setText(String.valueOf(odejmowanie(firstNumber, secondNumber)));
                }else if(wynik.contains("+")) {
                    String[] splitNumber = wynik.split("\\+");
                    System.out.println("SplitNumber - " + splitNumber[0]);
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    txtPodglad.setText(String.valueOf(dodawanie(firstNumber, secondNumber)));
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPodglad.setText("");
            }
        });

    }
        double dodawanie(double a, double b){
            return a + b;
        }
        double odejmowanie(double a, double b){
            return a - b;
        }
        double mnozenie(double a, double b){
            return a * b;
        }
        double dzielenie(double a, double b){
            return a / b;
        }

    }

