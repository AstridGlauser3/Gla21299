package gt.uvg.pokelist.model

import com.squareup.moshi.Json



data class PokemonInit(
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val  ref: String,


    )
data class PokemonResponse (
    @Json(name = "results")
    val result: List<PokemonInit>
)


data class Pokemon (val id: Int,
                    val name: String
) {
    val imageUrlFront: String get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$id.png"
    val imageUrlBack: String get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/$id.png"
    val imageUrlShinnyFront: String get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/$id.png"
    val imageUrlShinnyBack: String get() = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/$id.png"
}