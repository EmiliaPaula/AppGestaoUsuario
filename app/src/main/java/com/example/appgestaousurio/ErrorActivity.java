package com.example.appgestaousurio;

import static android.os.Build.VERSION_CODES.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class ErrorActivity extends AppCompatActivity {

    Button btnTentarNovamente, btnCriarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R);

        btnTentarNovamente = findViewById(R);
        btnCriarCadastro = findViewById(R);

        // Volta para a tela de login
        btnTentarNovamente.setOnClickListener(v -> {
            finish(); // Fecha a ErrorActivity e volta para a MainActivity
        });

        // Vai para a tela de cadastro
        btnCriarCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(ErrorActivity.this, CadastroActivity.class);
            startActivity(intent);
        });
    }
}
