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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    ListView listView;
    String mtitle[]={"HISTORY","GEOGRAPHY","ECONOMICS","CONSTITUTION","POLITICS","GENERAL SCIENCE","SPORTS","DIVERSE"};
    String discription[]={"500 History Questions ","500 Geography Questions",
            "500 Economics Questions","500 Constitution Questions",
            "500 Politics Questions","500 General Science Questions","500 Sports Question","500 Diverse Questions"};
    int images[]={R.drawable.history2,R.drawable.geography,R.drawable.economics2,R.drawable.constitution,R.drawable.politics2,R.drawable.general,R.drawable.sports,R.drawable.diverse};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        listView=(ListView) findViewById(R.id.listvieww);
        MyAdapter adapterr=new MyAdapter(this,mtitle,discription,images);
        listView.setAdapter(adapterr);


    }
    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String title[];
        String title_des[];
        int img[];

        MyAdapter(Context c, String tit[], String desc[], int imgs[]){

            super(c,R.layout.row,R.id.main_title,tit);
            this.context=c;
            this.title=tit;
            this.title_des=desc;
            this.img=imgs;


        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate(R.layout.row,parent,false);
            ImageView imageView=row.findViewById(R.id.image);
            TextView textView1=row.findViewById(R.id.main_title);
            TextView textView2=row.findViewById(R.id.sub_title);

            imageView.setImageResource(img[position]);
            textView1.setText(title[position]);
            textView2.setText(title_des[position]);



            return row;
        }
    }
}
