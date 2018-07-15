package com.rumiapp.rumi;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rumiapp.rumi.bookdata.RumisBook;
import com.rumiapp.rumi.moviedata.rumisphilosophy;
import com.rumiapp.rumi.wordsdata.RumisWord;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase mDb;
    Button btn_whoisrumi,btn_rumiphilosophy,btn_rumibook,btn_rumiword,btn_sebiaruz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_whoisrumi = findViewById(R.id.btn_whoisrumi);
        btn_rumiphilosophy = findViewById(R.id.btn_rumiphilosophy);
        btn_rumibook = findViewById(R.id.btn_rumibook);
        btn_rumiword = findViewById(R.id.btn_rumiword);
        btn_sebiaruz = findViewById(R.id.btn_sebiaruz);

        btn_whoisrumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Class destinationActivity = iamrumi.class;
                Intent startActivityIntent = new Intent(context,destinationActivity);
                startActivity(startActivityIntent);
            }
        });

        btn_rumiphilosophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Class destinationActivity = rumisphilosophy.class;
                Intent startActivityIntent = new Intent(context,destinationActivity);
                startActivity(startActivityIntent);
            }
        });

        btn_rumibook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Class destinationActivity = RumisBook.class;
                Intent startActivityIntent = new Intent(context,destinationActivity);
                startActivity(startActivityIntent);
            }
        });

        btn_rumiword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Class destinationActivity = RumisWord.class;
                Intent startActivityIntent = new Intent(context,destinationActivity);
                startActivity(startActivityIntent);
            }
        });

        btn_sebiaruz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Class destinationActivity = SebiAruz.class;
                Intent startActivityIntent = new Intent(context,destinationActivity);
                startActivity(startActivityIntent);
            }
        });
    }
}
