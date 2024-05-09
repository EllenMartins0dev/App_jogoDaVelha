package com.palazzo.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private ImageButton imageButtonVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButtonVoltar = findViewById(R.id.imageButtonVoltar);
        imageButtonVoltar.setOnClickListener(this);

        Som.executar(this, R.raw.start);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButtonVoltar) {
            Intent telaJogador1 = new Intent(this, Jogador1Activity.class);
            startActivity(telaJogador1);
            finish();
        }
    }
}