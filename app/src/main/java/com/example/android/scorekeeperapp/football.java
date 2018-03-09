package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class football extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulOfTeamA = 0;
    int foulOfTeamB = 0;
    String resultMassage;
    String foulOfBothTeamResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

    }

    public void goalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void goalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulTeamA(View v) {
        foulOfTeamA = foulOfTeamA + 1;
    }

    public void foulTeamB(View v) {
        foulOfTeamB = foulOfTeamB + 1;
    }

    public void resultOfBothTeam(View v) {
        foulOfBothTeamResult = "Team A Foul: " + foulOfTeamA + " Team B Foul: " + foulOfTeamB;

        if (scoreTeamA == scoreTeamB) {
            resultMassage = "Its a Draw";
            resultOfBothTeam(resultMassage);
            foulOfBothTeam(foulOfBothTeamResult);
        } else if (scoreTeamA > scoreTeamB) {
            resultMassage = "Team A Wins";
            resultOfBothTeam(resultMassage);
            foulOfBothTeam(foulOfBothTeamResult);
        } else if (scoreTeamA < scoreTeamB) {
            resultMassage = "Team B Wins";
            resultOfBothTeam(resultMassage);
            foulOfBothTeam(foulOfBothTeamResult);
        }
    }

    /**
     * Reset all stats for both team
     **/
    public void resetForBothTeam(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulOfTeamA = 0;
        foulOfTeamB = 0;
        resultMassage = "";
        foulOfBothTeamResult = "";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        resultOfBothTeam(resultMassage);
        foulOfBothTeam(foulOfBothTeamResult);
    }

    /**
     * Display method
     **/
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

    private void foulOfBothTeam(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.foul_of_team);
        priceTextView.setText(message);
    }
}