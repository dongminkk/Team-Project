package com.deum.myapplicationproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag4 extends Fragment {

    private View view;
    private FirebaseAuth mFirebaseAuth;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.frag4, container, false);

        Button btn_out = view.findViewById(R.id.btn_out);

        btn_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //๋ก๊ทธ์์
                Intent intent = new Intent(getActivity(), LogimActivity.class);
                startActivity(intent);
        }
        });

        return view;
    }


}
