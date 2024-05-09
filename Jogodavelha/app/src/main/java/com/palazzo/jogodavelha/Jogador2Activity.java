package com.palazzo.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Jogador2Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButtonNext;
    private EditText editTextJogador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador2);

        EditText editTextJogador2 = findViewById(R.id.editTextJogador2);

        ImageButton imageButtonNext = findViewById(R.id.imageButtonNext);
        imageButtonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButtonNext) {
            Intent telaJogador2 = new Intent(this, Jogador2Activity.class);
            startActivity(telaJogador2);
            finish();
        }
    }
}