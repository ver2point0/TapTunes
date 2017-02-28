package com.ver2point0.android.taptunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class TuneGenre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tune_genre);

        // Find the View that shows the genre one linearlayout
        LinearLayout genreLinear = (LinearLayout) findViewById(R.id.genre_one);
        // Set a click listener on the Genre linearlayout
        if (genreLinear != null) {
            genreLinear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent genreLinearIntent = new Intent(TuneGenre.this,  TuneDetails.class);
                    startActivity(genreLinearIntent);
                }
            });
        }
    }
}
