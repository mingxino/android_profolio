package com.example.oum.myappprofolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.popular_movies) Button movies;
    @BindView(R.id.stock_hawk) Button stock;
    @BindView(R.id.build_it_bigger) Button bigger;
    @BindView(R.id.material) Button material;
    @BindView(R.id.ubiquitous) Button ubiquitous;
    @BindView(R.id.capstone) Button capstone;
    private Unbinder unbinder;

    public void onDestroy() {
        unbinder.unbind();
        super.onDestroy();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        getString(R.string.format_app, getString(R.string.popular_movies)),Toast.LENGTH_SHORT).show();
            }
        });

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        getString(R.string.format_app, getString(R.string.stock_hawk)),Toast.LENGTH_SHORT).show();
            }
        });

        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        getString(R.string.format_app, getString(R.string.build_it_bigger)),Toast.LENGTH_SHORT).show();            }
        });

        material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        getString(R.string.format_app, getString(R.string.material)),Toast.LENGTH_SHORT).show();            }
        });

        ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        getString(R.string.format_app, getString(R.string.go_ubiquitous)),Toast.LENGTH_SHORT).show();            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        getString(R.string.format_app, getString(R.string.capstone)),Toast.LENGTH_SHORT).show();            }
        });

    }
}
