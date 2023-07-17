package com.example.uniheal.Tratamento;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.uniheal.R;

public class Tratamento extends AppCompatActivity {

    TextView txtLimpezaDaFerida;
    TextView txtCurativos;
    TextView txtGaze;
    TextView txtCurativoCompressao;
    TextView txtCurativoOclusivo;
    TextView txtCuidados;

    LinearLayout linearLayoutLimpeza;
    LinearLayout linearLayoutCurativos;
    LinearLayout linearLayoutGaze;
    LinearLayout linearLayoutCurativoCompressao;
    LinearLayout linearLayoutCurativoOclusivo;
    LinearLayout linearLayoutCuidados;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tratamento);


        txtLimpezaDaFerida = findViewById(R.id.idTxLimpezaDaFerida);
        txtCurativos = findViewById(R.id.idTxtCurativosProntos);
        txtGaze = findViewById(R.id.idTxtGazeAtadura);
        txtCurativoCompressao = findViewById(R.id.idTxtCurativosDeCompressao);
        txtCurativoOclusivo = findViewById(R.id.idTxtCurativosOclusivo);
        txtCuidados = findViewById(R.id.idTxtCuidadosCurativos);


        linearLayoutLimpeza = findViewById(R.id.idLLayoutLimpeza);
        linearLayoutCurativos = findViewById(R.id.idLLayoutCurativos);
        linearLayoutGaze = findViewById(R.id.idLLayoutGaze);
        linearLayoutCurativoCompressao = findViewById(R.id.idLLayoutCurativoCompressao);
        linearLayoutCurativoOclusivo = findViewById(R.id.idLLayoutCurativoOclusivos);
        linearLayoutCuidados = findViewById(R.id.idLLayoutCuidados);

    }

    public void expandCardLimpeza(View view){
        int v = (txtLimpezaDaFerida.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayoutLimpeza, new AutoTransition());
        txtLimpezaDaFerida.setVisibility(v);
    }
    public void expandCardCurativos(View view){
        int v = (txtCurativos.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayoutCurativos, new AutoTransition());
        txtCurativos.setVisibility(v);
    }
    public void expandCardGaze(View view){
        int v = (txtGaze.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayoutGaze, new AutoTransition());
        txtGaze.setVisibility(v);
    }
    public void expandCardCurativoCompressao(View view){
        int v = (txtCurativoCompressao.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayoutCurativoCompressao, new AutoTransition());
        txtCurativoCompressao.setVisibility(v);
    }
    public void expandCardCurativoOclusivo(View view){
        int v = (txtCurativoOclusivo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayoutCurativoOclusivo, new AutoTransition());
        txtCurativoOclusivo.setVisibility(v);
    }
    public void expandCardCuidados(View view){
        int v = (txtCuidados.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(linearLayoutCuidados, new AutoTransition());
        txtCuidados.setVisibility(v);
    }

}