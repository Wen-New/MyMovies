package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Step 5: Declare the activity_main elements
    ListView lvBoxArrangement;
    ArrayList<Movie> boxArrangementList;
    CustomAdapter caBoxArrangement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 5a: Bind the elements and assign it into Variable
        lvBoxArrangement = (ListView)findViewById(R.id.listViewMovie);
        boxArrangementList = new ArrayList<Movie>();
        caBoxArrangement = new CustomAdapter(this, R.layout.movie_row, boxArrangementList);
        lvBoxArrangement.setAdapter(caBoxArrangement);

        //step 5b: Add an object into the Array List
        Movie item1 = new Movie("The Avengers", "2012 - ", "pg13", "Action | Sci-Fi", "15/11/2014", "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        boxArrangementList.add(item1);
        Movie item2 = new Movie("Planes", "2013 - ", "pg", "Animation | Comedy", "15/5/2015", "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        boxArrangementList.add(item2);

        lvBoxArrangement.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(),SecondMainActivity.class);
                Movie movieItem = boxArrangementList.get(i);

                intent.putExtra("title", movieItem.getTitle());
                intent.putExtra("year", movieItem.getYear());
                intent.putExtra("genre", movieItem.getGenre());
                intent.putExtra("desc", movieItem.getDescription());
                intent.putExtra("theatre", movieItem.getIn_theatre());
                intent.putExtra("watched", movieItem.getWatched_on());
                intent.putExtra("rated", movieItem.getRated());
                intent.putExtra("position", i);
                startActivity(intent);

            }
        });
    }
}
