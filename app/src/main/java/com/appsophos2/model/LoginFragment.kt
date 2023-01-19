package com.appsophos2.model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.appsophos2.R


class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        validationFields()

        val btnNavegation = requireView().findViewById<Button>(R.id.btn_login)
        //Navegacion para menu
        btnNavegation.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
        }
    }

    private fun validationFields():Boolean {
        var isValid = true
        var title_username = R.id.title_username
        var title_password = R.id.title_password

        if(R.id.txt_username.toString().isBlank()){
            isValid = false
            title_username = R.string.form_required_field
        }

        if(R.id.txt_password.toString().isBlank()){
            isValid = false
            title_password = R.string.form_required_field
        }
        return isValid
    }

}