package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class losientoActivity extends AppCompatActivity {

    public TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losiento);
        text = (TextView)findViewById(R.id.idlosiento);
        text.setText("Lo siento perdio Preguntas Contestadas: " +activitypregunta1.contestadas);

    }
    public void perdio(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}
