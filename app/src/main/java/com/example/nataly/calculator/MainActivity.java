package com.example.nataly.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean punto = false;
    boolean suma = false;
    boolean resta = false;
    boolean mult= false;
    boolean div = false;
    double[] numero = new double[10];
    double resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0= (Button)findViewById(R.id.button0);
        btn0.setOnClickListener(this);

        Button btn1= (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        Button btn2= (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        Button btn3= (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        Button btn4= (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(this);

        Button btn5= (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(this);

        Button btn6= (Button)findViewById(R.id.button6);
        btn6.setOnClickListener(this);

        Button btn7= (Button)findViewById(R.id.button7);
        btn7.setOnClickListener(this);

        Button btn8= (Button)findViewById(R.id.button8);
        btn8.setOnClickListener(this);

        Button btn9= (Button)findViewById(R.id.button9);
        btn9.setOnClickListener(this);

        Button sum = (Button)findViewById(R.id.button_suma);
        sum.setOnClickListener(this);

        Button rest = (Button)findViewById(R.id.button_resta);
        rest.setOnClickListener(this);

        Button mult = (Button)findViewById(R.id.button_mul);
        mult.setOnClickListener(this);

        Button div = (Button)findViewById(R.id.button_div);
        div.setOnClickListener(this);

        Button result = (Button)findViewById(R.id.button_result);
        result.setOnClickListener(this);

        Button ce = (Button)findViewById(R.id.button_ce);
        ce.setOnClickListener(this);

        Button point = (Button)findViewById(R.id.button_point);
        point.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        TextView result= (TextView)findViewById(R.id.textResult);
        int seleccion = v.getId();
        String x = result.getText().toString();

        try {
            switch (seleccion) {

                case R.id.button0:
                    result.setText(x + "0");
                    break;

                case R.id.button1:
                    result.setText(x + "1");
                    break;

                case R.id.button2:
                    result.setText(x + "2");
                    break;

                case R.id.button3:
                    result.setText(x + "3");
                    break;

                case R.id.button4:
                    result.setText(x + "4");
                    break;

                case R.id.button5:
                    result.setText(x + "5");
                    break;

                case R.id.button6:
                    result.setText(x + "6");
                    break;

                case R.id.button7:
                    result.setText(x + "7");
                    break;

                case R.id.button8:
                    result.setText(x + "8");
                    break;

                case R.id.button9:
                    result.setText(x + "9");
                    break;

                case R.id.button_suma:
                    suma = true;
                    numero[0] = Double.parseDouble(x);
                    result.setText("");
                    punto = false;
                    break;

                case R.id.button_resta:
                    resta = true;
                    numero[0] = Double.parseDouble(x);
                    result.setText("");
                    punto= false;
                    break;

                case R.id.button_mul:
                    mult = true;
                    numero[0] = Double.parseDouble(x);
                    result.setText("");
                    punto= false;
                    break;

                case R.id.button_div:
                    div = true;
                    numero[0] = Double.parseDouble(x);
                    result.setText("");
                    punto= false;
                    break;

                case R.id.button_point:
                    if (punto == false)
                    {
                        result.setText(x + ".");
                        punto = true;
                    }
                    else
                    {
                        return;
                    }
                    break;

                case R.id.button_ce:
                    result.setText("");
                    punto =false;
                    break;

                case R.id.button_result:
                    numero[1] = Double.parseDouble(x);
                        if (suma == true)
                        {
                            resultado = numero [0] + numero [1];
                            result.setText(String.valueOf(resultado));

                        }else if (resta== true){
                            resultado = numero [0] - numero [1];
                            result.setText(String.valueOf(resultado));

                        }else if (mult== true){
                            resultado = numero [0] * numero [1];
                            result.setText(String.valueOf(resultado));

                        }else if (div== true){
                            resultado = numero [0] / numero [1];
                            result.setText(String.valueOf(resultado));

                        }
                        punto = false;
                        suma = false;
                        resta = false;
                        mult = false;
                        div = false;
                    break;
            }
            }catch(Exception e){
                result.setText("error");
            };

        }
    }

