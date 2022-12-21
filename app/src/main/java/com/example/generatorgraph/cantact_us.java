package com.example.generatorgraph;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;



public class cantact_us extends Fragment {

    public cantact_us() {
    }

    public static cantact_us newInstance() {
        cantact_us fragment = new cantact_us();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cantact_us, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView text2 =view.findViewById(R.id.gmailderi);
        TextView text1 =view.findViewById(R.id.gmailm);
        Button copy1=view.findViewById(R.id.copy1);
        Button copy2=view.findViewById(R.id.copy2);


        copy1.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)  requireActivity().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("TextView", text1.getText().toString());
            clipboard.setPrimaryClip(clip);

            Toast.makeText(getContext(), "copied", Toast.LENGTH_SHORT).show();

        });
        copy2.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)  requireActivity().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("TextView", text2.getText().toString());
            clipboard.setPrimaryClip(clip);

            Toast.makeText(getContext(), "copied", Toast.LENGTH_SHORT).show();

        });

    }

}