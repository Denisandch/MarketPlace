package com.example.marketplace.authorization

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.marketplace.R
import com.example.marketplace.databinding.FragmentSignBinding


class SignFragment : Fragment() {


    private lateinit var binding: FragmentSignBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogInSign.setOnClickListener {
            findNavController().navigate(R.id.action_signFragment_to_loginFragment)
        }
    }

}