package com.appsophos2.model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.navigation.fragment.findNavController
import com.appsophos2.R


class MenuFragment : Fragment(R.layout.fragment_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRelativeLayoutSend = requireView().findViewById<RelativeLayout>(R.id.rl_send)
        val btnRelativeLayoutSee = requireView().findViewById<RelativeLayout>(R.id.rl_see)
        val btnRelativeLayoutOffice = requireView().findViewById<RelativeLayout>(R.id.rl_offi)

        //Navegacion para enviar documentos
        btnRelativeLayoutSend.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_send_docFragment)
        }
        //Navegacion para ver documentos
        btnRelativeLayoutSee.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_view_docFragment)
        }
        //Navegacion para oficina
        btnRelativeLayoutOffice.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_officesFragment)
        }
    }
}