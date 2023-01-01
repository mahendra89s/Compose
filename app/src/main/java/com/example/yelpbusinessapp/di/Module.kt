package com.example.yelpbusinessapp.di

import com.example.yelpbusinessapp.data.repository.ApiRepository
import com.example.yelpbusinessapp.data.repository.ApiRepositoryImpl
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@dagger.Module
class Module {

    @Provides
    @Singleton
    fun provideRetrofit(
        gson: Gson,
        client : OkHttpClient
    ) : Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.yelp.com/v3/businesses")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }

    @Provides
    fun provideGson() : Gson = GsonBuilder().create()

    @Provides
    fun provideClient() : OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
        .build()

    @Provides
    fun provideRepo() : ApiRepository{
        return ApiRepositoryImpl()
    }

}