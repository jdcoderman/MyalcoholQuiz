package com.example.jdcod.myalcoholquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newScore(View view) {
        CheckBox answer1CheckBox = findViewById(R.id.answer1);
        boolean hasAnswer1CheckBox = answer1CheckBox.isChecked();
        CheckBox answer2CheckBox = findViewById(R.id.answer2);
        boolean hasAnswer2CheckBox = answer2CheckBox.isChecked();
        RadioButton radioDeath2 = findViewById(R.id.radio_button_death2);
        boolean radioButtondeath = radioDeath2.isChecked();
        RadioButton radioViolence2 = findViewById(R.id.radio_domestic_violence);
        boolean hasRadioViolence2 = radioViolence2.isChecked();
        RadioButton radioCancer = findViewById(R.id.radio_cancer);
        boolean hasRadioCancer = radioCancer.isChecked();
        EditText userName = findViewById(R.id.user_name);
        String name = userName.getText().toString();

        int score = 0;
        if (hasAnswer1CheckBox && hasAnswer2CheckBox) {
            score = score + 25;
        }

        if (radioButtondeath) {
            score = score + 25;
        }

        if (hasRadioViolence2) {
            score = score + 25;
        }

        if (hasRadioCancer) {
            score = score + 25;
        }
        if(score == 100){
            Toast.makeText(getApplicationContext(), "You score 100", Toast.LENGTH_SHORT).show();
        }
        displayMessage(name + " Your Score is ");
        displayScore(score);

    }

    //method to display a message to the user
    public void displayMessage(String message) {
        TextView userMessage = findViewById(R.id.display_message);
        userMessage.setText(message);
    }

    /**
     * Method to display score
     */
    public void displayScore(int number) {
        TextView scoreTextView = findViewById(R.id.score_text_view);
        scoreTextView.setText("" + number);

    }

}
