package com.example.javi.tarea_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    EditText etClave;
    TextView info;
    Button botonValida;
    int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText)findViewById(R.id.etNombre);
        etClave=(EditText)findViewById(R.id.etClave);
        info=(TextView)findViewById(R.id.intentos);
        botonValida=(Button) findViewById(R.id.btnLogin);

        botonValida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar(etNombre.getText().toString(),etClave.getText().toString());
            }
        });
    }

    private void validar(String use,String pin) {

        etNombre.setError(null);
        etClave.setError(null);

        String nombre=etNombre.getText().toString();
        String clave=etClave.getText().toString();

        if(TextUtils.isEmpty(nombre)){
            etNombre.setError(getString(R.string.error_campo_obligatorio));
            etNombre.requestFocus();
            return;

    }

        if(TextUtils.isEmpty(clave)){
            etClave.setError(getString(R.string.error_campo_obligatorio));
            etClave.requestFocus();
            return;

        }
        if((use.equals("javi"))&&(pin.equals("1234"))){
            Intent intent=new Intent(MainActivity.this,Actividad_2.class);
            startActivity(intent);
        }else {
            counter--;
            info.setText("Nº de intentos restantes " +String.valueOf(counter));
            if(counter==0){
                botonValida.setEnabled(false);

            }
        }

}
}