package com.example.searchtelegram.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.common.IBaseDiffModel

@Entity(tableName = "person_table")
data class User(
    override var Name: String,
    var Times: String,
    var Image: Int
): IBaseDiffModel{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}