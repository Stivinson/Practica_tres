package com.stivinsonmartinez.punto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import javax.crypto.NullCipher;


public class MainActivity extends AppCompatActivity {
    int op1;
    int op2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText NUM1=(EditText) findViewById(R.id.eNumero1);
        final EditText NUM2=(EditText) findViewById(R.id.eNumero2);
        final TextView resul=(TextView) findViewById(R.id.tresul);
        Button calcular=(Button) findViewById(R.id.bBoton);
        RadioGroup calculadora=(RadioGroup) findViewById(R.id.rdgGrupo);
        final RadioButton suma,resta,mul,div;

        suma=(RadioButton)findViewById(R.id.rdbuno);
        resta=(RadioButton)findViewById(R.id.rdbdos);
        mul=(RadioButton)findViewById(R.id.rdbtres);
        div=(RadioButton)findViewById(R.id.rdbcuatro);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1, numero2, resultado;
                op1=NUM1.getText().toString().compareTo("");
                op2=NUM2.getText().toString().compareTo("");
                if(op1==0 || op2==0){
                    numero1=0;
                    numero2=0;
                    resul.setText("Operacion invalida");
                } else {
                    numero1 = Double.parseDouble(NUM1.getText().toString());
                    numero2 = Double.parseDouble(NUM2.getText().toString());

                    if (suma.isChecked() == true) {
                        resultado = numero1 + numero2;
                        resul.setText(String.valueOf(resultado));
                    } else if (resta.isChecked() == true) {
                        resultado = numero1 - numero2;
                        resul.setText(String.valueOf(resultado));
                    } else if (mul.isChecked() == true) {
                        resultado = numero1 * numero2;
                        resul.setText(String.valueOf(resultado));
                    } else if (div.isChecked() == true) {
                        resultado = numero1 / numero2;
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
