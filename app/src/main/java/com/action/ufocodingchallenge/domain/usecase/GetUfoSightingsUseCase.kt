package com.action.ufocodingchallenge.domain.usecase

import com.action.ufocodingchallenge.data.model.UfoSighting
import com.action.ufocodingchallenge.domain.repo.UfoRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUfoSightingsUseCase @Inject constructor(private val repository: UfoRepository) {
    operator fun invoke(): Flow<List<UfoSighting>> = repository.getSightings()
}