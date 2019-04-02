package com.example.cursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Datos extends AppCompatActivity implements View.OnClickListener {
    private Button aceptar;
    private AutoCompleteTextView nombre,appat,apmat,email,contra,centrouni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        aceptar = (Button) findViewById(R.id.aceptar);
        nombre =(AutoCompleteTextView)findViewById(R.id.Nombre);
        appat =(AutoCompleteTextView)findViewById(R.id.ApPat);
        apmat =(AutoCompleteTextView)findViewById(R.id.ApMat);
        email =(AutoCompleteTextView)findViewById(R.id.Emaildat);
        contra =(AutoCompleteTextView)findViewById(R.id.Password);
        centrouni =(AutoCompleteTextView)findViewById(R.id.centrouni);
        aceptar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.aceptar):
                Toast.makeText(this, "Registro Creado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Datos.this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
