package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Step 4: Extending the Adapter Class to ArrayAdapter
public class CustomAdapter extends ArrayAdapter {
    //Step 4a: Standard Code
    Context parent_context;
    int layout_id;

    //Step 4b: Edit the Data class name
    ArrayList<Movie> boxList;

    //Step 4c: Standard Code, Change the third argument only
    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.boxList = objects; //Change this line
    }

    //Step 4d: Get the data to set into layout
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Standard code
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain the UI Elements and assign to variables
        ImageView ivRated = (ImageView) rowView.findViewById(R.id.imageViewRated);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = (TextView) rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = (TextView) rowView.findViewById(R.id.textViewGenre);

        Movie currentItem = boxList.get(position);//Standard Code Change the name of the Data class

        //Setting the data
        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());

        if (currentItem.getRated().equalsIgnoreCase("g")) {
            ivRated.setImageResource(R.drawable.rating_g);
        } else if (currentItem.getRated().equalsIgnoreCase("pg13")) {
            ivRated.setImageResource(R.drawable.rating_pg13);
        } else if (currentItem.getRated().equalsIgnoreCase("pg")) {
            ivRated.setImageResource(R.drawable.rating_pg);
        } else if (currentItem.getRated().equalsIgnoreCase("nc16")) {
            ivRated.setImageResource(R.drawable.rating_nc16);
        } else if (currentItem.getRated().equalsIgnoreCase("m18")) {
            ivRated.setImageResource(R.drawable.rating_m18);
        } else if (currentItem.getRated().equalsIgnoreCase("r21")) {
            ivRated.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
