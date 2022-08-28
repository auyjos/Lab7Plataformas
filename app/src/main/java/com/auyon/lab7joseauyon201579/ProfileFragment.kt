package com.auyon.lab7joseauyon201579

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController


class ProfileFragment : Fragment(R.layout.fragment_profile) {


    lateinit var buttonActualizarPerfil: Button



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonActualizarPerfil = view.findViewById(R.id.buttonActualizarPerfil)


        setListeners()
    }

    private fun setListeners() {
        buttonActualizarPerfil.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_profileFragment_to_loginFragment)
        }
    }
}