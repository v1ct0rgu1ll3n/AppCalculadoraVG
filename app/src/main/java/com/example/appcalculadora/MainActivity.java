package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtresultado;

    float numero1 = 0.0f;
    float numero2 = 0.0f;

    String operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtresultado = findViewById(R.id.txtresultado);
    }

    public void DigitarCero(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("0");
        }else{
            txtresultado.setText(txtresultado.getText()+"0");
        }
    }
    public void DigitarUno(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("1");
        }else{
            txtresultado.setText(txtresultado.getText()+"1");
        }
    }

    public void DigitarDos(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("2");
        }else{
            txtresultado.setText(txtresultado.getText()+"2");
        }

    }

    public void DigitarTres(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("3");
        }else{
            txtresultado.setText(txtresultado.getText()+"3");
        }

    }

    public void DigitarCuatro(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("4");
        }else{
            txtresultado.setText(txtresultado.getText()+"4");
        }

    }

    public void DigitarCinco(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("5");
        }else{
            txtresultado.setText(txtresultado.getText()+"5");
        }

    }

    public void DigitarSeis(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("6");
        }else{
            txtresultado.setText(txtresultado.getText()+"6");
        }

    }

    public void DigitarSiete(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("7");
             }else{
            txtresultado.setText(txtresultado.getText()+"7");
            }

    }

    public void DigitarOcho(View view) {

        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("8");
        }else{
            txtresultado.setText(txtresultado.getText()+"8");
        }

    }

    public void DigitarNueve(View view) {
        float valor = Float.parseFloat(txtresultado.getText().toString());
        if (valor == 0.0f){
            txtresultado.setText("9");
        }else{
            txtresultado.setText(txtresultado.getText()+"9");
        }
    }


    public void LimpiarResultado(View view) {
        txtresultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }

    public void Dividir(View view) {
        numero1 = Float.parseFloat(txtresultado.getText().toString());
        operacion="/";
        txtresultado.setText("0");
    }

    public void Multiplicacion(View view) {
        numero1 = Float.parseFloat(txtresultado.getText().toString());
        operacion="*";
        txtresultado.setText("0");
    }

    public void Sumar(View view) {
        numero1 = Float.parseFloat(txtresultado.getText().toString());
        operacion="+";
        txtresultado.setText("0");
    }

    public void Restar(View view) {
        numero1 = Float.parseFloat(txtresultado.getText().toString());
        operacion="-";
        txtresultado.setText("0");
    }


    public void Igual(View view) {

        numero2 = Float.parseFloat(txtresultado.getText().toString());

        if (operacion.equals("/")){

            if (numero2==0.0f){
                txtresultado.setText("0");
                Toast.makeText(this,"Operación no valida",Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 / numero2;
                txtresultado.setText(result + "");
            }

        }else if(operacion.equals("*")){

            if (numero2==0.0f){
                txtresultado.setText("0");
                Toast.makeText(this,"Operación no valida",Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 * numero2;
                txtresultado.setText(result + "");
            }

        } else if (operacion.equals("+")){

            if (numero2==0.0f){
                txtresultado.setText("0");
                Toast.makeText(this,"Operación no valida",Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 + numero2;
                txtresultado.setText(result + "");
            }

        }else if (operacion.equals("-")){

            if (numero2==0.0f){
                txtresultado.setText("0");
                Toast.makeText(this,"Operación no valida",Toast.LENGTH_LONG).show();
            }else{
                float result = numero1 - numero2;
                txtresultado.setText(result + "");
            }

        }

        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }



}
