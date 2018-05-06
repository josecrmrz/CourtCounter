package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreViewTeamA = null;
    TextView scoreViewTeamB = null;

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewTeamA = findViewById(R.id.team_a_score);
        scoreViewTeamB = findViewById(R.id.team_b_score);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        }

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    @Override
    protected void onSaveInstanceState(Bundle saveState) {
        super.onSaveInstanceState(saveState);
        saveState.putInt("scoreTeamA", scoreTeamA);
        saveState.putInt("scoreTeamB", scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        scoreViewTeamA.setText(String.valueOf(score));
    }

    public void addTouchdownForTeamA(View v) {
        scoreTeamA += 6;

        displayForTeamA(scoreTeamA);
    }

    public void addExtraPointForTeamA(View v) {
        scoreTeamA += 1;

        displayForTeamA(scoreTeamA);
    }

    public void add2PointForTeamA(View v) {
        scoreTeamA += 2;

        displayForTeamA(scoreTeamA);
    }

    public void addFieldGoalForTeamA(View v) {
        scoreTeamA += 3;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
        scoreViewTeamB.setText(String.valueOf(score));
    }

    public void addTouchdownTeamB(View v) {
        scoreTeamB += 6;

        displayForTeamB(scoreTeamB);
    }

    public void addExtraPointTeamB(View v) {
        scoreTeamB += 1;

        displayForTeamB(scoreTeamB);
    }

    public void add2PointsForTeamB(View v) {
        scoreTeamB += 2;

        displayForTeamB(scoreTeamB);
    }

    public void addFieldGoalForTeamB(View v) {
        scoreTeamB += 3;

        displayForTeamB(scoreTeamB);
    }

    /**
     * Rest Team Scores to 0
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
