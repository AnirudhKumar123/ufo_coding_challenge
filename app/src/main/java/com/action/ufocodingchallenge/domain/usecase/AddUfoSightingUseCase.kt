package com.action.ufocodingchallenge.domain.usecase

import com.action.ufocodingchallenge.data.model.UfoSighting
import com.action.ufocodingchallenge.domain.repo.UfoRepository
import javax.inject.Inject

class AddUfoSightingUseCase @Inject constructor(private val repository: UfoRepository) {
    operator fun invoke(sighting: UfoSighting) {
        repository.addSighting(sighting)
    }
}