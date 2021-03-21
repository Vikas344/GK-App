package com.example.custom_listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class GeographyActivity extends AppCompatActivity {
    ListView listView;
    String mtitle[]={"1). Guwahati is situated on the banks of river?","2). The Gulf of Mannar is situated along the coast which state in India?"
            ,"3). The city of Nasik is situated on the banks of which river in India?","4). Where are the coal reserves of India largely concentrated ?"
            ,"5). In which state do the Mansoon arrives first ?","6). How many islands are there in the group of Lakshadweep?",
            "7).  Between which ranges does the Kashmir valley in the Himlayas lie ?","8).  Indravati is a tributary of which river ?","9).  Where is Thattekad Bird Sanctuary located ?"
    ,"10). The main streams of river Ganga which flows beyond Farakka is known as?","11). The length of the Indian coast line is?","12).  How many National waterways are there in India ?"
    };
    String discription[]={"Answer:- Brahmaputra ","Answer:- Tamil Nadu","Answer:- Godavari",
            "Answer:-  Damodar valley","Answer:- Kerala","Answer:- 36","Answer:- Zanskar and Pir Panjal","Answer:-  Godavari",
            "Answer:- Kerala","Answer:- Padma","Answer:- 7516·6 km","Answer:- 9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        listView=(ListView) findViewById(R.id.listviewforgeography);
        MyAdapter adapter=new MyAdapter(this,mtitle,discription);
        listView.setAdapter(adapter);
    }




    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String title[];
        String title_des[];

        MyAdapter(Context c, String tit[], String desc[]){

            super(c,R.layout.historyrow,R.id.main_title,tit);
            this.context=c;
            this.title=tit;
            this.title_des=desc;


        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate(R.layout.historyrow,parent,false);


            TextView textView1=row.findViewById(R.id.main_title);
            TextView textView2=row.findViewById(R.id.sub_title);

            textView1.setText(title[position]);
            textView2.setText(title_des[position]);


            return row;
        }
    }
}
