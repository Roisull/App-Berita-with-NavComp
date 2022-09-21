package com.example.appberitawithnavcomp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appberitawithnavcomp.R
import com.example.appberitawithnavcomp.databinding.FragmentHomeBinding
import com.example.appberitawithnavcomp.databinding.ItemBeritaBinding
import com.example.appberitawithnavcomp.viewmodel.BeritaViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var beritaViewModel: BeritaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}