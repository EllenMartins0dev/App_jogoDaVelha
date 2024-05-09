package com.palazzo.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Jogador1Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButtonAvancar;
    private EditText editTextJogador1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador1);

        EditText editTextJogador1 = findViewById(R.id.editTextJogador1);

        ImageButton imageButtonAvancar = findViewById(R.id.imageButtonAvancar);
        imageButtonAvancar.setOnClickListener(this);

        Som.executar(this, R.raw.disputa);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButtonAvancar) {
            Intent telaJogador2 = new Intent(this, Jogador2Activity.class);
            startActivity(telaJogador2);
            finish();

    }
}
}