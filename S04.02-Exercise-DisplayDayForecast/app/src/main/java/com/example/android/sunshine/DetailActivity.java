package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView weatherInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        weatherInfoTextView = (TextView)findViewById(R.id.tv_weather_info);

        Intent intentThatStartThisActivity = this.getIntent();
        if( intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT))
        {
            weatherInfoTextView.setText(intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEXT));
        }
        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}