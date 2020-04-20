package com.demo.androidconcept.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
        @PrimaryKey val uid: Int,
        @ColumnInfo(name = "first_name") var firstName: String?,
        @ColumnInfo(name = "last_name") var lastName: String?
)