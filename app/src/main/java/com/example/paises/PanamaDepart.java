package com.example.paises;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class PanamaDepart extends AppCompatActivity {
    ListView panamaDepart;
    Button btnRegresar, btnSalir;

    String[] valores = new String[]{
            "Bocas del Toro", "Coclé", "Colón",
            "Chiriquí", "Darién", "Herrera",
            "Los Santos", "Panamá", "Panamá Oeste",
            "Veraguas"
    };

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panama_departamentos);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnSalir = findViewById(R.id.btnSalir);

        panamaDepart = findViewById(R.id.lsvDepartamentos);

        ArrayAdapter<String> adapter7;
        adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        panamaDepart.setAdapter(adapter7);

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