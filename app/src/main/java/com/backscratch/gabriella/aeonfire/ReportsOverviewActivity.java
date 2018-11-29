package com.backscratch.gabriella.aeonfire;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.backscratch.gabriella.aeonfire.newsurvey.NewSurveyActivity;

public class ReportsOverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports_overview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.newSurveyButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final PopupMenu popupMenu = new PopupMenu(ReportsOverviewActivity.this, fab);
                popupMenu.getMenuInflater().inflate(R.menu.new_report_popup, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(ReportsOverviewActivity.this, "" + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        switch (menuItem.getItemId()) {
                            case R.id.newSurvey:
                                Intent intent1 = new Intent(ReportsOverviewActivity.this, NewSurveyActivity.class);//firstActivity
                                startActivity(intent1);
                                return true;
                            case R.id.newInstallation:
                                /*Intent intent2 = new Intent(ReportsOverviewActivity.this, NewInstallationActivity.class);//second Activity
                                startActivity(intent2);*/
                                return true;
                            default:
                                return false;
                        }
                    }
                });

                popupMenu.show();

            }
        });
    }

}
