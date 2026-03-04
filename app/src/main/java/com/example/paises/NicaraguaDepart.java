package com.example.paises;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class NicaraguaDepart extends  AppCompatActivity{
    ListView nicaDepart;
    Button btnRegresar, btnSalir;

    String[] valores = new String[]{
            "Boaco", "Carazo", "Chinandega",
            "Chontales", "Estelí", "Granada", "Jinotega",
            "León", "Madriz", "Managua",
            "Masaya", "Matagalpa", "Nueva Segovia", "Río San Juan","Rivas"
    };

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nicaragua_departamentos);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnSalir = findViewById(R.id.btnSalir);

        nicaDepart = findViewById(R.id.lsvDepartamentos);

        ArrayAdapter<String> adapter5;
        adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        nicaDepart.setAdapter(adapter5);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}