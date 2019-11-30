package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class activitypregunta5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitypregunta5);
    }
    public void gano(View view){
        Random rand = new Random();
        int n = rand.nextInt(5) +1;
        while (MainActivity.aleatorios.contains(n)) {
            n = rand.nextInt(5) + 1;
            System.out.println("aleatorio"+n);
        }
        if(activitypregunta1.contestadas == 4){
            Intent intent = new Intent(getApplicationContext(),ganoActivity.class);
            startActivity(intent);
        }
        else {
            activitypregunta1.contestadas++;
            System.out.println(activitypregunta1.contestadas);
        }

        switch (n) {
            case 1:
                Intent intent = new Intent(getApplicationContext(),activitypregunta1.class);
                startActivity(intent);
                MainActivity.aleatorios.add(n);
                break;
            case 2:
                Intent intent1 = new Intent(getApplicationContext(),activitypregunta2.class);
                startActivity(intent1);
                MainActivity.aleatorios.add(n);
                break;
            case 3:
                Intent intent2 = new Intent(getApplicationContext(),activitypregunta3.class);
                startActivity(intent2);
                MainActivity.aleatorios.add(n);
                break;
            case 4:
                Intent intent3 = new Intent(getApplicationContext(),activitypregunta4.class);
                startActivity(intent3);
                MainActivity.aleatorios.add(n);
                break;
            case 5:
                Intent intent4 = new Intent(getApplicationContext(),activitypregunta5.class);
                startActivity(intent4);
                MainActivity.aleatorios.add(n);
                break;

        }
    }
    public void perdio(View view){
        Intent intent = new Intent(getApplicationContext(),losientoActivity.class);
        startActivity(intent);
    }
}
