package sastra.panji.dhimas.androidsubmission;

import java.util.ArrayList;

public class PokemonItem {

    public static String[][] dt_pokemon = new String[][]{
            {"Bulbasaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png","Grass","Poison"},
            {"Ivysaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/002.png","Grass","Poison"},
            {"Venusaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/003.png","Grass","Poison"},
            {"Charmander", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png","Fire",""},
            {"Charmeleon", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/005.png","Fire",""},
            {"Charizard", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png","Fire","Flying"},
            {"Squirtle", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png","Water",""},
            {"Wartotle", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/008.png","Water",""},
            {"Blastoise", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png","Water",""},
            {"Caterpie", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/010.png","Bug",""},
            {"Metapod", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/011.png","Bug",""},
            {"Butterfree", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/012.png","Bug","Flying"},
            {"Weedle", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/013.png","Bug","Poison"},
            {"Kakuna", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/014.png","Bug","Poison"},
            {"Beedrill", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/015.png","Bug","Poison"},
    };

    public static ArrayList<Pokemon> getListPokemon() {
        ArrayList<Pokemon> list = new ArrayList<>();
        for (String[] data : dt_pokemon) {
            Pokemon pokemon = new Pokemon();
            pokemon.setNames(data[0]);
            pokemon.setImages(data[1]);
            pokemon.setType1(data[2]);
            pokemon.setType2(data[3]);

            list.add(pokemon);
        }
        return list;
    }
}
