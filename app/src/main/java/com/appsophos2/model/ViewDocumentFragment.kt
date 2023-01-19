package com.appsophos2.model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.navigation.fragment.findNavController
import com.appsophos2.R


class ViewDocumentFragment : Fragment(R.layout.fragment_view_document) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRelativeLayoutBack = requireView().findViewById<RelativeLayout>(R.id.rl_back)

        //Navegacion para regresar a menu
        btnRelativeLayoutBack.setOnClickListener {
            findNavController().navigate(R.id.action_view_docFragment_to_menuFragment)
        }
    }
}