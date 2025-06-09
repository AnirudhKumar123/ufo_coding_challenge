package com.action.ufocodingchallenge.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.action.ufocodingchallenge.data.model.UfoSighting
import com.action.ufocodingchallenge.domain.usecase.AddUfoSightingUseCase
import com.action.ufocodingchallenge.domain.usecase.GetUfoSightingsUseCase
import com.action.ufocodingchallenge.domain.usecase.RemoveUfoSightingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class UfoViewModel @Inject constructor(
    private val getSightingsUseCase: GetUfoSightingsUseCase,
    private val addSightingUseCase: AddUfoSightingUseCase,
    private val removeSightingUseCase: RemoveUfoSightingUseCase
) : ViewModel() {

    val sightings: StateFlow<List<UfoSighting>> = getSightingsUseCase()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun addRandomSighting() {
        addSightingUseCase(UfoSighting.createRandom())
    }

    fun removeSighting(id: UUID) {
        removeSightingUseCase(id)
    }
}