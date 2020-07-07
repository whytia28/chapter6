package com.example.chapter6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter6.adapter.CardViewAdapter
import com.example.chapter6.adapter.GridAdapter
import com.example.chapter6.adapter.ListAdapter
import com.example.chapter6.model.Forbes
import com.example.chapter6.model.ForbesData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list: ArrayList<Forbes> = arrayListOf()
    private var title: String = "Forbes Indonesia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_forbes.setHasFixedSize(true)
        setActionBarTitle(title)
        list.addAll(ForbesData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_card_view -> {
                title = "Mode Card View"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)
    }

    private fun showRecyclerList() {
        rv_forbes.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAdapter(list)
        rv_forbes.adapter = listAdapter
    }

    private fun showRecyclerGrid() {
        rv_forbes.layoutManager = GridLayoutManager(this, 2)
        val gridAdapter = GridAdapter(list)
        rv_forbes.adapter = gridAdapter
    }

    private fun showRecyclerCardView() {
        rv_forbes.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewAdapter(list)
        rv_forbes.adapter = cardViewAdapter
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}