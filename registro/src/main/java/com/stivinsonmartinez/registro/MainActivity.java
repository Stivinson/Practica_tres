package com.stivinsonmartinez.registro;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView tvDisplayDate;
    private DatePicker dpResult;
    private Button btnChangeDate;

    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;

    static final int DATE_DIALOG_ID = 999;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nombre = (EditText) findViewById(R.id.eNombre);
        final EditText apellido = (EditText) findViewById(R.id.eApellido);
        final EditText cedula = (EditText) findViewById(R.id.eCC);
        final TextView dato=(TextView) findViewById(R.id.tDato);
        final TextView name=(TextView) findViewById(R.id.tNombre);
        final TextView lastname=(TextView) findViewById(R.id.tApellido);
        final TextView cc=(TextView) findViewById(R.id.tCC);
        final TextView sexo=(TextView) findViewById(R.id.tSexo);
        final TextView fecha=(TextView) findViewById(R.id.tDate);
        final TextView hobbies1=(TextView) findViewById(R.id.tHobbies1);
        final TextView hobbies2=(TextView) findViewById(R.id.tHobbies2);
        final TextView hobbies3=(TextView) findViewById(R.id.tHobbies3);
        final TextView hobbies4=(TextView) findViewById(R.id.tHobbies4);
        final TextView ciudad=(TextView) findViewById(R.id.tciudad);
        final CheckBox musica=(CheckBox) findViewById(R.id.cMusica);
        final CheckBox deportes=(CheckBox) findViewById(R.id.cDeportes);
        final CheckBox video=(CheckBox) findViewById(R.id.cVideo);
        final CheckBox cine=(CheckBox) findViewById(R.id.cCine);
        Button Datos=(Button) findViewById(R.id.bDate);
        RadioGroup genero = (RadioGroup) findViewById(R.id.rdgGrupo);
        final RadioButton mujer, hombre;
        mujer = (RadioButton) findViewById(R.id.rdF);
        hombre = (RadioButton) findViewById(R.id.rdM);
        final Spinner lugar=(Spinner) findViewById(R.id.sp_ciudades);

        final DatePicker date=(DatePicker) findViewById(R.id.datePicker);
        Datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int op1,op2,op3;
                double numero1, numero2, resultado;
                String Nom,Ape;
                op1=nombre.getText().toString().compareTo("");
                op2=apellido.getText().toString().compareTo("");
                op3=cedula.getText().toString().compareTo("");
                day=date.getDayOfMonth();
                month=date.getMonth();
                year=date.getYear();
                hobbies1.setText("");
                hobbies2.setText("");
                hobbies3.setText("");
                hobbies4.setText("");
                if(op1==0 || op2==0 || op3==0){
                    numero1=0;
                    numero2=0;
                    dato.setText("Llenar los espacios vacios");
                } else {
                        dato.setText("Datos Personales");
                        name.setText(nombre.getText());
                        lastname.setText(apellido.getText());
                    cc.setText(cedula.getText());
                        if(mujer.isChecked()==true){
                           sexo.setText("Femenino");
                        }else if(hombre.isChecked()==true){
                            sexo.setText("Hombre");
                        }else sexo.setText(" ");

                    fecha.setText(new StringBuilder()
                            .append(day).append("/")
                            .append(month + 1).append("/")
                            .append(year));
                    ciudad.setText(lugar.getSelectedItem().toString());
                     if(deportes.isChecked()==true){
                             hobbies1.setText("Deportes");
                                if(musica.isChecked()==true){
                                    hobbies2.setText("Musica");
                                    if(cine.isChecked()==true){
                                        hobbies3.setText("Ir a Cine");
                                        if (video.isChecked() == true) {
                                            hobbies4.setText("Video Juegos");
                                        } else hobbies4.setText("");
                                    }else if(video.isChecked()==true) {
                                        hobbies3.setText("Video Juegos");
                                    }else hobbies3.setText(" ");
                                }else if(cine.isChecked()==true){
                                    hobbies2.setText("Ir a Cine");
                                    if(video.isChecked()==true){
                                        hobbies3.setText("Video Juegos");
                                    }else hobbies3.setText("");
                                }else if(video.isChecked()==true){
                                        hobbies2.setText("Video Juegos");
                                }else hobbies2.setText("");
                     }else if(musica.isChecked()==true){
                                hobbies1.setText("Musica");
                                if(cine.isChecked()==true){
                                    hobbies2.setText("Ir a Cine");
                                    if(video.isChecked()==true){
                                        hobbies3.setText("Video Juegos");
                                    }else hobbies3.setText("");
                                }else if(video.isChecked()==true){
                                    hobbies2.setText("Video Juegos");
                                }else  hobbies2.setText("");
                     }else if(cine.isChecked()==true){
                                hobbies1.setText("Ir a cine");
                                if(video.isChecked()==true){
                                    hobbies2.setText("Video Juegos");
                                }else hobbies2.setText("");
                    }else if(video.isChecked()==true){
                            hobbies1.setText("Video Juegos");
                    }else hobbies1.setText("");
                }
            }
        });


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
