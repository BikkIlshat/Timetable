package com.bikk.timetable.data.datasource

import com.bikk.timetable.data.model.Classes


class MockDataSourceImpl : DataSource {
    override fun getData(): Classes = getMockData()
}