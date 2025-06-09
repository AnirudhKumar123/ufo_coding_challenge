package com.action.ufocodingchallenge.di

import com.action.ufocodingchallenge.data.repoimpl.UfoRepositoryImpl
import com.action.ufocodingchallenge.domain.repo.UfoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun provideUfoRepository( ufoRepositoryImpl: UfoRepositoryImpl): UfoRepository
}