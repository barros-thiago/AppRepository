package com.example.apprepository.domain

import com.example.apprepository.core.UseCase
import com.example.apprepository.data.model.Repo
import com.example.apprepository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
): UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositores(param)
    }
}