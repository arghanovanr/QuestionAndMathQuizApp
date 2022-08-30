package com.example.sairamkrishna.tugasbesar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    Button Option1,Option2,Option3,Option4;
    TextView Score,Question;
    private Question mQuestion = new Question();
    private String Answer;
    private int mScore = 0;
    private int mQuestionLength = mQuestion.mQuestion.length;
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        Option1 = (Button) findViewById(R.id.btnOption1);
        Option2 = (Button) findViewById(R.id.btnOption2);
        Option3 = (Button) findViewById(R.id.btnOption3);
        Option4 = (Button) findViewById(R.id.btnOption4);

        Score = (TextView) findViewById(R.id.txtScore);
        Question = (TextView) findViewById(R.id.txtQuestion);

        Score.setText("SCORE :" + mScore);
        updateQuestion(index);

        Option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Option1.getText() == Answer ){
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    index++;
                    mScore++;
                    Score.setText("SCORE :" + mScore);
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }else {
                    Toast.makeText(QuizActivity.this, "False", Toast.LENGTH_SHORT).show();
                    index++;
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }
            }
        });

        Option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Option2.getText() == Answer ){
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    index++;
                    mScore++;
                    Score.setText("SCORE :" + mScore);
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }else {
                    Toast.makeText(QuizActivity.this, "False", Toast.LENGTH_SHORT).show();
                    index++;
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }
            }
        });

        Option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Option3.getText() == Answer ){
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    index++;
                    mScore++;
                    Score.setText("SCORE :" + mScore);
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }else {
                    Toast.makeText(QuizActivity.this, "False", Toast.LENGTH_SHORT).show();
                    index++;
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }
            }
        });

        Option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Option4.getText() == Answer ){
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    index++;
                    mScore++;
                    Score.setText("SCORE :" + mScore);
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }else {
                    Toast.makeText(QuizActivity.this, "False", Toast.LENGTH_SHORT).show();
                    index++;
                    if(index<mQuestionLength){
                        updateQuestion(index);
                    }else{
                        mFinish();
                    }
                }
            }
        });
    }

    private void updateQuestion(int number){
        Question.setText(mQuestion.getQuestion(number));
        Option1.setText(mQuestion.getChoice1(number));
        Option2.setText(mQuestion.getChoice2(number));
        Option3.setText(mQuestion.getChoice3(number));
        Option4.setText(mQuestion.getChoice4(number));

        Answer = mQuestion.getCorrectAnswer(number);
    }

    private void mFinish(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);


            alertDialogBuilder
                    .setTitle("FINAL SCORE :" + mScore)
                    .setMessage("RETRY QUIZ ?")
                    .setCancelable(false)
                    .setPositiveButton("YES",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {
                            startActivity(new Intent(getApplicationContext(),QuizActivity.class));
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