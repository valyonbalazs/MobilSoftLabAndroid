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
import com.valyonb.mobilsoftlabandroid.adapter.NewMoviesAdapter;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;
import com.valyonb.mobilsoftlabandroid.presenter.NewMoviesPresenter;

import java.util.ArrayList;
import java.util.List;

public class NewMoviesFragment extends Fragment implements NewMoviesScreen {

    private OnFragmentInteractionListener mListener;
    private RecyclerView recyclerViewMovies;
    private List<Movie> movieList;
    private NewMoviesAdapter newMoviesAdapter;

    public NewMoviesFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        NewMoviesPresenter.getInstance().attachScreen(this);
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
        showMovies(NewMoviesPresenter.getInstance().loadMovies());
        newMoviesAdapter = new NewMoviesAdapter(getContext(), movieList);
        recyclerViewMovies.setAdapter(newMoviesAdapter);
        newMoviesAdapter.notifyDataSetChanged();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void showMovies(List<Movie> movieList) {
        this.movieList.addAll(movieList);
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
