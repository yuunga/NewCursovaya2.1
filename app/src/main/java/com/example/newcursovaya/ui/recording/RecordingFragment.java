package com.example.newcursovaya.ui.recording;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


import com.example.newcursovaya.R;


public class RecordingFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recording, container, false);

        int[] dayButtonIds = {R.id.mondayButton, R.id.tuesdayButton, R.id.wednesdayButton, R.id.thursdayButton, R.id.fridayButton, R.id.saturdayButton, R.id.sundayButton
                ,R.id.dushmondayButton, R.id.dushtuesdayButton, R.id.dushwednesdayButton, R.id.dushthursdayButton, R.id.dushfridayButton, R.id.dushsaturdayButton, R.id.dushsundayButton };
        int[] containerIds = {R.id.mondayContainer, R.id.tuesdayContainer, R.id.wednesdayContainer, R.id.thursdayContainer, R.id.fridayContainer, R.id.saturdayContainer, R.id.sundayContainer
                ,R.id.dushmondayContainer, R.id.dushtuesdayContainer, R.id.dushwednesdayContainer, R.id.dushthursdayContainer, R.id.dushfridayContainer, R.id.dushsaturdayContainer,R.id.dushsundayContainer};

        for (int i = 0; i < dayButtonIds.length; i++) {
            final Button dayButton = view.findViewById(dayButtonIds[i]);
            final LinearLayout dayContainer = view.findViewById(containerIds[i]);

            dayButton.setTag(dayContainer);

            dayButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    LinearLayout clickedContainer = (LinearLayout) view.getTag();

                    if (clickedContainer.getVisibility() == View.GONE) {
                        clickedContainer.setVisibility(View.VISIBLE);
                    } else {
                        clickedContainer.setVisibility(View.GONE);
                    }
                }
            });
        }

        return view;
    }
}