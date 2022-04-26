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

class NotificationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tvNotification).setOnClickListener {
            navigateFragment(
                fragment = SettingsFragment.newInstance(),
                animation = AnimationType.DEFAULT
            )
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = NotificationFragment()
    }
}