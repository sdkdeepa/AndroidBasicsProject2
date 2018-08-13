package com.example.android.cricketapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays the scores of two Cricket teams.
 */

public class MainActivity extends AppCompatActivity {
    int scoreOfTeamA = 0;
    int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the score for Team A during batting.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixTeamA(View view) {
        scoreOfTeamA = scoreOfTeamA + 6;
        displayForTeamA(scoreOfTeamA);
    }

    public void addFourTeamA(View view) {
        scoreOfTeamA = scoreOfTeamA + 4;
        displayForTeamA(scoreOfTeamA);
    }

    public void addThreeTeamA(View view) {
        scoreOfTeamA = scoreOfTeamA + 3;
        displayForTeamA(scoreOfTeamA);
    }

    public void addTwoTeamA(View view) {
        scoreOfTeamA = scoreOfTeamA + 2;
        displayForTeamA(scoreOfTeamA);
    }

    public void addOneTeamA(View view) {
        scoreOfTeamA = scoreOfTeamA + 1;
        displayForTeamA(scoreOfTeamA);
    }

    public void display(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
    }

    /**
     * Displays the score for Team A during batting.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixTeamB(View view) {
        scoreOfTeamB = scoreOfTeamB + 6;
        displayForTeamB(scoreOfTeamB);
    }

    public void addFourTeamB(View view) {
        scoreOfTeamB = scoreOfTeamB + 4;
        displayForTeamB(scoreOfTeamB);
    }

    public void addThreeTeamB(View view) {
        scoreOfTeamB = scoreOfTeamB + 3;
        displayForTeamB(scoreOfTeamB);
    }

    public void addTwoTeamB(View view) {
        scoreOfTeamB = scoreOfTeamB + 2;
        displayForTeamB(scoreOfTeamB);
    }

    public void addOneTeamB(View view) {
        scoreOfTeamB = scoreOfTeamB + 1;
        displayForTeamB(scoreOfTeamB);
    }

    public void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
    }

    /*
        This is the method for Reset button to reset the scores of both the teams.
     */
    public void resetScore(View view) {
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        displayForTeamA(scoreOfTeamA);
        displayForTeamB(scoreOfTeamB);
    }

}
