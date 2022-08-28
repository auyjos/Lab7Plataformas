package com.auyon.lab7joseauyon201579

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class HomeFragment : Fragment(R.layout.home_fragment) {

lateinit var buttonActualizarClick : Button
lateinit var textViewEmailText : TextView
private val args:HomeFragmentArgs by navArgs()




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonActualizarClick = view.findViewById(R.id.buttonActualizar)
        textViewEmailText = view.findViewById(R.id.emailPlaceholder)

        textViewEmailText.text = args.email


        setListeners()
    }

    private fun setListeners() {
        buttonActualizarClick.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
    }
}