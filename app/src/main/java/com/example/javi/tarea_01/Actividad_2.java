package com.example.javi.tarea_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_2);
        Button btnContinuar=(Button)findViewById(R.id.btnContinuar) ;



        Button btnAtras=(Button)findViewById(R.id.btnAtras);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Actividad_2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Actividad_2.this,Actividad_3.class);
                startActivity(intent);

            }
        });
    }
}
