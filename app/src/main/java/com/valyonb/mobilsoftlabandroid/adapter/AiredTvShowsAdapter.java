package com.valyonb.mobilsoftlabandroid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.model.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valyonbalazs on 21/04/16.
 */
public class AiredTvShowsAdapter extends RecyclerView.Adapter<AiredTvShowsAdapter.ViewHolder> {

    private List<Movie> movieList;
    private Context context;

    public AiredTvShowsAdapter(Context context, List<Movie> moviesList) {
        this.context = context;
        this.movieList = new ArrayList<>();
        this.movieList.addAll(moviesList);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fragment_moviemodel, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movie movie = movieList.get(position);

        holder.movieTitle.setText(movie.getMovieTitle());
        holder.movieShortDescription.setText(movie.getMovieShortDescription());
    }

    @Override
    public int getItemCount() {
        if (movieList == null) {
            return 0;
        } else {
            return movieList.size();
        }
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView moviePhoto;
        public TextView movieTitle;
        public TextView movieShortDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            moviePhoto = (ImageView) itemView.findViewById(R.id.moviePhoto);
            movieTitle = (TextView) itemView.findViewById(R.id.movieTitle);
            movieShortDescription = (TextView) itemView.findViewById(R.id.shortDescription);
        }
    }
}
