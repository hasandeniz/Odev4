package com.hasandeniz.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hasandeniz.odev4.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {


    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSayfaABinding.inflate(inflater,container,false)
        binding.sayfaAGitBButon.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaAFragment_to_sayfaBFragment)
        }
        return binding.root
    }


}