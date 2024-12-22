package com.mybookapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.google.android.material.navigation.NavigationView
import com.mybookapp.data.currentUser
import com.mybookapp.databinding.ActivityBookListBinding
import de.hdodenhof.circleimageview.CircleImageView

class BookListActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityBookListBinding
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarBookList.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        navView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_book_list)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.all_books_menu,
                R.id.nav_fantasy_menu,
                R.id.nav_scifi_menu,
                R.id.nav_nonfiction_menu,
                R.id.nav_poetry_menu,
                R.id.nav_general_fiction_menu
            ), drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        setupUI()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.book_list, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_book_list)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun setupUI() {
        val headerView = navView.getHeaderView(0)
        val userDetailBox = headerView.findViewById<LinearLayout>(R.id.userDetailHeader)

        val userFullname = headerView.findViewById<TextView>(R.id.userFullName)
        val userEmail = headerView.findViewById<TextView>(R.id.userEmail)
        val userProfileImage = headerView.findViewById<CircleImageView>(R.id.userProfileImg)

        userFullname.text = currentUser.name
        userEmail.text = currentUser.email

        Glide.with(this).load(currentUser.profileImage).into(userProfileImage)


        userDetailBox.setOnClickListener {
            Intent(this, UserDetailActivity::class.java).also {
                it.putExtra("username", currentUser.name)
                it.putExtra("userEmail", currentUser.email)
                it.putExtra("userProfileImage", currentUser.profileImage)

                startActivity(it)
            }
        }
    }
}