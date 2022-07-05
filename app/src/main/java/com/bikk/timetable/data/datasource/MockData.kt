package com.bikk.timetable.data.datasource

import com.bikk.timetable.R
import com.bikk.timetable.data.model.Classes
import com.bikk.timetable.data.model.HomeWork
import com.bikk.timetable.data.model.Lesson

fun getMockData(): Classes = Classes(
    "First",
    lessons = listOf(
        Lesson(
            title = "History",
            dateStart = "19/03/2022 20:00",
            image = R.drawable.ic_onion_foreground,
            false
        ),
        Lesson(
            title = "Literature",
            dateStart = "18/03/2022 20:00",
            image = R.drawable.ic_onion_foreground,
            false
        ),
        Lesson(
            title = "Physics",
            dateStart = "20/03/2022 20:00",
            image = R.drawable.ic_onion_foreground,
            false
        ),
        Lesson(
            title = "History",
            dateStart = "05/03/2022 20:00",
            image = R.drawable.ic_onion_foreground,
            true
        ),
        Lesson(
            title = "Literature",
            dateStart = "05/03/2022 10:00",
            image = R.drawable.ic_onion_foreground,
            false
        ),
        Lesson(
            title = "Physics",
            dateStart = "07/03/2022 20:00",
            image = R.drawable.ic_onion_foreground,
            true
        )
    ),
    homeworks = listOf(
        HomeWork(
            title = "Physics",
            dateStart = "18/03/2022 20:00",
            image = R.drawable.ic_books_foreground,
            task = "Do homework Physics"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "19/03/2022 20:00",
            image = R.drawable.ic_books_foreground,
            task = "Do homework Literature"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "20/03/2022 20:00",
            image = R.drawable.ic_books_foreground,
            task = "Do homework Literature"
        ),
        HomeWork(
            title = "Physics",
            dateStart = "27/03/2022 20:00",
            image = R.drawable.ic_books_foreground,
            task = "Do homework Physics"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "26/03/2022 20:00",
            image = R.drawable.ic_books_foreground,
            task = "Do homework Literature"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "25/03/2022 20:00",
            image = R.drawable.ic_books_foreground,
            task = "Do homework Literature"
        )
    )
)