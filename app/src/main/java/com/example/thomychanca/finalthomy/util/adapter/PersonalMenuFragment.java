package com.example.thomychanca.finalthomy.util.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by thomychanca on 21/03/2017.
 */
import com.example.thomychanca.finalthomy.R;
import com.example.thomychanca.finalthomy.util.profile.ProfileFragment;

public class PersonalMenuFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PersonalMenuFragment() {
    }

    public static PersonalMenuFragment newInstance(int sectionNumber) {
        PersonalMenuFragment fragment = new PersonalMenuFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_personal_menu, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R.id.b_go_to_personal_menu)
    public void onProfileButtonClicked(){
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container, new ProfileFragment())
                .commit();
    }
}

