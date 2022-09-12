package com.imrob.foodmarket.ui.home.newtaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imrob.foodmarket.R
import com.imrob.foodmarket.model.dummy.HomeVerticalModel
import kotlinx.android.synthetic.main.fragment_home_new_taste.*

/**
 * A simple [Fragment] subclass.
 * Use the [HomeNewTasteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeNewTasteFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallback {

    private var foodList: ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeNewTasteAdapter(foodList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter

    }

    fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Cherry Healthy", "10000", "", 5f))
        foodList.add(HomeVerticalModel("Burger Tamayo", "20000", "", 4f))
        foodList.add(HomeVerticalModel("Bakhwan Cihuy", "20000", "", 4.5f))
    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        Toast.makeText(context, "OnClik item ${data.title}", Toast.LENGTH_SHORT).show()
    }
}