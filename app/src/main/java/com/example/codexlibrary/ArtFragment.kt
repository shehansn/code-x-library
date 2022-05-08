package com.example.codexlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.button.MaterialButton


class ArtFragment : Fragment() {

    private lateinit var btnbacktohome: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_art, container, false)
        btnbacktohome = view.findViewById(R.id.btnbacktohome)

        btnbacktohome.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_artFragment_to_homeFragment2)
        }

        return view;
    }



}