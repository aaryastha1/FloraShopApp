package com.example.florashop.FragMents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.florashop.R
import com.example.florashop.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private val originalFlowerName = listOf(
               " Roses",
                "Tulips",
              "  Lilies",
                "Daisies",
               " Carnations",
               " Orchids",
                "Sunflowers",
                "Peonies",
                "Daffodils",
                "Irises",
                " Daisies",
               " Marigolds",
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSearchBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    companion object {

    }
}