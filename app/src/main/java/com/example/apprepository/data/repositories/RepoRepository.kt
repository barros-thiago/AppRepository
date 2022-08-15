package com.example.apprepository.data.repositories

import com.example.apprepository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositores(user: String): Flow<List<Repo>>
}