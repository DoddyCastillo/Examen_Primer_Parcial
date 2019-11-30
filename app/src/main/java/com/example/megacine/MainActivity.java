package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static ArrayList aleatorios ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aleatorios = new ArrayList();
    }
    public void iniciar(View view){
        Random rand = new Random();
        int n = rand.nextInt(5) +1;

       switch (n) {
           case 1:
               Intent intent = new Intent(getApplicationContext(),activitypregunta1.class);
               startActivity(intent);
               aleatorios.add(n);
               break;
           case 2:
               Intent intent1 = new Intent(getApplicationContext(),activitypregunta2.class);
               startActivity(intent1);
               aleatorios.add(n);
               break;
           case 3:
               Intent intent2 = new Intent(getApplicationContext(),activitypregunta3.class);
               startActivity(intent2);
               aleatorios.add(n);
               break;
           case 4:
               Intent intent3 = new Intent(getApplicationContext(),activitypregunta4.class);
               startActivity(intent3);
               aleatorios.add(n);
               break;
           case 5:
               Intent intent4 = new Intent(getApplicationContext(),activitypregunta5.class);
               startActivity(intent4);
               aleatorios.add(n);
               break;

       }
    }
}
