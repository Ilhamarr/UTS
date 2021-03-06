package com.example.counterandroid.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.counterandroid.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;

    TextView txtCounter;
    int count;
    Button minus, reset, plus;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>()
        txtCounter = root.findViewById(R.id.counter);
        minus = root.findViewById(R.id.minus);
        reset = root.findViewById(R.id.reset);
        plus = root.findViewById(R.id.plus);

        minus.setOnClickListener(this);
        reset.setOnClickListener(this);
        plus.setOnClickListener(this);

        return root;
    }

//    private View.OnClickListener cliklistener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            case R.id.minus:
//            pluscounter();
//            break;
//            case R.id.reset:
//            txtCounter.setText(resetcounter());
//            break;
//            case R.id.plus:
//            txtCounter.setText(mincounter());
//            break;
//
//        }
//    };

//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =new ViewModelProvider
//    }
//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        Counter = view.findViewById(R.id.counter);
//        minus = view.findViewById(R.id.minus);
//        reset = view.findViewById(R.id.reset);
//        plus = view.findViewById(R.id.plus);
//
//        minus.setOnClickListener(this);
//        reset.setOnClickListener(this);
//        plus.setOnClickListener(this);
//
//        return view;
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.minus:
                minuscounter();
                break;
            case R.id.reset:
               resetcounter();
                break;
            case R.id.plus:
                pluscounter();
                break;
    }
}

    private void pluscounter() {
        count++;
        txtCounter.setText(count + "");
    }

    private void resetcounter() {
        count = 0;
        txtCounter.setText(count+"");
    }

    private void minuscounter() {
        count--;
        txtCounter.setText(count+"");
    }
    }