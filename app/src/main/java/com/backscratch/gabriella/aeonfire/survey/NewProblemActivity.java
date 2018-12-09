package com.backscratch.gabriella.aeonfire.survey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.backscratch.gabriella.aeonfire.LoginActivity;
import com.backscratch.gabriella.aeonfire.R;
import com.backscratch.gabriella.aeonfire.ReportsOverviewActivity;

public class NewProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_problem);

        Button saveButton = (Button) findViewById(R.id.btnSAVE);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //attemptLogin();

                Intent save = new Intent(NewProblemActivity.this, NewSurveyActivity.class);
                startActivity(save);

            }
        });
    }
}
