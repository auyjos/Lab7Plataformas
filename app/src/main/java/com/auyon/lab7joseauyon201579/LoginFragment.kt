package com.auyon.lab7joseauyon201579

import android.os.Bundle
import android.text.TextUtils.replace
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

import androidx.fragment.app.*


class LoginFragment : Fragment(R.layout.login_fragment) {


    lateinit var buttonLoginClick: Button
    lateinit var textViewClick: TextView
    lateinit var textInputEmail : TextInputLayout
    lateinit var  texttoNewAccount : TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLoginClick = view.findViewById(R.id.buttonIniciar)
        textViewClick = view.findViewById(R.id.textViewUsuario)
        textInputEmail = view.findViewById(R.id.emailInput)
        texttoNewAccount = view.findViewById(R.id.textViewUsuario)


        setListeners()
    }

    private fun setListeners() {
        buttonLoginClick.setOnClickListener{

            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(
                textInputEmail.editText!!.text.toString()
            )
            requireView().findNavController().navigate(action)
        }
        texttoNewAccount.setOnClickListener{
        requireView().findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToNewAccountFragment())
        }

    }

}