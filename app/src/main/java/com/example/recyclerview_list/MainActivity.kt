package com.example.recyclerview_list


import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_list.adapter.ItemAdapter
import com.example.recyclerview_list.data.Datasource
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAffirmations()
        recycler_view.adapter = ItemAdapter(this,myDataset)
        recycler_view.setHasFixedSize(true)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_item, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.item1 -> {
                layout.setBackgroundResource(R.color.colorAccent)
                recycler_view.setBackgroundResource(R.color.colorAccent)

                true
            }
            R.id.item2 -> {
                Toast.makeText(this,"Đây là nút about ",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}