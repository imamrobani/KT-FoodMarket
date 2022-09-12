package com.imrob.foodmarket.ui.profile.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imrob.foodmarket.R

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileAccountFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileAccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_account, container, false)
    }

}