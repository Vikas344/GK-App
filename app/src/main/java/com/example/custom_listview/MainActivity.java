package com.example.custom_listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button study,quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        study=(Button)findViewById(R.id.study);
        quiz=(Button)findViewById(R.id.quiz);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,StudyActivity.class));
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,QuizActivity.class));
            }
        });



    }



    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertbuilder=new AlertDialog.Builder(this);
        alertbuilder.setTitle("Confirm Exit....");
        alertbuilder.setIcon(R.drawable.exit);
        alertbuilder.setMessage("Are you sure want to exit?");
        alertbuilder.setCancelable(true);
        alertbuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertbuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alertbuilder.setCancelable(true);
            }
        });

        AlertDialog alertDialog=alertbuilder.create();
        alertDialog.show();
    }
}
