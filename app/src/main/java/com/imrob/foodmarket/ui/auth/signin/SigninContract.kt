package com.imrob.foodmarket.ui.auth.signin

import com.imrob.foodmarket.base.BasePresenter
import com.imrob.foodmarket.base.BaseView
import com.imrob.foodmarket.model.response.login.LoginResponse

interface SigninContract {

    interface View : BaseView {
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailed(message: String)
    }

    interface Presenter : SigninContract, BasePresenter {
        fun submitLogin(email: String, password: String)
    }
}