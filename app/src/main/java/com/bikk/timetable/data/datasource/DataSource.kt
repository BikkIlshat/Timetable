package com.bikk.timetable.data.datasource

import com.bikk.timetable.data.model.Classes


interface DataSource {
    fun getData(): Classes
}