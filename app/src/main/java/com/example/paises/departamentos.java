package com.example.paises;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class departamentos extends AppCompatActivity {

        // Creando objetos ListView
        ListView departamentos;

        Button btnRegresar, btnSalir;

        // Creando el arreglo con la lista de los departamentos
        String[] valores = new String[] {
                "Ahuachapan", "Cabañas", "Chalatenango", "Cuscatlan",
                "La Libertad", "Morazan", "La Paz", "Santa Ana",
                "San Miguel", "San Salvador", "San Vicente", "Sonsonate",
                "La Union", "Usulutan"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_departamentos);

            btnRegresar = findViewById(R.id.btnRegresar);
            btnSalir = findViewById(R.id.btnSalir);

            // Haciendo referencia al objeto ListView
            departamentos = findViewById(R.id.lsvDepartamentos);

            // Creando un adapter para poder vincular el ListView con los valores del arreglo
            ArrayAdapter<String> adapter;
            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

            // Asignando el adapter al ListView
            departamentos.setAdapter(adapter);

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