package com.example.codexlibrary

import android.app.Activity
import android.nfc.tech.TagTechnology
import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation

class HomeFragment : Fragment() {

    private lateinit var computingtab : ImageButton
    private lateinit var buisnesstab : ImageButton
    private lateinit var engineeringtab : ImageButton
    private lateinit var arttab : ImageButton
    private lateinit var sciencetab : ImageButton




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        computingtab = view.findViewById(R.id.computingtab)

        computingtab.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment2_to_computingFragment)
        }

        buisnesstab = view.findViewById(R.id.buisnesstab)

        buisnesstab.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment2_to_buisnessFragment)
        }

        engineeringtab = view.findViewById(R.id.engineeringtab)

        engineeringtab.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment2_to_engineeringFragment)

        }
        arttab = view.findViewById(R.id.arttab)

        arttab.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment2_to_artFragment)

        }
        sciencetab = view.findViewById(R.id.sciencetab)

        sciencetab.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment2_to_scienceFragment)

        }

        return view

    }
}

