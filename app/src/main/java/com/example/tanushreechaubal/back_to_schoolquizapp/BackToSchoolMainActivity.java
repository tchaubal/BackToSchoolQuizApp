package com.example.tanushreechaubal.back_to_schoolquizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class BackToSchoolMainActivity extends AppCompatActivity {
    int score=0;
    TextView question1_textView, question2_textView,question3_textView,question4_textView,question5_textView,question6_textView,question7_textView,question8_textView,question9_textView,question10_textView;
    RadioButton question1_answerOption1;
    RadioButton question1_answerOption2;
    RadioButton question1_answerOption3;
    RadioButton question1_answerOption4;
    CheckBox question2_answer1, question2_answer2, question2_answer3, question2_answer4, question2_answer5, question2_answer6, question2_answer7;
    EditText question3_answerOption, question6_answerOption, question10_answerOption;
    String question3_answer;
    String question3_correctAnswer1 = "8";
    String question3_correctAnswer2 = "Eight";
    String question3_correctAnswer3 = "eight";
    String question3_correctAnswer4 = "EIGHT";
    RadioButton question4_answerOption1;
    RadioButton question4_answerOption2;
    RadioButton question4_answerOption3;
    RadioButton question4_answerOption4;
    CheckBox question5_answer1, question5_answer2, question5_answer3, question5_answer4, question5_answer5, question5_answer6, question5_answer7;
    String question6_answer;
    String question6_correctAnswer1 = "Sholay";
    String question6_correctAnswer2 = "SHOLAY";
    String question6_correctAnswer3 = "sholay";
    RadioButton question7_answerOption1;
    RadioButton question7_answerOption2;
    RadioButton question7_answerOption3;
    RadioButton question7_answerOption4;
    CheckBox question8_answer1, question8_answer2, question8_answer3, question8_answer4, question8_answer5, question8_answer6, question8_answer7;
    RadioButton question9_answerOption1;
    RadioButton question9_answerOption2;
    RadioButton question9_answerOption3;
    RadioButton question9_answerOption4;
    String question10_answer;
    String question10_correctAnswer1 = "Laughter";
    String question10_correctAnswer2 = "laughter";
    String question10_correctAnswer3 = "LAUGHTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_to_school_main);
    }
    /*
    *** This method checks if answers selected for question 1 are correct or not.
    *** Accepted correct answer is Option 2 => "Mica"
     */
    public Boolean checkQuestion1() {
        question1_answerOption2 = findViewById(R.id.question1_radioButton2);
        question1_answerOption1 = findViewById(R.id.question1_radioButton1);
        question1_answerOption3 = findViewById(R.id.question1_radioButton3);
        question1_answerOption4 = findViewById(R.id.question1_radioButton4);
        if (question1_answerOption2.isChecked()) {
            if (!(question1_answerOption1.isChecked() && question1_answerOption3.isChecked() && question1_answerOption4.isChecked())) {
                return true;
            }
        }
        return false;
    }
    /*
    *** This method checks if answers selected for question 2 are correct or not.
    *** Accepted correct answers will include Option 4 => "W" and Option 6 => "N"
     */
    public Boolean checkQuestion2(){
        question2_answer1 = findViewById(R.id.question2_checkbox4);
        question2_answer2 = findViewById(R.id.question2_checkbox6);
        question2_answer3 = findViewById(R.id.question2_checkbox1);
        question2_answer4 = findViewById(R.id.question2_checkbox2);
        question2_answer5 = findViewById(R.id.question2_checkbox3);
        question2_answer6 = findViewById(R.id.question2_checkbox5);
        question2_answer7 = findViewById(R.id.question2_checkbox7);
        if(question2_answer1.isChecked() && question2_answer2.isChecked() && !question2_answer3.isChecked() && !question2_answer4.isChecked() && !question2_answer5.isChecked() && !question2_answer6.isChecked() && !question2_answer7.isChecked()){
                return true;
        }
        return false;
    }
    /*
    *** This method checks if answers selected for question 3 are correct or not.
    *** Accepted correct answers will include the String "8" or "Eight" or "EIGHT" or "eight"
     */
    public Boolean checkQuestion3(){
        question3_answerOption = findViewById(R.id.question3_editText);
        question3_answer = question3_answerOption.getText().toString();
        if(((question3_answer.toLowerCase().indexOf(question3_correctAnswer1.toLowerCase()))!= -1) || ((question3_answer.toLowerCase().indexOf(question3_correctAnswer2.toLowerCase()))!= -1)  || ((question3_answer.toLowerCase().indexOf(question3_correctAnswer3.toLowerCase()))!= -1)  || ((question3_answer.toLowerCase().indexOf(question3_correctAnswer4.toLowerCase()))!= -1) ){
                return true;
            }
        return false;
    }
    /*
    *** This method checks if answers selected for question 4 are correct or not.
    *** Accepted correct answer is Option 4 => "All of the above"
     */
    public Boolean checkQuestion4(){
        question4_answerOption1 = findViewById(R.id.question4_radioButton1);
        question4_answerOption2 = findViewById(R.id.question4_radioButton2);
        question4_answerOption3 = findViewById(R.id.question4_radioButton3);
        question4_answerOption4 = findViewById(R.id.question4_radioButton4);
        if(question4_answerOption4.isChecked()){
            if(!(question4_answerOption1.isChecked() && question4_answerOption2.isChecked() && question4_answerOption3.isChecked())){
                return true;
            }
        }
        return false;
    }
    /*
    *** This method checks if answers selected for question 5 are correct or not.
    *** Accepted correct answers will include Option 1 => "Indira Gandhi", Option 5 => "I.K. Gujral" and Option 6 => "Lal Bahadur Shastri"
     */
    public Boolean checkQuestion5(){
        question5_answer1 = findViewById(R.id.question5_checkbox1);
        question5_answer2 = findViewById(R.id.question5_checkbox2);
        question5_answer3 = findViewById(R.id.question5_checkbox3);
        question5_answer4 = findViewById(R.id.question5_checkbox4);
        question5_answer5 = findViewById(R.id.question5_checkbox5);
        question5_answer6 = findViewById(R.id.question5_checkbox6);
        question5_answer7 = findViewById(R.id.question5_checkbox7);
        if(question5_answer1.isChecked() && question5_answer5.isChecked() && question5_answer6.isChecked() && !question5_answer2.isChecked() && !question5_answer3.isChecked() && !question5_answer4.isChecked() && !question5_answer7.isChecked()){
                return true;
            }
        return false;
    }
    /*
    *** This method checks if answers selected for question 6 are correct or not.
    *** Accepted correct answers will include the String "Sholay" or "sholay" or "SHOLAY"
     */
    public Boolean checkQuestion6(){
        question6_answerOption = findViewById(R.id.question6_editText);
        question6_answer = question6_answerOption.getText().toString();
        if(((question6_answer.toLowerCase().indexOf(question6_correctAnswer1.toLowerCase()))!= -1)  || ((question6_answer.toLowerCase().indexOf(question6_correctAnswer2.toLowerCase()))!= -1)  || ((question6_answer.toLowerCase().indexOf(question6_correctAnswer3.toLowerCase()))!= -1) ){
            return true;
        }
        return false;
    }
    /*
    *** This method checks if answers selected for question 7 are correct or not.
    *** Accepted correct answer is Option 3 => "Joule"
     */
    public Boolean checkQuestion7(){
        question7_answerOption1 = findViewById(R.id.question7_radioButton1);
        question7_answerOption2 = findViewById(R.id.question7_radioButton2);
        question7_answerOption3 = findViewById(R.id.question7_radioButton3);
        question7_answerOption4 = findViewById(R.id.question7_radioButton4);
        if (question7_answerOption3.isChecked()) {
            if (!(question7_answerOption1.isChecked() && question7_answerOption2.isChecked() && question7_answerOption4.isChecked())) {
                return true;
            }
        }
        return false;
    }
    /*
    *** This method checks if answers selected for question 8 are correct or not.
    *** Accepted correct answers will include Option 3 => "Chrysanthemum" and Option 5 => "Carnation"
     */
    public Boolean checkQuestion8(){
        question8_answer1 = findViewById(R.id.question8_checkbox1);
        question8_answer2 = findViewById(R.id.question8_checkbox2);
        question8_answer3 = findViewById(R.id.question8_checkbox3);
        question8_answer4 = findViewById(R.id.question8_checkbox4);
        question8_answer5 = findViewById(R.id.question8_checkbox5);
        question8_answer6 = findViewById(R.id.question8_checkbox6);
        question8_answer7 = findViewById(R.id.question8_checkbox7);
        if(question8_answer3.isChecked() && question8_answer5.isChecked() && !question8_answer1.isChecked() && !question8_answer2.isChecked() && !question8_answer4.isChecked() && !question8_answer6.isChecked() && !question8_answer7.isChecked()){
                return true;
            }
        return false;
    }
    /*
    *** This method checks if answers selected for question 9 are correct or not.
    *** Accepted correct answer is Option 2 => "5"
     */
    public Boolean checkQuestion9(){
        question9_answerOption1 = findViewById(R.id.question9_radioButton1);
        question9_answerOption2 = findViewById(R.id.question9_radioButton2);
        question9_answerOption3 = findViewById(R.id.question9_radioButton3);
        question9_answerOption4 = findViewById(R.id.question9_radioButton4);
        if (question9_answerOption2.isChecked()) {
            if (!(question9_answerOption1.isChecked() && question9_answerOption3.isChecked() && question9_answerOption4.isChecked())) {
                return true;
            }
        }
        return false;
    }
    /*
    *** This method checks if answers selected for question 10 are correct or not.
    *** Accepted correct answers will include the String "Laughter" or "laughter" or "LAUGHTER"
     */
    public Boolean checkQuestion10(){
        question10_answerOption = findViewById(R.id.question10_editText);
        question10_answer = question10_answerOption.getText().toString();
        if(((question10_answer.toLowerCase().indexOf(question10_correctAnswer1.toLowerCase()))!= -1)  || ((question10_answer.toLowerCase().indexOf(question10_correctAnswer2.toLowerCase()))!= -1)  || ((question10_answer.toLowerCase().indexOf(question10_correctAnswer3.toLowerCase()))!= -1) ){
            return true;
        }
        return false;
    }
    /*
    *** This method checks the score of the quiz based on answers selected and displays the results to the user.
    *** On clicking the Submit button, the correct score out of a total of 10 is displayed to the user via Toast message.
    *** At the same time, the questions answered correctly are marked GREEN in the app, while those answered incorrectly are marked RED.
    *** Once the user enters correct answers for all incorrectly answered questions, the score is updated and the question is marked GREEN.
     */
    public void submitQuiz(View v){
        int scoreFor1 = 0;
        int scoreFor2 = 0;
        int scoreFor3 = 0;
        int scoreFor4 = 0;
        int scoreFor5 = 0;
        int scoreFor6 = 0;
        int scoreFor7 = 0;
        int scoreFor8 = 0;
        int scoreFor9 = 0;
        int scoreFor10 = 0;

        question1_textView = findViewById(R.id.question1_textView);
        question2_textView = findViewById(R.id.question2_textView);
        question3_textView = findViewById(R.id.question3_textView);
        question4_textView = findViewById(R.id.question4_textView);
        question5_textView = findViewById(R.id.question5_textView);
        question6_textView = findViewById(R.id.question6_textView);
        question7_textView = findViewById(R.id.question7_textView);
        question8_textView = findViewById(R.id.question8_textView);
        question9_textView = findViewById(R.id.question9_textView);
        question10_textView = findViewById(R.id.question10_textView);

        if(checkQuestion1()){
            scoreFor1 = score + 1;
            question1_textView.setBackgroundColor(Color.GREEN);
        }else{
            question1_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion2()){
            scoreFor2 = score + 1;
            question2_textView.setBackgroundColor(Color.GREEN);
        } else{
            question2_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion3()){
            scoreFor3 = score + 1;
            question3_textView.setBackgroundColor(Color.GREEN);
        }else{
            question3_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion4()){
            scoreFor4 = score + 1;
            question4_textView.setBackgroundColor(Color.GREEN);
        }else{
            question4_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion5()){
            scoreFor5 = score + 1;
            question5_textView.setBackgroundColor(Color.GREEN);
        }else{
            question5_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion6()){
            scoreFor6 = score + 1;
            question6_textView.setBackgroundColor(Color.GREEN);
        }else{
            question6_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion7()){
            scoreFor7 = score + 1;
            question7_textView.setBackgroundColor(Color.GREEN);
        }else{
            question7_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion8()){
            scoreFor8 = score + 1;
            question8_textView.setBackgroundColor(Color.GREEN);
        }else{
            question8_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion9()){
            scoreFor9 = score + 1;
            question9_textView.setBackgroundColor(Color.GREEN);
        }else{
            question9_textView.setBackgroundColor(Color.RED);
        }

        if(checkQuestion10()){
            scoreFor10 = score + 1;
            question10_textView.setBackgroundColor(Color.GREEN);
        }else{
            question10_textView.setBackgroundColor(Color.RED);
        }
        updateScore(scoreFor1, scoreFor2, scoreFor3, scoreFor4, scoreFor5, scoreFor6, scoreFor7, scoreFor8, scoreFor9, scoreFor10);
    }
    /*
    *** This message updates the final score of the quiz.
     */
    private void updateScore(int scoreFor1, int scoreFor2, int scoreFor3, int scoreFor4, int scoreFor5, int scoreFor6, int scoreFor7, int scoreFor8, int scoreFor9, int scoreFor10) {
        int finalScore = scoreFor1 + scoreFor2 + scoreFor3 + scoreFor4 + scoreFor5 + scoreFor6 + scoreFor7 + scoreFor8 + scoreFor9 + scoreFor10;
        displayToast(finalScore);
    }
    /*
    *** This message displays the score and results(GREEN=correctly answered questions, RED=incorrectly answered questions) to the user.
     */
    public void displayToast(int score){
        if(score == 10){
            Toast.makeText(BackToSchoolMainActivity.this, "Yay! You're a pro at this! \nYour score is: 10/" + score, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(BackToSchoolMainActivity.this, "Your score is: " + score + "/10 \nTry Again!", Toast.LENGTH_SHORT).show();
        }
    }
}
