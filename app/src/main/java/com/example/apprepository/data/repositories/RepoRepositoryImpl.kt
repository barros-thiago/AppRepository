package com.example.apprepository.data.repositories


import com.example.apprepository.core.RemoteException
import com.example.apprepository.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService): RepoRepository {

    override suspend fun listRepositores(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        }
        catch(ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível localizar o usuário!")
        }
    }
}