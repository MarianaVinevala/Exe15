package com.example.exercicio15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void run(View v) {
        Intent i = new Intent(MainActivity.this, Tela2.class);
        startActivity(i);
    }
    public void go(View v)
    {
        Toast.makeText(MainActivity.this, "Botão clicado", Toast.LENGTH_LONG).show();
    }
}