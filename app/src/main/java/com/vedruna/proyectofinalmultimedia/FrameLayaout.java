package com.vedruna.proyectofinalmultimedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class FrameLayaout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.frame_layaout);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.inicio);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();

        bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.navigation_inicio) {
                navController.navigate(R.id.inicio);
            } else if (item.getItemId() == R.id.navigation_add) {
                navController.navigate(R.id.anadir);
            } else if (item.getItemId() == R.id.navigation_actualizar) {
                navController.navigate(R.id.actualizar);
            } else if (item.getItemId() == R.id.navigation_borrar) {
                navController.navigate(R.id.borrar);
            }
            return true;
        });
    }
}
