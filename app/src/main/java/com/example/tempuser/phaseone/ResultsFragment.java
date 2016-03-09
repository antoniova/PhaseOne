package com.example.tempuser.phaseone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tempuser on 3/4/16.
 */
public class ResultsFragment extends Fragment {

    static final String label = "RESULTS_FRAGMENT";


    public static ResultsFragment getInstance(){
        return  new ResultsFragment();
    }

    /**
     * some initialization should go here
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    /**
     * Fragment UI is created here
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        //View v = inflater.inflate(R.layout.results_fragment_layout, container, false);
        //return v;
        return inflater.inflate(R.layout.results_fragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
