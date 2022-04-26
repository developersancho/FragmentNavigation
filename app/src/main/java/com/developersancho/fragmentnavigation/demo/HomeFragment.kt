package com.developersancho.fragmentnavigation.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.github.developersancho.R
import developersancho.fragnavigation.AnimationType
import developersancho.fragnavigation.navigateFragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tvHome).setOnClickListener {
            navigateFragment(
                fragment = NotificationFragment.newInstance(),
                animation = AnimationType.DEFAULT
            )
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}