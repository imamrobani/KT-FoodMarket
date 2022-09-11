package com.imrob.foodmarket.ui.home.newtaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imrob.foodmarket.R

/**
 * A simple [Fragment] subclass.
 * Use the [HomeNewTasteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeNewTasteFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }
}