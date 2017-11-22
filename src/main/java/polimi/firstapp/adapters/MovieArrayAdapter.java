package polimi.firstapp.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import polimi.firstapp.R;
import polimi.firstapp.app.model.Movie;

/**
 * Created by mirco on 26/10/17.
 */

public class MovieArrayAdapter extends ArrayAdapter<Movie> {

    public MovieArrayAdapter(Context context, List<Movie> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Movie movie = getItem(position);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.movie_item, null);
            //view holder pattern
            MovieViewHolder movieViewHolder = new MovieViewHolder(convertView);
            convertView.setTag(movieViewHolder);
        }
        MovieViewHolder movieViewHolder = (MovieViewHolder) convertView.getTag();
        movieViewHolder.titleTv.setText(movie.getName());
        movieViewHolder.directorTV.setText(movie.getDirectorName());
        return  convertView;
    }

    static class MovieViewHolder {

        TextView titleTv;
        TextView directorTV;

        public MovieViewHolder(View view) {
            titleTv = (TextView) view.findViewById(R.id.movieTitleTextView);
            directorTV = (TextView) view.findViewById(R.id.movieDirectorTextView);
        }
    }
}