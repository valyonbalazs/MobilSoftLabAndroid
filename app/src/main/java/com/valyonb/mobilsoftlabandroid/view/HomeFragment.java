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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.analytics.Tracker;
import com.valyonb.mobilsoftlabandroid.R;
import com.valyonb.mobilsoftlabandroid.adapter.HomeAdapter;
import com.valyonb.mobilsoftlabandroid.model.Movie;
import com.valyonb.mobilsoftlabandroid.model.MovieModel;
import com.valyonb.mobilsoftlabandroid.presenter.HomePresenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class HomeFragment extends Fragment implements HomeScreen {


    private OnFragmentInteractionListener mListener;
    private RecyclerView recyclerViewMovies;
    private List<MovieModel> movieList;
    private HomeAdapter homeAdapter;
    private ImageButton addBtn;


    public HomeFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        HomePresenter.getInstance().attachScreen(this);
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
        try {
            showMovies(HomePresenter.getInstance().loadMovies());
        } catch (Exception e) {
            e.printStackTrace();
        }
        homeAdapter = new HomeAdapter(getContext(), movieList);
        recyclerViewMovies.setAdapter(homeAdapter);
        homeAdapter.notifyDataSetChanged();

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
