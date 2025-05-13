package br.senai.sp.jandira.rickmorty.service

import br.senai.sp.jandira.rickmorty.model.Character
import br.senai.sp.jandira.rickmorty.model.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun listAllCharacters(): Call<Result>

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Int): Call<Character>

    @POST("character")
    fun insert(@Body character: Character):Call<Character>

}