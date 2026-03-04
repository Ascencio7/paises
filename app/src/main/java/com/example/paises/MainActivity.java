package com.example.paises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView paises;

    // Crear el arreglo con la lista de los paises que tendra el ListView
    String[] valores = new String[]{
            "Guatemala", "El Salvador",
            "Honduras", "Nicaragua",
            "Costa Rica", "Panamá"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hacer referencia al objeto ListView
        paises = findViewById(R.id.lsvPaises);

        // Crear un adapter para poder vincular el ListView con los valores del arreglo
        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        // Asignar el adapter al ListView
        paises.setAdapter(adapter);

        // Capturar el evento clic en cada elemento ListView
        paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Usted ha presionado la fila: " + (int)(i+1), Toast.LENGTH_SHORT).show();

                // Obtener el pais seleccionado
                String paisSeleccionado = valores[i];

                // Si el pais seleccionado es "El Salvador", iniciar la actividad Departamentos
                if (paisSeleccionado.equals("El Salvador")){
                    Intent intent = new Intent(MainActivity.this, departamentos.class);
                    startActivity(intent);
                }

                if (paisSeleccionado.equals("Guatemala")){
                    Intent intent2 = new Intent(MainActivity.this, GuateDepar.class);
                    startActivity(intent2);
                }

                if (paisSeleccionado.equals("Honduras")){
                    Intent intent3 = new Intent(MainActivity.this, HondurasDepart.class);
                    startActivity(intent3);
                }

                if(paisSeleccionado.equals("Nicaragua")){
                    Intent intent4 = new Intent(MainActivity.this, NicaraguaDepart.class);
                    startActivity(intent4);
                }

                if(paisSeleccionado.equals("Costa Rica")){
                    Intent intent5 = new Intent(MainActivity.this, CostaRicaDepart.class);
                    startActivity(intent5);
                }

                if (paisSeleccionado.equals("Panamá")){
                    Intent intent6 = new Intent(MainActivity.this, PanamaDepart.class);
                    startActivity(intent6);
                }
            }

        });

/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}