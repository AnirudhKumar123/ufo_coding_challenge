package com.action.ufocodingchallenge.domain.usecase

import com.action.ufocodingchallenge.domain.repo.UfoRepository
import java.util.UUID
import javax.inject.Inject

class RemoveUfoSightingUseCase @Inject constructor(private val repository: UfoRepository) {
    operator fun invoke(id: UUID) {
        repository.removeSighting(id)
    }
}