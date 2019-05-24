package com.example.cursos;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Datos extends AppCompatActivity implements View.OnClickListener {
    private static final String PATH_MENSAJES = "Mensajes";

    @BindView(R.id.Nombre)
    AutoCompleteTextView Nombre;
    @BindView(R.id.ApPat)
    AutoCompleteTextView ApPat;
    @BindView(R.id.ApMat)
    AutoCompleteTextView ApMat;
    @BindView(R.id.centrouni)
    AutoCompleteTextView centrouni;
    @BindView(R.id.Emaildat)
    AutoCompleteTextView Emaildat;
    @BindView(R.id.Password)
    AutoCompleteTextView Password;
    @BindView(R.id.aceptar)
    Button aceptar;
    private static String PATH_USER ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        ButterKnife.bind(this);
        aceptar.setOnClickListener(this);
    }

    public List values(){
        List<String> Datos = new ArrayList<String>();
        Datos.add(Nombre.getText().toString());
        Datos.add(ApPat.getText().toString());
        return Datos;
    }

    public void conexion(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference= database.getReference(PATH_MENSAJES);
        reference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    @Override
    public void onClick(View v) {
        PATH_USER=Emaildat.getText().toString();
        switch (v.getId()) {
            case (R.id.aceptar):
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference reference= database.getReference(PATH_MENSAJES).child(PATH_USER);

                Toast.makeText(this, "Registro Creado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Datos.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
