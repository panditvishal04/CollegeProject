package com.vishal.college_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.vishal.college_project.databinding.FragmentPrincipalLoginPageBinding

class PrincipalLoginFragment : Fragment() {
    lateinit var binding: FragmentPrincipalLoginPageBinding
    lateinit var mainActivity: MainActivity
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        navController = findNavController()
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrincipalLoginPageBinding.inflate(layoutInflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.btnLogin.setOnLongClickListener {
//         mainActivity.findNavController(R.id.navController).navigate(R.id.action_principal_login_page_to_principalDashboard)
//        }

    }


}