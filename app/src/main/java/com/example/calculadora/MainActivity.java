package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Variables
    private String numIngresado = "";
    private String operacion = "";
    private double num1=0;
    private double num2=0;
    private TextView solucion;
    private Button key_Pad0,key_Pad1,key_Pad2,key_Pad3,key_Pad4,key_Pad5,key_Pad6,key_Pad7,key_Pad8,key_Pad9;
    private Button key_Padsuma,key_Padsustraccion,key_Padmultiplicacion,key_Paddivision,key_Padigual,key_Padclean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solucion = findViewById(R.id.solucion);
        key_Pad0 = findViewById(R.id.num_cero);
        key_Pad1 = findViewById(R.id.num_uno);
        key_Pad2 = findViewById(R.id.num_dos);
        key_Pad3 = findViewById(R.id.num_tres);
        key_Pad4 = findViewById(R.id.num_cuatro);
        key_Pad5 = findViewById(R.id.num_cinco);
        key_Pad6 = findViewById(R.id.num_seis);
        key_Pad7 = findViewById(R.id.num_siete);
        key_Pad8 = findViewById(R.id.num_ocho);
        key_Pad9 = findViewById(R.id.num_nueve);
        key_Padsuma = findViewById(R.id.suma);
        key_Padsustraccion = findViewById(R.id.sustraccion);
        key_Padmultiplicacion = findViewById(R.id.multiplicacion);
        key_Paddivision = findViewById(R.id.division);
        key_Padigual = findViewById(R.id.igual);
        key_Padclean = findViewById(R.id.clean);

        //Seter listener (Llamada o Click en boton)
        key_Pad0.setOnClickListener(this);
        key_Pad1.setOnClickListener(this);
        key_Pad2.setOnClickListener(this);
        key_Pad3.setOnClickListener(this);
        key_Pad4.setOnClickListener(this);
        key_Pad5.setOnClickListener(this);;
        key_Pad6.setOnClickListener(this);
        key_Pad7.setOnClickListener(this);
        key_Pad8.setOnClickListener(this);
        key_Pad9.setOnClickListener(this);
        key_Padsuma.setOnClickListener(this);
        key_Padsustraccion.setOnClickListener(this);
        key_Padmultiplicacion.setOnClickListener(this);
        key_Paddivision.setOnClickListener(this);
        key_Padigual.setOnClickListener(this);
        key_Padclean.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.num_cero:
            numIngresado = numIngresado + "0";
            solucion.setText(numIngresado);
                break;

            case R.id.num_uno:
                numIngresado = numIngresado + "1";
                solucion.setText(numIngresado);
                break;

            case R.id.num_dos:
                numIngresado = numIngresado + "2";
                solucion.setText(numIngresado);
                break;

            case R.id.num_tres:
                numIngresado = numIngresado + "3";
                solucion.setText(numIngresado);
                break;

            case R.id.num_cuatro:
                numIngresado = numIngresado + "4";
                solucion.setText(numIngresado);
                break;

            case R.id.num_cinco:
                numIngresado = numIngresado + "5";
                solucion.setText(numIngresado);
                break;

            case R.id.num_seis:
                numIngresado = numIngresado + "6";
                solucion.setText(numIngresado);
                break;

            case R.id.num_siete:
                numIngresado = numIngresado + "7";
                solucion.setText(numIngresado);
                break;

            case R.id.num_ocho:
                numIngresado = numIngresado + "8";
                solucion.setText(numIngresado);
                break;

            case R.id.num_nueve:
                numIngresado = numIngresado + "9";
                solucion.setText(numIngresado);
                break;

            case R.id.suma:
                operacion = "+";
                num1 = Integer.parseInt(numIngresado);
                numIngresado = "";
                break;

            case R.id.sustraccion:
                operacion = "-";
                num1 = Integer.parseInt(numIngresado);
                numIngresado = "";
                break;

            case R.id.multiplicacion:
                operacion = "x";
                num1 = Integer.parseInt(numIngresado);
                numIngresado = "";
                break;

            case R.id.division:
                operacion = "/";
                num1 = Integer.parseInt(numIngresado);
                numIngresado = "";
                break;

            case R.id.clean:
                operacion ="";
                numIngresado = "";
                num1=0;
                num2=0;
                solucion.setText("0");
                break;

            case R.id.igual:
                num2 = Integer.parseInt(numIngresado);

                switch (operacion)
                {
                    case "+":
                        solucion.setText(" " + (num1+num2));
                        break;
                    case "-":
                        solucion.setText(" " + (num1-num2));
                        break;
                    case "x":
                        solucion.setText(" " + (num1*num2));
                        break;
                    case "/":
                        solucion.setText(" " + (num1/num2));
                        break;
                }
                numIngresado="";
                num1=0;
                num2=0;




        }

    }
}