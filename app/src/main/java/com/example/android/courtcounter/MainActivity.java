package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score){
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBScore.setText(String.valueOf(score));
    }

    public void threePoint(View view){
        if(view.getId() == R.id.a_three_point) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }else if(view.getId() == R.id.b_three_point){
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
    }

    public void twoPoint(View view){
        if(view.getId() == R.id.a_two_point) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        }else if(view.getId() == R.id.b_two_point){
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
    }

    public void freeThrow(View view){
        if(view.getId() == R.id.a_one_point) {
            displayForTeamA(++scoreTeamA);
        }else if(view.getId() == R.id.b_one_point){
            displayForTeamB(++scoreTeamB);
        }
    }

    public void Reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
