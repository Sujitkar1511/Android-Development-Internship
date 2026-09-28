package com.example.recyclebing

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewRequests: RecyclerView
    private lateinit var adapter: FriendRequestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()
        setupRecyclerView()
    }

    private fun initViews() {
        recyclerViewRequests = findViewById(R.id.recyclerViewRequests)
    }

    private fun setupRecyclerView() {
        // Using an Array (arrayOf) with the 10 specified names for vertical scrolling (UI only)
        val friendArray = arrayOf(
            FriendRequest(1, "Sujit Kar", 4),
            FriendRequest(2, "Sneha Bez", 10),
            FriendRequest(3, "Akhmal", 6),
            FriendRequest(4, "Deepjyoti Das", 9),
            FriendRequest(5, "Kushal Jain", 14),
            FriendRequest(6, "Arindam Sahoo", 3),
            FriendRequest(7, "Raj", 5),
            FriendRequest(8, "Priya", 8),
            FriendRequest(9, "Shraya", 7),
            FriendRequest(10, "Ronit", 11)
        )

        adapter = FriendRequestAdapter(friendArray)

        recyclerViewRequests.layoutManager = LinearLayoutManager(this)
        recyclerViewRequests.adapter = adapter
    }
}
