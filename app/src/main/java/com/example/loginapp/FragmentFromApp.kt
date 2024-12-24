package com.example.loginapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.loginapp.databinding.FragmentFromAppBinding


class FragmentFromApp : Fragment() {

    private lateinit var binding: FragmentFromAppBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFromAppBinding.inflate(inflater, container, false);
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Use the binding object to access views
        binding.openLibraryFramgment.setOnClickListener {

            navController = findNavController()
            navController.navigate(R.id.action_fragmentFromApp_to_loginapp_nav)
        }
    }

}