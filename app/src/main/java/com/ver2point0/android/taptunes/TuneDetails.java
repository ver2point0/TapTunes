package com.ver2point0.android.taptunes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TuneDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tune_details);

        // Find the View that shows the detail album image
        ImageView detailAlbumImage = (ImageView) findViewById(R.id.detail_album_image);
        // Set a click listener on the detailAlbumImage view
        if (detailAlbumImage != null) {
            detailAlbumImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent detailAlbumImageIntent = new Intent(TuneDetails.this,  MainActivity.class);
                    startActivity(detailAlbumImageIntent);
                }
            });
        }

        // Find the View that shows the genre text view
        TextView genreTextView = (TextView) findViewById(R.id.detail_genre);
        // Set a click listener on the detailGenre text view
        if (genreTextView != null) {
            genreTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent genreTextViewIntent = new Intent(TuneDetails.this,  TuneGenre.class);
                    startActivity(genreTextViewIntent);
                }
            });
        }
    }
}
