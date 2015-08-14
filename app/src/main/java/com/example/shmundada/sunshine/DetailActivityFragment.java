package com.example.shmundada.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent = getActivity().getIntent();
        String forecast_text = intent.getStringExtra(Intent.EXTRA_TEXT);
        View detailView = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView forecast = (TextView) detailView.findViewById(R.id.forecast);
        forecast.setText(forecast_text);
        return detailView;
    }
}
