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

public class SportsActivity extends AppCompatActivity {
    ListView listView;
    String mtitle[]={"1). History","Instagram","Telegram","Twitter","Whatsapp","Youtube"};
    String discription[]={"Answer:- 500 History Questions ","Instagram Description","Telegram Description","Twitter Description","Whatsapp Description","Youtube Description"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        listView=(ListView) findViewById(R.id.listviewforsports);
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
