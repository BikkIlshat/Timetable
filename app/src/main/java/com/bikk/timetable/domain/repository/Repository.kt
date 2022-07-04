package com.bikk.timetable.domain.repository

import com.bikk.timetable.data.model.Classes


interface Repository {
    fun getData(): Classes
}