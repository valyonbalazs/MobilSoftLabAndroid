package com.valyonb.mobilsoftlabandroid.presenter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.interactor.FavouritesInteractor;
import com.valyonb.mobilsoftlabandroid.view.FavouritesFragment.OnListFragmentInteractionListener;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.view.FavouritesFragment;

import java.util.List;

public class FavouritesPresenter extends
        RecyclerView.Adapter<FavouritesPresenter.ViewHolder>
        implements FavouritesFragment.OnListFragmentInteractionListener
{

    private static List<MovieModel> mValues = null;
    private static OnListFragmentInteractionListener mListener = null;
    private static FavouritesPresenter instance = null;

    public FavouritesPresenter() {

    }

    public static FavouritesPresenter getInstance(OnListFragmentInteractionListener listener) {
        if(instance == null) {
            instance = new FavouritesPresenter();
            mValues = new FavouritesInteractor().ITEMS;
            mListener = listener;
        }
        return instance;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_moviemodel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.movieTitle.setText(mValues.get(position).getMovieTitle());
        holder.movieShortDescription.setText(mValues.get(position).getMovieShortDescription());

        holder.movieItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    @Override
    public void onListFragmentInteraction(MovieModel item) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View movieItem;
        public ImageView movieImage = null;
        public final TextView movieTitle;
        public final TextView movieShortDescription;
        public MovieModel mItem;

        public ViewHolder(View view) {
            super(view);
            movieItem = view;
            movieTitle = (TextView) view.findViewById(R.id.movieTitle);
            movieShortDescription = (TextView) view.findViewById(R.id.shortDescription);
            movieImage = (ImageView) view.findViewById(R.id.moviePhoto);
            movieImage.setImageResource(R.drawable.swlogotest);
        }

    }
}
