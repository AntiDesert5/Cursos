package com.example.cursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesElegir extends AppCompatActivity implements View.OnClickListener {
private Button editdat,impcons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_elegir);
        editdat=(Button)findViewById(R.id.editDat);
        impcons=(Button)findViewById(R.id.impCons);
        editdat.setOnClickListener(this);
        impcons.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.editDat):
                Intent intent = new Intent(OpcionesElegir.this, ActualizarDatos.class);
                startActivity(intent);
                finish();
                break;
            case (R.id.impCons):
                Intent intent2 = new Intent(OpcionesElegir.this, Constancia.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
