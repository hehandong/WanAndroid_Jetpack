package com.hehandong.wanandroidjetpack.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.hehandong.wanandroidjetpack.R
import com.hehandong.wanandroidjetpack.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)


        val binding = DataBindingUtil.inflate<FragmentDashboardBinding>(
            inflater, R.layout.fragment_dashboard, container, false
        )

//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        dashboardViewModel.text.observe(this, Observer {
//            textView.text = it
//        })

        binding.model = dashboardViewModel

        return binding.root
    }
}