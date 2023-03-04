package com.example.authentication.ui.slideshow;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.authentication.Option;
import com.example.authentication.R;
import com.example.authentication.databinding.FragmentSlideshowBinding;
import com.example.authentication.lostnfound;

public class SlideshowFragment extends Fragment {

private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {



    View root = inflater.inflate(R.layout.fragment_slideshow,container,false);
    Button logout = root.findViewById(R.id.logout);
    return root;
    }
}