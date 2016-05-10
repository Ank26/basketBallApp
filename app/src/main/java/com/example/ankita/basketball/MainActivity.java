package com.example.ankita.basketball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a_score = 0;
    int b_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(a_score);
        displayForTeamB(b_score);
    }
    public void plus3points_A(View view){
        a_score = a_score +3 ;
        displayForTeamA(a_score);
    }
    public void plus2points_A(View view){
        a_score = a_score +2 ;
        displayForTeamA(a_score);
    }
    public void freeThrow_A(View view){
        a_score = a_score +1 ;
        displayForTeamA(a_score);
    }
    public void plus3points_B(View view){
        b_score = b_score +3 ;
        displayForTeamB(b_score);
    }
    public void plus2points_B(View view){
        b_score = b_score +2 ;
        displayForTeamB(b_score);
    }
    public void freeThrow_B(View view){
        b_score = b_score +1 ;
        displayForTeamB(b_score);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetGame(View view){
        displayForTeamA(0);
      displayForTeamB(0);
    }

}
