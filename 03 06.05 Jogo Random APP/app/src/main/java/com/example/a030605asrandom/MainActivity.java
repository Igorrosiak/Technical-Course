package com.example.a030605asrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerar(){
        TextView textoResultado = (TextView) findViewById(R.id.textoResultado);

        int numeroSorteado = new Random().nextInt(11);

        textoResultado.setText("O numero selecionado é: " + numeroSorteado);
    }
}
