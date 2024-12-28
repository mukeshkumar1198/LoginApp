package com.example.loginappmodule

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentSample2 : Fragment() {

    private val TAG = "FragmentSample2"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: FragmentSample2")
        return inflater.inflate(R.layout.fragment_sample2, container, false)
    }

}