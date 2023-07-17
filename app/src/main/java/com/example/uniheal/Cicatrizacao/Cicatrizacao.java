package com.example.uniheal.Cicatrizacao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.uniheal.R;

public class Cicatrizacao extends AppCompatActivity {

    TextView txtAceleramCicatrizacaoConteudo;
    TextView txtInterferemCicatrizacaoConteudo;
    TextView txtFatoresLocais;
    TextView txtFatoresLocaisConteudo;
    TextView txtFatoresSistemicos;
    TextView txtFatoresSistemicosConteudo;

    // Variáveis para os LinearLayout's
    LinearLayout linearLayout4;
    LinearLayout linearLayout5;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ALTERAR ESSA PARÂMETRO EM ROXO (colocar o nome do seu arquivo .xml)
        setContentView(R.layout.activity_cicatrizacao);

        // Call para os ID's dos Textos
        txtAceleramCicatrizacaoConteudo = findViewById(R.id.idTxtAceleramCicatrizacaoConteudo);
        txtInterferemCicatrizacaoConteudo = findViewById(R.id.idTxtInterferemCicatrizacaoConteudo);

        // CALL para os ID's dos Subconteúdos

        txtFatoresLocais = findViewById(R.id.idTxtFatoresLocais);
        txtFatoresLocaisConteudo = findViewById(R.id.idTxtFatoresLocaisConteudo);
        txtFatoresSistemicos = findViewById(R.id.idTxtFatoresSistemicos);
        txtFatoresSistemicosConteudo = findViewById(R.id.idTxtFatoresSistemicosConteudo);

        // Call para os LinearLayout's
        linearLayout4 = findViewById(R.id.idLLayout4);
        linearLayout5 = findViewById(R.id.idLLayout5);
    }

    // Função para Expandir o Card (lembrar de alterar o nome dessa variável lá no .xml - fica no 'android:onClick')
    public void expandCard4(View view){
        // ALTERAR APENAS ESSAS VARIÁVEIS, CONFORME FORAM DECLARADAS ACIMA
        int v = (txtAceleramCicatrizacaoConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;


        TransitionManager.beginDelayedTransition(linearLayout4, new AutoTransition());
        txtAceleramCicatrizacaoConteudo.setVisibility(v);
    }
    public void expandCard5(View view){
        int a = (txtInterferemCicatrizacaoConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        int b = (txtFatoresLocais.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        int c = (txtFatoresLocaisConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        int d = (txtFatoresSistemicos.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        int e = (txtFatoresSistemicosConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;



        TransitionManager.beginDelayedTransition(linearLayout5, new AutoTransition());
        txtInterferemCicatrizacaoConteudo.setVisibility(a);
        txtFatoresLocais.setVisibility(b);
        txtFatoresLocaisConteudo.setVisibility(c);
        txtFatoresSistemicos.setVisibility(d);
        txtFatoresSistemicosConteudo.setVisibility(e);
    }
}