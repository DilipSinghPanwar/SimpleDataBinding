package com.simpledatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.simpledatabinding.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        binding.tvHeading.setText("Welcome to Tuts");
        binding.tvSubHeading.setText("Welcome to this Android Tutorial on DataBinding");

    }
}