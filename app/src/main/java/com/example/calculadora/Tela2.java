package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Tela2 extends AppCompatActivity {

    private EditText edtValor;
    private TextView txtResult;
    private Button btnTest;


   float TAXA_DOLAR = 5.25f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        // Vinculando os componentes da interface
        edtValor = findViewById(R.id.edtValor);
        txtResult = findViewById(R.id.txtResult);
        btnTest = findViewById(R.id.btnTest);


        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valorReais = edtValor.getText().toString().trim();


                if (!valorReais.isEmpty()) {

                    float valorEmReais = Float.parseFloat(valorReais);

                    float valorEmDolares = valorEmReais / TAXA_DOLAR;

                    txtResult.setText("Resultado: $" + valorEmDolares);

                } else {
                    Toast.makeText(Tela2.this, "Digite um valor para converter.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
