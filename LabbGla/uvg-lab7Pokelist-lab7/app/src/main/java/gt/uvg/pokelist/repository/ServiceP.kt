package gt.uvg.pokelist.repository
import gt.uvg.pokelist.model.PokemonResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ServiceP {

    @GET("pokemon")
    fun getPokemonList(@Query("limit") limit: Int, @Query("offset") offset: Int): Call<PokemonResponse>

}