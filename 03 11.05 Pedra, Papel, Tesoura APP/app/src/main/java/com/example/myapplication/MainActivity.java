package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoSelecionada(String escolhaUsuario){
        ImageView imageResultado = (ImageView) findViewById(R.id.imageResultado);
        TextView textoResultado = (TextView) findViewById(R.id.textResultado);

        String [] opcoes = {"pedra", "papel", "tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        switch (escolhaApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.Pedra);
                break;

            case "papel":
                imageResultado.setImageResource(R.drawable.Papel);
                break;

            case "tesoura":
                imageResultado.setImageResource(R.drawable.Tesoura);
                break;
        }

        if (
                (escolhaApp=="pedra" && escolhaUsuario=="tesoura") ||
                (escolhaApp=="papel" && escolhaUsuario=="pedra") ||
                (escolhaApp=="tesoura" && escolhaUsuario=="papel")
        ){
            textoResultado.setText("Você perdeu :(");
        } else if(
                (escolhaUsuario=="pedra" && escolhaApp=="tesoura") ||
                (escolhaUsuario=="papel" && escolhaApp=="pedra") ||
                (escolhaUsuario=="tesoura" && escolhaApp=="papel")
        ){
            textoResultado.setText("Você ganhou :)");
        } else{
            textoResultado.setText("Empatamos ;)");
        }
    }

    public void selecionarPedra(View v){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View v){
        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View v){
        this.opcaoSelecionada("tesoura");
    }
}
