package com.example.uniheal.Feridas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.uniheal.R;

public class Feridas extends AppCompatActivity {

    // Variáveis para o Texto que aparece e some do Card
    TextView txtCirurgicasConteudo;
    TextView txtTraumaticasConteudo;
    TextView txtUlcerativasConteudo;


    // Variáveis para os LinearLayout's
    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ALTERAR ESSA PARÂMETRO EM ROXO (colocar o nome do seu arquivo .xml)
        setContentView(R.layout.activity_feridas);

        // Call para os ID's dos Textos
        txtCirurgicasConteudo = findViewById(R.id.idTxtCirurgicasConteudo);
        txtTraumaticasConteudo = findViewById(R.id.idTxtTraumaticasConteudo);
        txtUlcerativasConteudo = findViewById(R.id.idTxtUlcerativasConteudo);

        // Call para os LinearLayout's
        linearLayout1 = findViewById(R.id.idLLayout1);
        linearLayout2 = findViewById(R.id.idLLayout2);
        linearLayout3 = findViewById(R.id.idLLayout3);
    }

    // Função para Expandir o Card (lembrar de alterar o nome dessa variável lá no .xml - fica no 'android:onClick')
    public void expandCard1(View view){
        // ALTERAR APENAS ESSAS VARIÁVEIS, CONFORME FORAM DECLARADAS ACIMA
        int v = (txtCirurgicasConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;


        TransitionManager.beginDelayedTransition(linearLayout1, new AutoTransition());
        txtCirurgicasConteudo.setVisibility(v);
    }
    public void expandCard2(View view){
        int v = (txtTraumaticasConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayout2, new AutoTransition());
        txtTraumaticasConteudo.setVisibility(v);
    }
    public void expandCard3(View view){
        int v = (txtUlcerativasConteudo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayout3, new AutoTransition());
        txtUlcerativasConteudo.setVisibility(v);
    }
}