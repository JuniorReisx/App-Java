package com.example.calculadora;

import android.content.Intent;
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
    private Button btnTest, btnSomar, btnSubtrair;

    float TAXA_DOLAR = 5.25f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        edtValor = findViewById(R.id.edtValor);
        txtResult = findViewById(R.id.txtResult);
        btnTest = findViewById(R.id.btnTest);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);

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

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela2.this, TelaSoma.class);
                startActivity(intent);
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela2.this, TelaSubtrair.class);
                startActivity(intent);
            }
        });
    }
}
