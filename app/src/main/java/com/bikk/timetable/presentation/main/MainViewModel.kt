package com.bikk.timetable.presentation.main


import com.bikk.timetable.domain.AppState
import com.bikk.timetable.domain.repository.Repository
import com.bikk.timetable.presentation.core.BaseViewModel
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : BaseViewModel() {
    override fun getData() {
        viewModelCoroutineScope.launch {
            liveData.postValue(AppState.Success(repository.getData()))
        }
    }

    override fun handleError(throwable: Throwable) {
        viewModelCoroutineScope.launch {
            liveData.postValue(AppState.Error(throwable))
        }
    }
}