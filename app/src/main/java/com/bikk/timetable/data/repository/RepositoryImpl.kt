package com.bikk.timetable.data.repository

import com.bikk.timetable.data.datasource.DataSource
import com.bikk.timetable.data.model.Classes
import com.bikk.timetable.domain.repository.Repository

class RepositoryImpl(private val dataSource: DataSource) : Repository {
    override fun getData(): Classes = dataSource.getData()
}