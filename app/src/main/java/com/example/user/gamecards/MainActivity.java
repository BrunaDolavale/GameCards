package com.example.user.gamecards;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView carta_vermelha, carta_a, carta_b, carta_c;
    List<Integer> cartas;
    public static final int acertou = 202;
    public static final int errou_1 = 404;
    public static final int errou_2 = 505;


    Button novo_jogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carta_a = (ImageView) findViewById(R.id.carta_a);
        carta_b = (ImageView) findViewById(R.id.carta_b);
        carta_c = (ImageView) findViewById(R.id.carta_c);
        final TextView resultado = (TextView) findViewById(R.id.resultado);

        novo_jogo = (Button) findViewById(R.id.novo_jogo);

        cartas = new ArrayList<>();
        cartas.add(202); //acertou
        cartas.add(404); // errou
        cartas.add(505); //errou
        Collections.shuffle(cartas);

        novo_jogo.setVisibility(View.GONE);

        novo_jogo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                novo_jogo.setVisibility(View.GONE);
                Collections.shuffle(cartas);

                carta_a.setImageResource(R.drawable.carta_vermelha);
                carta_b.setImageResource(R.drawable.carta_vermelha);
                carta_c.setImageResource(R.drawable.carta_vermelha);

                carta_a.setClickable(true);
                carta_b.setClickable(true);
                carta_c.setClickable(true);

                resultado.setText(null);
            }

        });

        carta_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cartas.get(0) == acertou){
                    carta_a.setImageResource(R.drawable.acertou);
                    resultado.setText("Uhuuul! Acertou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                } else if(cartas.get(0) == errou_1){
                    carta_a.setImageResource(R.drawable.errou);
                    resultado.setText("Ahh, que pena! Você errou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                } else if(cartas.get(0) == errou_2){
                    carta_a.setImageResource(R.drawable.errou);
                    resultado.setText("Ahh, que pena! Você errou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                }
            }
        });

        carta_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cartas.get(1) == acertou){
                    carta_b.setImageResource(R.drawable.acertou);
                    resultado.setText("Uhuuul! Acertou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                } else if(cartas.get(1) == errou_1){
                    carta_b.setImageResource(R.drawable.errou);
                    resultado.setText("Ahh, que pena! Você errou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                } else if(cartas.get(1) == errou_2){
                    carta_b.setImageResource(R.drawable.errou);
                    resultado.setText("Ahh, que pena! Você errou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                }
            }
        });

        carta_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cartas.get(2) == acertou){
                    carta_c.setImageResource(R.drawable.acertou);
                    resultado.setText("Uhuuul! Acertou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                } else if(cartas.get(2) == errou_1){
                    carta_c.setImageResource(R.drawable.errou);
                    resultado.setText("Ahh, que pena! Você errou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                } else if(cartas.get(2) == errou_2){
                    carta_c.setImageResource(R.drawable.errou);
                    resultado.setText("Ahh, que pena! Você errou!");
                    novo_jogo.setVisibility(View.VISIBLE);
                    carta_a.setClickable(false);
                    carta_b.setClickable(false);
                    carta_c.setClickable(false);
                }
            }
        });


    }
}