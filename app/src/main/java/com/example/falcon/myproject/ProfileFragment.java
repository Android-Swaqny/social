package com.example.falcon.myproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.falcon.myproject.adapter.ProfileFragmentsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);
        List<Fragment> fragments = new ArrayList<>();
        List<String> fragmentsTitles = new ArrayList<>();

        fragments.add(new AboutFragment());
        fragmentsTitles.add("About");
        fragments.add(new PhotosFragment());
        fragmentsTitles.add("Photos");
        fragments.add(new FavouritesFragment());
        fragmentsTitles.add("Favourites");

        FragmentManager fragmentManager = ((AppCompatActivity)getContext()).getSupportFragmentManager();
        ProfileFragmentsPagerAdapter profileFragmentsPagerAdapter = new ProfileFragmentsPagerAdapter(fragmentManager,getContext(),fragments,fragmentsTitles);
        ViewPager viewPager = view.findViewById(R.id.profile_fragment_view_pager);
        viewPager.setAdapter(profileFragmentsPagerAdapter);
        TabLayout tabLayout = view.findViewById(R.id.profile_fragment_tabs_layout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}
