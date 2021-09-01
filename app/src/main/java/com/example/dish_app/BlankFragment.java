package com.example.dish_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "dishName";
    private static final String ARG_PARAM2 = "dishPrice";
    private static final String ARG_PARAM3= "ingredient";

    // TODO: Rename and change types of parameters
    private String mdishName;
    private int mdishPrice;
    private String mingredient;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mdishName Parameter 1.
     * @param mdishPrice Parameter 2.
     * @param mingredient Parameter 3.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String mdishName, int mdishPrice,String mingredient) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, mdishName);
        args.putInt(ARG_PARAM2, mdishPrice);
        args.putString(ARG_PARAM3, mingredient);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mdishName = getArguments().getString(ARG_PARAM1);
            mdishPrice = getArguments().getInt(ARG_PARAM2);
            mingredient = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}