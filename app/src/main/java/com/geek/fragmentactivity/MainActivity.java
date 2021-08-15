package com.geek.fragmentactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.geek.fragmentactivity.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private NavController navController;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initNavController();
    }

    private void initNavController() {
        navController = Navigation.findNavController(this, R.id.container_for_fragments);
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
    }
}