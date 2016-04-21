package com.valyonb.mobilsoftlabandroid.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.adapter.AiredTvShowsAdapter;
import com.valyonb.mobilsoftlabandroid.adapter.HomeAdapter;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.presenter.AiredTvShowsPresenter;
import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;

import java.util.ArrayList;
import java.util.List;


public class AiredTvShowsFragment extends Fragment implements AiredTvShowsScreen {


    private OnFragmentInteractionListener mListener;
    private RecyclerView recyclerViewMovies;
    private List<MovieModel> movieList;
    private AiredTvShowsAdapter airedTvShowsAdapter;

    public AiredTvShowsFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        AiredTvShowsPresenter.getInstance().attachScreen(this);
    }

    @Override
    public void onDetach() {
        HomePresenter.getInstance().detachScreen();
        super.onDetach();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewMovies = (RecyclerView) view.findViewById(R.id.list);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewMovies.setLayoutManager(llm);

        movieList = new ArrayList<>();
        showMovies(AiredTvShowsPresenter.getInstance().loadMovies());
        airedTvShowsAdapter = new AiredTvShowsAdapter(getContext(), movieList);
        recyclerViewMovies.setAdapter(airedTvShowsAdapter);
        airedTvShowsAdapter.notifyDataSetChanged();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void showMovies(List<MovieModel> movieList) {
        this.movieList.addAll(movieList);
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
