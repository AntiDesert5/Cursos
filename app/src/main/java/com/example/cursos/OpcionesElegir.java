package com.example.cursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpcionesElegir extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_elegir);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.editDat):
                Intent intent = new Intent(OpcionesElegir.this,RegistrarDatos.class);
                startActivity(intent);
                break;
            case (R.id.impCons):
                Intent intent2 = new Intent(OpcionesElegir.this,RegistrarDatos.class);
                startActivity(intent2);
                break;
        }
    }
}
