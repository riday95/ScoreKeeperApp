package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cricket extends AppCompatActivity {
    int teamARuns = 0;
    int teamBRuns = 0;
    int teamAWicket = 0;
    int teamBWicket = 0;
    String resultMassage;
    String wicketWinsBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
    }

    /**
     * Stats for Team A
     **/
    public void addOneA(View v) {
        teamARuns = teamARuns + 1;
        displayForTeamARuns(teamARuns);
    }

    public void addFourA(View v) {
        teamARuns = teamARuns + 4;
        displayForTeamARuns(teamARuns);
    }

    public void addSixA(View v) {
        teamARuns = teamARuns + 6;
        displayForTeamARuns(teamARuns);
    }

    public void teamAOut(View v) {
        if (teamAWicket < 10) {
            teamAWicket++;
            displayForTeamAWicket(teamAWicket);
        }
    }

    /**
     * Stats for Team B
     **/
    public void addOneB(View v) {
        teamBRuns = teamBRuns + 1;
        displayForTeamBRuns(teamBRuns);
    }

    public void addFourB(View v) {
        teamBRuns = teamBRuns + 4;
        displayForTeamBRuns(teamBRuns);
    }

    public void addSixB(View v) {
        teamBRuns = teamBRuns + 6;
        displayForTeamBRuns(teamBRuns);
    }

    public void teamBOut(View v) {
        if (teamBWicket < 10) {
            teamBWicket++;
            displayForTeamBWicket(teamBWicket);
        }
    }

    /**
     * Reset for all stats for both team
     **/
    public void resetForBothTeam(View v) {
        teamARuns = 0;
        teamBRuns = 0;
        teamAWicket = 0;
        teamBWicket = 0;
        String resultMassage = "";
        String wicketWinsBy = "";
        displayForTeamARuns(teamARuns);
        displayForTeamAWicket(teamAWicket);
        displayForTeamBRuns(teamBRuns);
        displayForTeamBWicket(teamBWicket);
        displayResultOfBothTeam(resultMassage);
        displayWicketOfBothTeam(wicketWinsBy);
    }

    /**
     * Result of both team
     **/
    public void resultOfBothTeam(View v) {
        if (teamARuns > teamBRuns) {
            resultMassage = "Team A Wins " + (teamARuns - teamBRuns) + " Runs";
            displayResultOfBothTeam(resultMassage);
            wicketWinsBy = "With " + (10 - teamAWicket) + " Wickets";
            displayWicketOfBothTeam(wicketWinsBy);

        } else if (teamARuns < teamBRuns) {
            resultMassage = "Team B Wins " + (teamBRuns - teamARuns) + " Runs";
            displayResultOfBothTeam(resultMassage);
            wicketWinsBy = "With " + (10 - teamBWicket) + " Wickets";
            displayWicketOfBothTeam(wicketWinsBy);
        }
    }

    public void displayForTeamARuns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBRuns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAWicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wicket);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBWicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wicket);
        scoreView.setText(String.valueOf(score));
    }

    private void displayResultOfBothTeam(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.result_of_team);
        priceTextView.setText(message);
    }

    private void displayWicketOfBothTeam(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.wicket_of_team);
        priceTextView.setText(message);
    }
}