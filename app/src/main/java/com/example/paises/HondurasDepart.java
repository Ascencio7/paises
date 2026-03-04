package com.example.paises;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class HondurasDepart extends AppCompatActivity{
    ListView hondurasDepartamentos;
    Button btnRegresar, btnSalir;

    String[] valores = new String[]{
            "Atlántida", "Choluteca", "Colón",
            "Comayagua", "Copán", "Cortés",
            "El Paraíso", "Francisco Morazán", "Gracias a Dios",
            "Intibucá", "Islas de la Bahía", "La Paz", "Lempira",
            "Ocotepeque", "Olancho","Santa Bárbara",
            "Valle", "Yoro"
    };

    @Override
    protected  void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.honduras_dapartamentos);

        btnRegresar = findViewById(R.id.btnRegresar);
        btnSalir = findViewById(R.id.btnSalir);
        hondurasDepartamentos = findViewById(R.id.lsvDepartamentos);

        ArrayAdapter<String> adapter3;
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);

        hondurasDepartamentos.setAdapter(adapter3);

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