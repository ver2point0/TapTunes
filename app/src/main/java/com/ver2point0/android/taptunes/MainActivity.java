package com.ver2point0.android.taptunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the album image
        ImageView albumImage = (ImageView) findViewById(R.id.album_image);
        // Set a click listener on the albumImage view
        if (albumImage != null) {
            albumImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent albumImageIntent = new Intent(MainActivity.this, TuneDetails.class);
                    startActivity(albumImageIntent);
                }
            });
        }
    }
}
