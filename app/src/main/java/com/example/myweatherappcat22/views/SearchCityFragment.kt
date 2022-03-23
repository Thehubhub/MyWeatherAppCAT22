package com.example.myweatherappcat22.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.example.myweatherappcat22.R
import com.example.myweatherappcat22.databinding.FragmentSearchCityBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class SearchCityFragment : Fragment() {

    private val binding by lazy {
        FragmentSearchCityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding.searchButton.setOnClickListener{
            val str: String = binding.enterCity.text.toString()
            if(str.isNotEmpty()){
                Toast.makeText(activity,str, Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(activity,"Please enter a city", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }

    companion object {

        fun newInstance() =
            SearchCityFragment().apply {

            }
    }
}