package com.hpnightowl.owlkhabri.ui.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val username: String,
    val address: String,
    val phonenumber: Int,

    )