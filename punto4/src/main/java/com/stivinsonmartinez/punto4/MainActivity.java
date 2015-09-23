package com.stivinsonmartinez.punto4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int op1;
    int op2;
    int op3;
    int op4;

    private EditText  base,altura,radio,lado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        base = (EditText) findViewById(R.id.eBase);
        altura = (EditText) findViewById(R.id.eAltura);
        radio = (EditText) findViewById(R.id.eRadio);
        lado = (EditText) findViewById(R.id.eLado);
        final TextView resul = (TextView) findViewById(R.id.tresul);
        Button calcular = (Button) findViewById(R.id.bBoton);
        final RadioButton tri, rec, rad, cua;
        tri = (RadioButton) findViewById(R.id.rdbuno);
        rec = (RadioButton) findViewById(R.id.rdbdos);
        rad = (RadioButton) findViewById(R.id.rdbtres);
        cua = (RadioButton) findViewById(R.id.rdbcuatro);
        base.setVisibility(View.INVISIBLE);
        altura.setVisibility(View.INVISIBLE);
        radio.setVisibility(View.INVISIBLE);
        lado.setVisibility(View.INVISIBLE);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1, numero2, resultado;
                if (tri.isChecked() == true) {
                    op1 = base.getText().toString().compareTo("");
                    op2 = altura.getText().toString().compareTo("");
                    if (op1 == 0 || op2 == 0) {
                        resul.setText("Invalida");
                    } else {
                        numero1 = Double.parseDouble(base.getText().toString());
                        numero2 = Double.parseDouble(altura.getText().toString());
                        resultado = (numero1 * numero2) / 2;
                        resul.setText(String.valueOf(resultado));
                    }

                } else if (rec.isChecked() == true) {
                    op1 = base.getText().toString().compareTo("");
                    op2 = altura.getText().toString().compareTo("");
                    if (op1 == 0 || op2 == 0) {
                        resul.setText("Invalida");
                    } else {
                        numero1 = Double.parseDouble(base.getText().toString());
                        numero2 = Double.parseDouble(altura.getText().toString());
                        resultado = (numero1 * numero2);
                        resul.setText(String.valueOf(resultado));
                    }
                } else if (rad.isChecked() == true) {
                    op1 = radio.getText().toString().compareTo("");
                    if (op1 == 0) {
                        resul.setText("Invalida");
                    } else {
                        numero1 = Double.parseDouble(radio.getText().toString());
                        resultado =Math.pow(numero1,2)*Math.PI;
                        resul.setText(String.valueOf(resultado));
                    }
                } else if (cua.isChecked() == true) {
                    op1 = lado.getText().toString().compareTo("");
                    if (op1 == 0) {
                        resul.setText("Invalida");
                    } else {
                        numero1 = Double.parseDouble(lado.getText().toString());

                        resultado = (numero1 * numero1);
                        resul.setText(String.valueOf(resultado));

                    }
                }
                base.setText("");
                altura.setText("");
                radio.setText("");
                lado.setText("");

            }
        });
    }
    public void onRadioButtonClicked(View view)  {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rdbuno:
                if (checked) {
                    base.setVisibility(View.VISIBLE);
                    altura.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    lado.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.rdbdos:
                if (checked) {
                    base.setVisibility(View.VISIBLE);
                    altura.setVisibility(View.VISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    lado.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.rdbtres:
                if (checked) {
                    base.setVisibility(View.INVISIBLE);
                    altura.setVisibility(View.INVISIBLE);
                    radio.setVisibility(View.VISIBLE);
                    lado.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.rdbcuatro:
                if (checked) {
                    base.setVisibility(View.INVISIBLE);
                    altura.setVisibility(View.INVISIBLE);
                    radio.setVisibility(View.INVISIBLE);
                    lado.setVisibility(View.VISIBLE);
                }
                break;
            default:
                break;
        }
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
