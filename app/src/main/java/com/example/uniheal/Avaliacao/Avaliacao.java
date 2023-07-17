package com.example.uniheal.Avaliacao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.uniheal.R;

public class Avaliacao extends AppCompatActivity {

    TextView TxtAvalicaoConteudo;
    TextView TxtRYBConteudo;
    TextView TxtIdentificacaoConteudo;

    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);

        TxtAvalicaoConteudo = findViewById(R.id.idTxtAvalicaoConteudo);
        TxtRYBConteudo = findViewById(R.id.idTxtRYBConteudo);
        TxtIdentificacaoConteudo = findViewById(R.id.idTxtIdentificacaoConteudo);


        linearLayout1 = findViewById(R.id.idLLayout1);
        linearLayout2 = findViewById(R.id.idLLayout2);
        linearLayout3 = findViewById(R.id.idLLayout3);
    }

    public void expandCard1(View view){
        int v = (TxtAvalicaoConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayout1, new AutoTransition());
        TxtAvalicaoConteudo.setVisibility(v);
    }
    public void expandCard2(View view){
        int v = (TxtRYBConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayout2, new AutoTransition());
        TxtRYBConteudo.setVisibility(v);
    }
    public void expandCard3(View view){
        int v = (TxtIdentificacaoConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayout3, new AutoTransition());
        TxtIdentificacaoConteudo.setVisibility(v);
    }
}