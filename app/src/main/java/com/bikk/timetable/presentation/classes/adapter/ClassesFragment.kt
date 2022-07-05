package com.bikk.timetable.presentation.classes.adapter

import by.kirich1409.viewbindingdelegate.viewBinding
import com.bikk.timetable.R
import com.bikk.timetable.data.datasource.MockDataSourceImpl
import com.bikk.timetable.data.model.Classes
import com.bikk.timetable.data.repository.RepositoryImpl
import com.bikk.timetable.databinding.ClassesFragmentBinding
import com.bikk.timetable.domain.AppState
import com.bikk.timetable.presentation.core.BaseFragment
import com.bikk.timetable.presentation.core.BaseViewModel
import org.koin.core.scope.Scope
import java.time.format.DateTimeFormatter

class ClassesFragment : BaseFragment<ClassesFragmentBinding>(R.layout.classes_fragment) {
    override val scope: Scope
        get() = TODO("Not yet implemented")
    override val viewBinding: ClassesFragmentBinding by viewBinding()
    override val viewModel: BaseViewModel = ClassesViewModel(RepositoryImpl(MockDataSourceImpl()))
    private val formatter by lazy { DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm") }
    private val durationOfTime = 45L

    override fun onStart() {
        super.onStart()
        viewModel.getLiveData().observe(viewLifecycleOwner){renderData(it)}
        viewModel.getData()
    }

    override fun renderData(appState: AppState) {
        when (appState) {
            is AppState.Success -> {
                if (appState.data is Classes) {
                    val adapterLesson = ClassesAdapter(appState.data, durationOfTime, formatter)
                    viewBinding.classesRecycleView.adapter = adapterLesson
                }
            }
            else -> {}
        }
    }


    companion object {
        fun newInstance() = ClassesFragment()
    }

}
