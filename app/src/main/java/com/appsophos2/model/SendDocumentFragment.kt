package com.appsophos2.model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.navigation.fragment.findNavController
import com.appsophos2.R


class SendDocumentFragment : Fragment(R.layout.fragment_send_document) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        validationFields()
        val btnRelativeLayoutBack = requireView().findViewById<RelativeLayout>(R.id.rl_back)

        //Navegacion para regresar a menu
        btnRelativeLayoutBack.setOnClickListener {
            findNavController().navigate(R.id.action_send_docFragment_to_menuFragment)
        }
    }

    private fun validationFields():Boolean {
        var isValid = true
        var txt_type_document = R.id.txt_document_type
        var txt_document = R.id.txt_document
        var txt_name = R.id.txt_name
        var txt_lastname = R.id.txt_lastname
        var txt_email = R.id.txt_email
        var txt_city = R.id.txt_city
        var txt_archive = R.id.txt_archive

        if(R.id.txt_document_type.toString().isBlank()){
            isValid = false
            txt_type_document = R.string.form_required_field
        }
        if(R.id.txt_document.toString().isBlank()){
            isValid = false
            txt_document = R.string.form_required_field
        }
        if(R.id.txt_name.toString().isBlank()){
            isValid = false
            txt_name = R.string.form_required_field
        }
        if(R.id.txt_lastname.toString().isBlank()){
            isValid = false
            txt_lastname = R.string.form_required_field
        }
        if(R.id.txt_email.toString().isBlank()){
            isValid = false
            txt_email = R.string.form_required_field
        }
        if(R.id.txt_city.toString().isBlank()){
            isValid = false
            txt_city = R.string.form_required_field
        }
        if(R.id.txt_archive.toString().isBlank()){
            isValid = false
            txt_archive = R.string.form_required_field
        }
        return isValid
    }

}