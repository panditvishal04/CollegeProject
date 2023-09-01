package com.vishal.college_project.HOD_DETAIL

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vishal.college_project.MainActivity
import com.vishal.college_project.R
import com.vishal.college_project.databinding.FragmentHodDashboardBinding


class Hod_dashboard_Fragment : Fragment() {
    lateinit var binding: FragmentHodDashboardBinding
    lateinit var mainActivity: MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity= activity as MainActivity
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding= FragmentHodDashboardBinding.inflate(layoutInflater)
        return binding.root
    }


}