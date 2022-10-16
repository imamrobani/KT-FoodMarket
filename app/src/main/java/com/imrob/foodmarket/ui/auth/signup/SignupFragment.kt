package com.imrob.foodmarket.ui.auth.signup

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.github.dhaval2404.imagepicker.ImagePicker
import com.imrob.foodmarket.R
import com.imrob.foodmarket.model.request.RegisterRequest
import com.imrob.foodmarket.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signup.*
import kotlinx.android.synthetic.main.layout_toolbar.*

class SignupFragment : Fragment() {

    var filePath: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDummy()
        initListener()

    }

    private fun initListener() {
        ivProfile.setOnClickListener {
            ImagePicker.with(this)
                .cameraOnly()
                .start()
        }

        btnContinue.setOnClickListener {

            var fullname = etFullname.text.toString()
            var email = etEmail.text.toString()
            var pass = etPassword.text.toString()

            if (fullname.isNullOrEmpty()) {
                etFullname.error = "Silahkan masukkan fullname"
                etFullname.requestFocus()
            } else if (email.isNullOrEmpty()) {
                etEmail.error = "Silahkan masukkan email"
                etEmail.requestFocus()
            } else if (pass.isNullOrEmpty()) {
                etPassword.error = "Silahkan masukkan password"
                etPassword.requestFocus()
            } else {
                var data = RegisterRequest(
                    fullname,
                    email,
                    pass,
                    pass,
                    "", "", "", "",
                    filePath
                )

                var bundle = Bundle()
                bundle.putParcelable("data", data)

                Navigation.findNavController(it)
                    .navigate(R.id.action_signup_address, bundle)

                (activity as AuthActivity).toolbarSignupAdress()
            }
        }
    }

    private fun initDummy() {
        etFullname.setText("Imam Robani")
        etEmail.setText("imamrob@gmail.com")
        etPassword.setText("password")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            filePath = data?.data

            Glide.with(this)
                .load(filePath)
                .apply(RequestOptions.circleCropTransform())
                .into(ivProfile)
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(context, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }
}