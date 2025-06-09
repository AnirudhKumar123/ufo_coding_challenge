package com.action.ufocodingchallenge.domain.repo

import com.action.ufocodingchallenge.data.model.UfoSighting
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface UfoRepository {
    fun getSightings(): Flow<List<UfoSighting>>
    fun addSighting(sighting: UfoSighting)
    fun removeSighting(id: UUID)
}