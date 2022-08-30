package com.example.sairamkrishna.tugasbesar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MathQuizActivity extends AppCompatActivity {

    TextView Score,Question;
    EditText Answer;
    Button Submit;


    private int mscore = 0,num1,num2,numAnswer;
    private int difficulty = 0;
    Random r = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);

        Score = (TextView) findViewById(R.id.txtScore);
        Question = (TextView) findViewById(R.id.txtQuestion);
        Answer = (EditText) findViewById(R.id.txtAnswer);
        Submit = (Button) findViewById(R.id.btnAnswer);

        Score.setText("SCORE : "+mscore);

        UpdateQuestion(10);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( Integer.parseInt(Answer.getText().toString() ) == numAnswer){
                    Toast.makeText(MathQuizActivity.this, "Correct! Score+1", Toast.LENGTH_SHORT).show();
                    mscore++;
                    Score.setText("SCORE : "+mscore);
                    if(mscore>5){
                        if(difficulty==1){
                            Toast.makeText(MathQuizActivity.this, "Difficulty has set to hard", Toast.LENGTH_SHORT).show();
                            difficulty = 2;
                        }
                        UpdateQuestion(100);
                        Question.setBackgroundColor(Color.RED);
                    }
                    else if (mscore>2){
                        if(difficulty==0){
                            Toast.makeText(MathQuizActivity.this, "Difficulty has set to medium", Toast.LENGTH_SHORT).show();
                            difficulty = 1;
                        }
                        UpdateQuestion(25);
                        Question.setBackgroundColor(Color.YELLOW);
                    }
                    else{
                        UpdateQuestion(10);

                    }
                }else{
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MathQuizActivity.this);


                    alertDialogBuilder
                            .setTitle("FINAL SCORE :" + mscore)
                            .setMessage("RIGHT ANSWER IS "+  numAnswer +" RETRY QUIZ ?")
                            .setCancelable(false)
                            .setPositiveButton("YES",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    startActivity(new Intent(getApplicationContext(),MathQuizActivity.class));
                                }
                            })
                            .setNegativeButton("NO",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                    startActivity(intent);
                                }
                            });

                    alertDialogBuilder.show();
                }
            }
        });
    }
    public void UpdateQuestion(int range){
        num1 = r.nextInt(range);
        num2 = r.nextInt(range);
        numAnswer = (num1 * num2) ;
        Question.setText(num1+" X "+num2+" = ?");
    }
}