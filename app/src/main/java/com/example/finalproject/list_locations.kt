package com.example.finalproject

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import org.joda.time.DateTime

class list_locations : Fragment() {
    lateinit var viewModel: UserDataViewModel
    lateinit var adapter: LogAdapter

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    } */

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_list_locations, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = LogAdapter()
        val layoutMgr = LinearLayoutManager(requireContext())
        with(view) {
            log_list.adapter = adapter
            log_list.layoutManager = LinearLayoutManager(context)
            log_list.addItemDecoration(DividerItemDecoration(context, layoutMgr.orientation))
        }
    }
}