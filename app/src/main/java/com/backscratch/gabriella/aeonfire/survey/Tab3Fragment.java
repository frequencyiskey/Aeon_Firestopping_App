package com.backscratch.gabriella.aeonfire.survey;

import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

import com.backscratch.gabriella.aeonfire.R;

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_survey_tab3,container,false);
        return view;

    }
}