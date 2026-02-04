package com.exemplo.pet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Pet meuPet = new Pet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView statusTxt = findViewById(R.id.status_text);
        Button btnFeed = findViewById(R.id.btn_feed);
        Button btnPlay = findViewById(R.id.btn_play);

        // Atualiza a tela inicial
        statusTxt.setText(meuPet.getStatus());

        btnFeed.setOnClickListener(v -> {
            meuPet.alimentar();
            statusTxt.setText(meuPet.getStatus());
        });

        btnPlay.setOnClickListener(v -> {
            meuPet.brincar();
            statusTxt.setText(meuPet.getStatus());
        });
    }
}
