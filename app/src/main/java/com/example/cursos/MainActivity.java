package com.example.cursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button nuevousuario,iniciosesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nuevousuario=(Button)findViewById(R.id.nuevouser);
        iniciosesion=(Button)findViewById(R.id.iniciosesion);

        nuevousuario.setOnClickListener(this);
        iniciosesion.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.nuevouser):
                Intent intent = new Intent(MainActivity.this,RegistrarDatos.class);
                startActivity(intent);
                break;
            case (R.id.iniciosesion):
                Intent intent2 = new Intent(MainActivity.this,OpcionesElegir.class);
                startActivity(intent2);
                break;
        }
    }
}
