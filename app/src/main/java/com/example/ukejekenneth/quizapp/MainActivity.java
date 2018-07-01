package com.example.ukejekenneth.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitResult(View view) {

        //getting Question 1 answer
        RadioButton Q1Answer = (RadioButton) findViewById(R.id.Q_1_c);

        //getting Question 2 answer
        RadioButton Q2Answer = (RadioButton) findViewById(R.id.Q_2_b);

        //getting Question 3 answer
        RadioButton Q3Answer = (RadioButton) findViewById(R.id.Q_3_c);

        //getting Question 4 answer
        RadioButton Q4Answer = (RadioButton) findViewById(R.id.Q_4_a);


        //getting Question 5 answers a,c,d
        CheckBox Q5aCheckBox = (CheckBox) findViewById(R.id.Q_5_a);
        CheckBox Q5cCheckBox = (CheckBox) findViewById(R.id.Q_5_c);
        CheckBox Q5dCheckBox = (CheckBox) findViewById(R.id.Q_5_d);

        //getting Question 6 answers a,b
        CheckBox Q6aCheckBox = (CheckBox) findViewById(R.id.Q_6_a);
        CheckBox Q6bCheckBox = (CheckBox) findViewById(R.id.Q_6_b);


        //getting Question 7 answers a,b,c
        CheckBox Q7aCheckBox = (CheckBox) findViewById(R.id.Q_7_a);
        CheckBox Q7bCheckBox = (CheckBox) findViewById(R.id.Q_7_b);
        CheckBox Q7cCheckBox = (CheckBox) findViewById(R.id.Q_7_c);


        //getting Question 8 answer
        EditText Q8EditText = (EditText) findViewById(R.id.Q_8_text);
        String Q8Answer = Q8EditText.getText().toString();
        // To check mate answer with Uppercase
        String strength= "Strength";

        //getting Question 9 answer
        EditText Q9EditText = (EditText) findViewById(R.id.Q_9_text);
        String Q9Answer = Q9EditText.getText().toString();
        // To check mate answer with Uppercase
        String dignity= "Dignity";

        //getting Question 10 answer
        EditText Q10EditText = (EditText) findViewById(R.id.Q_10_text);
        String Q10Answer = Q10EditText.getText().toString();
        // To check mate answer with Uppercase
        String peace = "Peace";


        //for radio button questions we check if the only one correct answer is checked
        // and if yes increase the score by 1, if no do nothing.

        if (Q1Answer.isChecked()) {
            score+=1;
        }
        if (Q2Answer.isChecked()) {
            score+=1;
        }
        if (Q3Answer.isChecked()) {
            score+=1;
        }
        if (Q4Answer.isChecked()) {
            score+=1;
        }

        /**for check box button questions we check if the correct answer/answers are checked
         and if yes increase the score by 1, if no do nothing.**/

        if (Q5aCheckBox.isChecked() && Q5cCheckBox.isChecked() && Q5dCheckBox.isChecked()) {
            score+=1;
        }
        if (Q6aCheckBox.isChecked() && Q6bCheckBox.isChecked()) {
            score+=1;
        }
        if (Q7aCheckBox.isChecked() && Q7bCheckBox.isChecked() && Q7cCheckBox.isChecked()) {
            score+=1;
        }

        /**for edit text questions we check if the entered answer is equal to the correct answer
         and if yes increase the score by 1, if no do nothing.**/

        if (Q8Answer.trim().equalsIgnoreCase(strength)){
            score+=1;
        }
        if (Q9Answer.trim().equalsIgnoreCase(dignity)){
            score+=1;
        }
        if (Q10Answer.trim().equalsIgnoreCase(peace)) {
            score+=1;
        }


        if (score >= 8){
            //method displayToast was called
            displayToast( "your score is: " + score + "/10" + "\n Congrats you know more about Nigeria");
        }
        else if (score >= 5){
            displayToast("your score is: " + score + "/10" + "\n Good job, You know little about Nigeria");
        }
        else {
            displayToast( "your score is: " + score + "/10" + "\n Try again, You performed poorly");
        }
        score = 0;
    }
    //Define Method for toast
    public void displayToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}

