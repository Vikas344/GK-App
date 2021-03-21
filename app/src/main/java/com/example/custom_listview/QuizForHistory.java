package com.example.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.collection.LLRBNode;

public class QuizForHistory extends AppCompatActivity {
    TextView editText;
    Button btn1,btn2,btn3,btn4;
    ImageView next;
    JavaClassForHis javaClassForHis=new JavaClassForHis();
    int i,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_for_history);
        editText=findViewById(R.id.edittext);
        btn1=findViewById(R.id.option_one);
        btn2=findViewById(R.id.option_two);
        btn3=findViewById(R.id.option_three);
        btn4=findViewById(R.id.option_four);
        next=findViewById(R.id.next);
        i=0;
        editText.setText(javaClassForHis.title[0]);
        btn1.setText(javaClassForHis.answer[0]);
        btn2.setText(javaClassForHis.answer2[0]);
        btn3.setText(javaClassForHis.answer3[0]);
        btn4.setText(javaClassForHis.answer4[0]);

        if(i==0){
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    String first=btn1.getText().toString();
                    if(first==javaClassForHis.right_answer[0]){
                        btn1.setBackgroundColor(Color.GREEN);
                        Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                    }
                    else{
                        btn1.setBackgroundColor(Color.RED);
                        Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_LONG).show();
                    }
                    String second=btn2.getText().toString();
                    if(second==javaClassForHis.right_answer[0]){
                        btn2.setBackgroundColor(Color.GREEN);
                    }
                    String third=btn3.getText().toString();
                    if(third==javaClassForHis.right_answer[0]){
                        btn3.setBackgroundColor(Color.GREEN);
                    }
                    String fourth=btn4.getText().toString();
                    if(fourth==javaClassForHis.right_answer[0]){
                        btn4.setBackgroundColor(Color.GREEN);
                    }
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn1.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    String second=btn2.getText().toString();
                    if(second==javaClassForHis.right_answer[0]){
                        btn2.setBackgroundColor(Color.GREEN);
                        Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                    }
                    else {
                        btn2.setBackgroundColor(Color.RED);
                        Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                    }
                    String first=btn1.getText().toString();
                    if(first==javaClassForHis.right_answer[0]){
                        btn1.setBackgroundColor(Color.GREEN);
                    }
                    String third=btn3.getText().toString();
                    if(third==javaClassForHis.right_answer[0]){
                        btn3.setBackgroundColor(Color.GREEN);
                    }
                    String fourth=btn4.getText().toString();
                    if(fourth==javaClassForHis.right_answer[0]){
                        btn4.setBackgroundColor(Color.GREEN);
                    }
                }
            });
           btn3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   btn1.setEnabled(false);
                   btn2.setEnabled(false);
                   btn4.setEnabled(false);
                   String third=btn3.getText().toString();
                   if(third==javaClassForHis.right_answer[0]){
                       btn3.setBackgroundColor(Color.GREEN);
                       Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                   }else {
                       btn3.setBackgroundColor(Color.RED);
                       Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                   }
                   String first=btn1.getText().toString();
                   if(first==javaClassForHis.right_answer[0]){
                       btn1.setBackgroundColor(Color.GREEN);
                   }
                   String second=btn2.getText().toString();
                   if(second==javaClassForHis.right_answer[0]){
                       btn2.setBackgroundColor(Color.GREEN);
                   }
                   String fourth=btn4.getText().toString();
                   if(fourth==javaClassForHis.right_answer[0]){
                       btn4.setBackgroundColor(Color.GREEN);
                   }
               }
           });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    String fourth=btn4.getText().toString();
                    if(fourth==javaClassForHis.right_answer[0]){
                        btn4.setBackgroundColor(Color.GREEN);
                        Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                    }else {
                        btn4.setBackgroundColor(Color.RED);
                        Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                    }
                    String first=btn1.getText().toString();
                    if(first==javaClassForHis.right_answer[0]){
                        btn1.setBackgroundColor(Color.GREEN);
                    }
                    String second=btn2.getText().toString();
                    if(second==javaClassForHis.right_answer[0]){
                        btn2.setBackgroundColor(Color.GREEN);
                    }
                    String third=btn3.getText().toString();
                    if(third==javaClassForHis.right_answer[0]){
                        btn3.setBackgroundColor(Color.GREEN);
                    }
                }
            });
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(i<=javaClassForHis.title.length){
                   j=i;
                   i=i+1;
                   if(j==i-1){
                       btn1.setEnabled(true);
                       btn2.setEnabled(true);
                       btn3.setEnabled(true);
                       btn4.setEnabled(true);
                       btn1.setBackgroundColor(Color.parseColor("#FFF8C3C3"));
                       btn2.setBackgroundColor(Color.parseColor("#FFF8C3C3"));
                       btn3.setBackgroundColor(Color.parseColor("#FFF8C3C3"));
                       btn4.setBackgroundColor(Color.parseColor("#FFF8C3C3"));
                   }

                   editText.setText(javaClassForHis.title[i]);

                   btn1.setText(javaClassForHis.answer[i]);
                   btn2.setText(javaClassForHis.answer2[i]);
                   btn3.setText(javaClassForHis.answer3[i]);
                   btn4.setText(javaClassForHis.answer4[i]);
               }
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        String first=btn1.getText().toString();
                        if(first==javaClassForHis.right_answer[i]){
                            btn1.setBackgroundColor(Color.GREEN);
                            Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                        }
                        else{
                            btn1.setBackgroundColor(Color.RED);
                            Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                        }
                        String second=btn2.getText().toString();
                        if(second==javaClassForHis.right_answer[i]){
                            btn2.setBackgroundColor(Color.GREEN);
                        }
                        String third=btn3.getText().toString();
                        if(third==javaClassForHis.right_answer[i]){
                            btn3.setBackgroundColor(Color.GREEN);
                        }
                        String fourth=btn4.getText().toString();
                        if(fourth==javaClassForHis.right_answer[i]){
                            btn4.setBackgroundColor(Color.GREEN);
                        }
                    }
                });
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn1.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        String second=btn2.getText().toString();
                        if(second==javaClassForHis.right_answer[i]){
                            btn2.setBackgroundColor(Color.GREEN);
                            Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                        }
                        else {
                            btn2.setBackgroundColor(Color.RED);
                            Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                        }
                        String first=btn1.getText().toString();
                        if(first==javaClassForHis.right_answer[i]){
                            btn1.setBackgroundColor(Color.GREEN);
                        }
                        String third=btn3.getText().toString();
                        if(third==javaClassForHis.right_answer[i]){
                            btn3.setBackgroundColor(Color.GREEN);
                        }
                        String fourth=btn4.getText().toString();
                        if(fourth==javaClassForHis.right_answer[i]){
                            btn4.setBackgroundColor(Color.GREEN);
                        }
                    }
                });
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn4.setEnabled(false);
                        String third=btn3.getText().toString();
                        if(third==javaClassForHis.right_answer[i]){
                            btn3.setBackgroundColor(Color.GREEN);
                            Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                        }else {
                            btn3.setBackgroundColor(Color.RED);
                            Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                        }
                        String first=btn1.getText().toString();
                        if(first==javaClassForHis.right_answer[i]){
                            btn1.setBackgroundColor(Color.GREEN);
                        }
                        String second=btn2.getText().toString();
                        if(second==javaClassForHis.right_answer[i]){
                            btn2.setBackgroundColor(Color.GREEN);
                        }
                        String fourth=btn4.getText().toString();
                        if(fourth==javaClassForHis.right_answer[i]){
                            btn4.setBackgroundColor(Color.GREEN);
                        }
                    }
                });
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btn1.setEnabled(false);
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        String fourth=btn4.getText().toString();
                        if(fourth==javaClassForHis.right_answer[i]){
                            btn4.setBackgroundColor(Color.GREEN);
                            Toast.makeText(QuizForHistory.this,"Correct Answer",Toast.LENGTH_LONG).show();
                        }else {
                            btn4.setBackgroundColor(Color.RED);
                            Toast.makeText(QuizForHistory.this,"Incorrect Answer",Toast.LENGTH_SHORT).show();
                        }
                        String first=btn1.getText().toString();
                        if(first==javaClassForHis.right_answer[i]){
                            btn1.setBackgroundColor(Color.GREEN);
                        }
                        String second=btn2.getText().toString();
                        if(second==javaClassForHis.right_answer[i]){
                            btn2.setBackgroundColor(Color.GREEN);
                        }
                        String third=btn3.getText().toString();
                        if(third==javaClassForHis.right_answer[i]){
                            btn3.setBackgroundColor(Color.GREEN);
                        }
                    }
                });
               if(i==9){
                   next.setVisibility(View.INVISIBLE);
               }

            }
        });




    }

}

