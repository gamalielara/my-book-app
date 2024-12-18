package com.mybookapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.mybookapp.databinding.ActivityBookListBinding

class BookListActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityBookListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarBookList.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_book_list)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_fantasy,
                R.id.nav_scifi,
                R.id.nav_nonfiction,
                R.id.nav_poetry,
                R.id.nav_general_fiction
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val headerView = navView.getHeaderView(0)
        val userDetailBox = headerView.findViewById<LinearLayout>(R.id.userDetailHeader)

        userDetailBox.setOnClickListener {
            Intent(this, UserDetailActivity::class.java).also {
                Log.d("HAI ", getString(R.string.profile_username))
                it.putExtra("username", getString(R.string.profile_username))
                it.putExtra("userEmail", getString(R.string.profile_user_email))

                startActivity(it)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.book_list, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_book_list)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}