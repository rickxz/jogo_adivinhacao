package com.example.adivinhacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private TextView tvPensado;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        tvPensado = findViewById(R.id.tvPensado);
        tvResultado = findViewById(R.id.tvResultado);

        btn1.setOnClickListener(new btn1Listener());
        btn2.setOnClickListener(new btn2Listener());
        btn3.setOnClickListener(new btn3Listener());
    }

    private class btn1Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int escolha;
            escolha = Integer.parseInt(btn1.getText().toString());
            int pensado = new Random().nextInt(3) + 1;
            tvPensado.setText("Pensei em: " + pensado);
            if (escolha == pensado){
                tvResultado.setText("Ganhouuu!!!");
            } else{
                tvResultado.setText("Perdeste, otário!");
            }
        }
    }

    private class btn2Listener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int escolha;
            escolha = Integer.parseInt(btn2.getText().toString());
            int pensado = new Random().nextInt(3) + 1;
            tvPensado.setText("Pensei em: " + pensado);
            if (escolha == pensado) {
                tvResultado.setText("Ganhouuu!!");
            } else {
                tvResultado.setText("Perdeste, otário!");
            }
        }
    }

    private class btn3Listener implements View.OnClickListener {
        @Override
        public void onClick(View view){
            int escolha;
            escolha = Integer.parseInt(btn3.getText().toString());
            int pensado = new Random().nextInt(3) + 1;
            tvPensado.setText("Pensei em: " + pensado);
            if (escolha == pensado) {
                tvResultado.setText("Ganhouuu!!!");
            } else {
                tvResultado.setText("Perdeste, otário!");
            }
        }
    }
}