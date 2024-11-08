package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TelaSoma extends AppCompatActivity {

    private EditText edtNumero1, edtNumero2;
    private TextView txtResultado;
    private Button btnSomar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_soma);

        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        txtResultado = findViewById(R.id.txtResultado);
        btnSomar = findViewById(R.id.btnSomar);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtNumero1.getText().toString().isEmpty() && !edtNumero2.getText().toString().isEmpty()) {
                    float num1 = Float.parseFloat(edtNumero1.getText().toString());
                    float num2 = Float.parseFloat(edtNumero2.getText().toString());

                    float resultado = num1 + num2;

                    txtResultado.setText("Resultado: " + resultado);
                } else {
                    Toast.makeText(TelaSoma.this, "Por favor, preencha ambos os campos.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
