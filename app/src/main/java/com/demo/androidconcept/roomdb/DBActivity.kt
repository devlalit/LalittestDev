package com.demo.androidconcept.roomdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.demo.androidconcept.R

class DBActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_db)
        init()
    }
    fun init(){
        val db= Room.databaseBuilder(applicationContext,AppDatabase::class.java,"UserDB").build()
        val user = User()
        user.firstName = "lalit"
        user.lastName = "Baraskar"

        db.userDao().insertAll()
        // insertData()
    }
    fun insertData(){

    }
}