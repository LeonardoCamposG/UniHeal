package com.example.uniheal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.uniheal.Avaliacao.Avaliacao;
import com.example.uniheal.Cicatrizacao.Cicatrizacao;
import com.example.uniheal.Creditos.Creditos;
import com.example.uniheal.Curiosidades.Curiosidades;
import com.example.uniheal.Feridas.Feridas;
import com.example.uniheal.Tratamento.Tratamento;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnFeridas;
    private ImageButton btnCicatrizacao;
    private ImageButton btnAvaliacao;
    private ImageButton btnTratamento;
    private ImageButton btnCuriosidades;
    private ImageButton btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFeridas = findViewById(R.id.idBtnFeridas);
        btnCicatrizacao = findViewById(R.id.idBtnCicatrizacao);
        btnAvaliacao = findViewById(R.id.idBtnAvaliacao);
        btnTratamento = findViewById(R.id.idBtnTratamento);
        btnCuriosidades = findViewById(R.id.idBtnCuriosidades);
        btnCreditos = findViewById(R.id.idBtnCreditos);

        btnFeridas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeridas();
            }
        });

        btnCicatrizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCicatrizacao();
            }
        });

        btnAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAvaliacao();
            }
        });

        btnTratamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTratamento();
            }
        });

        btnCuriosidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCuriosidades();
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreditos();
            }
        });
    }

    public void openFeridas(){
        Intent IntentFeridas = new Intent(this,Feridas.class);
        startActivity(IntentFeridas);
    }

    public void openCicatrizacao(){
        Intent IntentCicatrizacao = new Intent(this, Cicatrizacao.class);
        startActivity(IntentCicatrizacao);
    }

    public void openTratamento(){
        Intent IntentTratamento = new Intent(this, Tratamento.class);
        startActivity(IntentTratamento);
    }

    public void openAvaliacao(){
        Intent IntentAvaliacao = new Intent(this, Avaliacao.class);
        startActivity(IntentAvaliacao);
    }

    public void openCuriosidades(){
        Intent IntentCuriosidades = new Intent(this, Curiosidades.class);
        startActivity(IntentCuriosidades);
    }

    public void openCreditos(){
        Intent IntentCreditos = new Intent(this, Creditos.class);
        startActivity(IntentCreditos);
    }
}