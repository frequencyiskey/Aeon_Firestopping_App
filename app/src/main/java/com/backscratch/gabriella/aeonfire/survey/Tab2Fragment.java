package com.backscratch.gabriella.aeonfire.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.backscratch.gabriella.aeonfire.LoginActivity;
import com.backscratch.gabriella.aeonfire.R;
import com.backscratch.gabriella.aeonfire.ReportsOverviewActivity;

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private Button btnLIST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey_tab2,container,false);
        btnLIST = (Button) view.findViewById(R.id.btnLIST);

        btnLIST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent problem = new Intent(getActivity(), NewProblemActivity.class);
                startActivity(problem);
            }
        });

        return view;
    }
}