package com.nursam.percobaan6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.farhan.myapplication.R;
import com.nursam.percobaan6.FragmentAccount;
import com.nursam.percobaan6.model.FurnitureItem;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {
    View view;
    public FragmentHome() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_fragment, container, false);
        return view;
    }
}
