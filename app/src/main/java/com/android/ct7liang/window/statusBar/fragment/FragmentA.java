package com.android.ct7liang.window.statusBar.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.ct7liang.window.R;
import com.ct7liang.translatestatusbar.TranslateStatusBar;

public class FragmentA extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      return View.inflate(getActivity(), R.layout.fragment_a, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TranslateStatusBar.work(getActivity(), view.findViewById(R.id.top_view));
    }
}
