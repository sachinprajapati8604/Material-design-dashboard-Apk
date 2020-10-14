package com.example.materisldesigndashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_profile,btn_education,btn_timetable,btn_project,btn_health,btn_feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_profile=(Button)findViewById(R.id.buttonProfile);
        btn_education=(Button)findViewById(R.id.buttonEducation);
        btn_timetable=(Button)findViewById(R.id.buttonTimeTable);
        btn_project=(Button)findViewById(R.id.buttonProject);
        btn_health=(Button)findViewById(R.id.buttonHealth);
        btn_feedback=(Button)findViewById(R.id.buttonfeedback);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "E-learning clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Timetable clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Project Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Health Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),Feedback.class));

                //Toast.makeText(MainActivity.this, "Feedback Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
