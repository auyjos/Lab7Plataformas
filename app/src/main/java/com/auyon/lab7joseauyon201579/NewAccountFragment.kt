package com.auyon.lab7joseauyon201579

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class NewAccountFragment : Fragment(R.layout.fragment_new_account) {
    lateinit var buttonCrearCuentaClick : Button
    lateinit var textInputEmail : TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonCrearCuentaClick = view.findViewById(R.id.buttonCrearCuenta)
        textInputEmail = view.findViewById(R.id.inputCrearCuenta)

        setListeners()
    }

    private fun setListeners() {
        buttonCrearCuentaClick.setOnClickListener{
            val action = NewAccountFragmentDirections.actionNewAccountFragmentToHomeFragment(
                textInputEmail.editText!!.text.toString()
            )
            requireView().findNavController().navigate(action)
        }
    }

}