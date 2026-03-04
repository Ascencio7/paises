package com.example.paises;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class GuateDepar extends AppCompatActivity {
    // Crear objetos
    ListView guateDepar;
    Button btnRegresar, btnSalir;

    // Arreglo de los departamentos
    String[] valores = new String[]{
            "Alta Verapaz", "Baja Verapaz", "Chimaltenango",
            "Chiquimula", "El Progreso", "Escuintla",
            "Guatemala", "Huehuetenango", "Izabal",
            "Jalapa", "Jutiapa", "Petén",
            "Quetzaltenango", "Quiché", "Retalhuleu",
            "Sacatepéquez","San Marcos", "Santa Rosa",
            "Sololá", "Suchitepéquez","Totonicapán", "Zacapa"
    };

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guate_departamentos);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnSalir = findViewById(R.id.btnSalir);

        guateDepar = findViewById(R.id.lsvDepartamentos);

        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        guateDepar.setAdapter(adapter2);

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