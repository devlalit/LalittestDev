package com.demo.androidconcept.roomdb

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UserDao{
    @Insert
    fun insertAll(vararg users: User)
}