package com.example.paises;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class CostaRicaDepart extends AppCompatActivity {
    ListView ticosDepart;
    Button btnRegresar, btnSalir;

    String[] valores = new String[]{
            "San José ", "Alajuela", "Cartago",
            "Heredia", "Guanacaste", "Puntarenas",
            "Limón"
    };

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.costarica_departamentos);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnSalir = findViewById(R.id.btnSalir);
        ticosDepart = findViewById(R.id.lsvDepartamentos);

        ArrayAdapter<String> adapter6;
        adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        ticosDepart.setAdapter(adapter6);

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