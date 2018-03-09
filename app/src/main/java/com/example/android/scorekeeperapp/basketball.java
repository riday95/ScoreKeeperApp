package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class basketball extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String resultMassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
    }

    public void addThreeA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addFreeThrowA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addFreeThrowB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetForBothTeam(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        resultMassage = "";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        resultOfBothTeam(resultMassage);
    }

    public void resultOfBothTeam(View v) {

        if (scoreTeamA == scoreTeamB) {

            resultMassage = "Its A Draw";
            resultOfBothTeam(resultMassage);
        } else if (scoreTeamA > scoreTeamB) {
            resultMassage = "Team A Wins";
            resultOfBothTeam(resultMassage);
        } else if (scoreTeamA < scoreTeamB) {
            resultMassage = "Team B Wins";
            resultOfBothTeam(resultMassage);
        }

    }

    /**
     * Displays for method
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    private void resultOfBothTeam(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.result_of_team);
        priceTextView.setText(message);
    }
}