package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvYear;
    TextView tvGenre;
    TextView tvDesc;
    TextView tvWatched;
    TextView tvTheatre;
    ImageView ivRated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        tvTitle = (TextView) findViewById(R.id.textViewTitle);
        tvYear = (TextView) findViewById(R.id.textViewYear);
        tvGenre = (TextView) findViewById(R.id.textViewGenre);
        tvDesc = (TextView) findViewById(R.id.textViewDesc);
        tvWatched = (TextView) findViewById(R.id.textViewWatched);
        tvTheatre = (TextView) findViewById(R.id.textViewTheatre);
        ivRated = (ImageView) findViewById(R.id.imageViewRated);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String desc = intentReceived.getStringExtra("desc");
        String watched = intentReceived.getStringExtra("watched");
        String theatre = intentReceived.getStringExtra("theatre");
        String image = intentReceived.getStringExtra("image");
        String rated = intentReceived.getStringExtra("rated");
        int position = intentReceived.getIntExtra("position", -1);

        if (position == 0) {
            if (rated.equals("g")) {
                ivRated.setImageResource(R.drawable.rating_g);
            }else if (rated.equals("m_18")) {
                ivRated.setImageResource(R.drawable.rating_m18);
            }else if (rated.equals("nc16")) {
                ivRated.setImageResource(R.drawable.rating_nc16);
            }else if (rated.equals("pg")) {
                ivRated.setImageResource(R.drawable.rating_pg);
            }else if (rated.equals("pg13")) {
                ivRated.setImageResource(R.drawable.rating_pg13);
            }else if (rated.equals("r21")) {
                ivRated.setImageResource(R.drawable.rating_r21);
            }
            tvTitle.setText(title);
            tvYear.setText(year);
            tvGenre.setText(genre);
            tvDesc.setText(desc);
            tvWatched.setText(watched);
            tvTheatre.setText(theatre);
        }else if (position == 1) {
            if (rated.equals("g")) {
                ivRated.setImageResource(R.drawable.rating_g);
            }else if (rated.equals("m_18")) {
                ivRated.setImageResource(R.drawable.rating_m18);
            }else if (rated.equals("nc16")) {
                ivRated.setImageResource(R.drawable.rating_nc16);
            }else if (rated.equals("pg")) {
                ivRated.setImageResource(R.drawable.rating_pg);
            }else if (rated.equals("pg13")) {
                ivRated.setImageResource(R.drawable.rating_pg13);
            }else if (rated.equals("r21")) {
                ivRated.setImageResource(R.drawable.rating_r21);
            }
            tvTitle.setText(title);
            tvYear.setText(year);
            tvGenre.setText(genre);
            tvDesc.setText(desc);
            tvWatched.setText(watched);
            tvTheatre.setText(theatre);
        }

    }
}
