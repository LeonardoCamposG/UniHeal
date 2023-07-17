package com.example.uniheal.Curiosidades;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.uniheal.R;

public class Curiosidades extends AppCompatActivity {

    TextView detailsText;
    LinearLayout layout;
    TextView descriçaoText;
    LinearLayout Evoluçao;

    TextView detalheText;
    LinearLayout Cicatriz;

    TextView descText;
    LinearLayout Extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidades);

        detailsText = findViewById(R.id.details);
        layout = findViewById(R.id.layout);
        descriçaoText = findViewById(R.id.descriçao);
        Evoluçao = findViewById(R.id.Evoluçao);
        detalheText = findViewById(R.id.detalhe);
        Cicatriz = findViewById(R.id.Cicatriz);
        descText = findViewById(R.id.desc);
        Extra = findViewById(R.id.Extra);


    }

    public void expand(View view) {
        int v = (detailsText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);
    }

    public void expandir (View view) {
        int v = (descriçaoText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(Evoluçao, new AutoTransition());
        descriçaoText.setVisibility(v);
    }

    public void expan (View view) {
        int v = (detalheText.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(Cicatriz, new AutoTransition());
        detalheText.setVisibility(v);
    }

    public void aumentar (View view) {
        int v = (descText.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(Extra, new AutoTransition());
        descText.setVisibility(v);
    }

}
