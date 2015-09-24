package com.stivinsonmartinez.punto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int op1;
    int op2;
    int op3;
    int op4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText NUM1=(EditText) findViewById(R.id.eQuices);
        final EditText NUM2=(EditText) findViewById(R.id.eExp);
        final EditText NUM3=(EditText) findViewById(R.id.eLab);
        final EditText NUM4=(EditText) findViewById(R.id.ePro);
        final TextView resul=(TextView) findViewById(R.id.tresul);
        Button calcular=(Button) findViewById(R.id.bBoton);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1, numero2,numero3,numero4,resultado;
                op1=NUM1.getText().toString().compareTo("");
                op2=NUM2.getText().toString().compareTo("");
                op3=NUM3.getText().toString().compareTo("");
                op4=NUM4.getText().toString().compareTo("");
                if(op1==0 || op2==0 || op3==0 || op4==0) {
                    numero1=0;
                    numero2=0;
                    numero3=0;
                    numero4=0;
                    resul.setText("Operacion invalida");
                }else{
                    numero1 = Double.parseDouble(NUM1.getText().toString());
                    numero2 = Double.parseDouble(NUM2.getText().toString());
                    numero3 = Double.parseDouble(NUM3.getText().toString());
                    numero4 = Double.parseDouble(NUM4.getText().toString());
                    if(numero1>5 || numero2>5 || numero3>5 || numero4>5){
                        resul.setText("Numeros Invalidos");
                    }else {
                        resultado = (numero1 * 0.15) + (numero2 * 0.1) + (numero3 * 0.4) + (numero4 * 0.35);
                        resul.setText(String.valueOf(resultado));
                    }
                }
        }
    });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
