package com.imrob.foodmarket.ui.auth.signin

import io.reactivex.disposables.CompositeDisposable

class SigninPresenter(private val view: SigninContract.View) : SigninContract.Presenter {

    private val mCompositeDisposable: CompositeDisposable?
    init {
        this.mCompositeDisposable = CompositeDisposable()
    }

    override fun submitLogin(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun subscribe() {
        TODO("Not yet implemented")
    }

    override fun unSubscribe() {
        mCompositeDisposable!!.clear()
    }

}