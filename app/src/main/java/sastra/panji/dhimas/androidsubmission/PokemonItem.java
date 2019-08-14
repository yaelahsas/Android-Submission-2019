package sastra.panji.dhimas.androidsubmission;

import java.util.ArrayList;

public class PokemonItem {

    public static String[][] dt_pokemon = new String[][]{
            {"Bulbasaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png","Grass","Poison","Bulbasaur dapat terlihat tidur siang di bawah sinar matahari yang cerah. Ada benih di punggungnya. Dengan menyerap sinar matahari, benih tumbuh semakin besar."},
            {"Ivysaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/002.png","Grass","Poison","Ada kuncup di punggung Pokémon ini. Untuk menopang beratnya, kaki dan batang Ivysaur tumbuh tebal dan kuat. Jika mulai menghabiskan lebih banyak waktu berbaring di bawah sinar matahari, itu adalah tanda bahwa kuncup akan mekar menjadi bunga besar segera."},
            {"Venusaur", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/003.png","Grass","Poison","Ada bunga besar di punggung Venusaur. Bunga dikatakan berwarna cerah jika mendapat banyak nutrisi dan sinar matahari. Aroma bunga itu menenangkan emosi orang."},
            {"Charmander", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png", "Fire", "None", "Api yang membakar di ujung ekornya merupakan indikasi dari emosinya. Api bergetar ketika Charmander menikmati dirinya sendiri. Jika Pokemon menjadi marah, nyala api menyala dengan sangat hebat."},
            {"Charmeleon", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/005.png", "Fire", "None", "Charmeleon tanpa ampun menghancurkan musuh menggunakan cakar yang tajam. Jika bertemu dengan musuh yang kuat, itu berubah menjadi agresif. Dalam keadaan bersemangat ini, nyala di ujung ekornya menyala dengan warna putih kebiruan."},
            {"Charizard", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png","Fire","Flying","Charizard terbang mengelilingi langit untuk mencari lawan yang kuat. Ia menghembuskan api yang sangat panas sehingga melelehkan apa pun. Namun, itu tidak pernah mengubah nafas berapi-api pada lawan yang lebih lemah dari dirinya sendiri."},
            {"Squirtle", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png", "Water", "None", "Squirtle shell tidak hanya digunakan untuk perlindungan. Bentuknya yang bulat dan lekukan di permukaannya membantu meminimalkan resistansi dalam air, memungkinkan Pokémon ini berenang dengan kecepatan tinggi."},
            {"Wartotle", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/008.png", "Water", "None", "Ekornya besar dan ditutupi bulu yang tebal dan kaya. Ekor menjadi semakin dalam warna seiring bertambahnya usia Wartortle. Goresan pada cangkangnya adalah bukti ketangguhan Pokemon ini sebagai seorang pejuang"},
            {"Blastoise", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png", "Water", "None", "Blastoise memiliki semburan air yang menonjol dari cangkangnya. Semburan air sangat akurat. Mereka dapat menembakkan peluru air dengan akurasi yang cukup untuk menyerang kaleng kosong dari jarak lebih dari 160 kaki."},
            {"Caterpie", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/010.png", "Bug", "None", "Caterpie memiliki selera makan yang rakus. Ini bisa melahap daun lebih besar dari tubuhnya tepat di depan mata Anda. Dari antenanya, Pokemon ini mengeluarkan bau yang sangat kuat."},
            {"Metapod", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/011.png", "Bug", "None", "Shell yang menutupi tubuh Pokemon ini sekeras lempengan besi. Metapod tidak banyak bergerak. Tetap diam karena sedang mempersiapkan jeroan lunak untuk evolusi di dalam cangkang keras."},
            {"Butterfree", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/012.png","Bug","Flying","Butterfree memiliki kemampuan unggul untuk mencari madu lezat dari bunga. Ia bahkan bisa mencari, mengekstrak, dan membawa madu dari bunga yang mekar lebih dari enam mil dari sarangnya."},
            {"Weedle", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/013.png","Bug","Poison","Weedle memiliki indra penciuman yang sangat akut. Ia mampu membedakan jenis daun favoritnya dari daun yang tidak disukainya hanya dengan mengendus dengan belalai merah besar (hidung)."},
            {"Kakuna", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/014.png","Bug","Poison","Kakuna secara virtual tetap tidak bergerak karena menempel pada pohon. Namun, di bagian dalam, sangat sibuk saat mempersiapkan evolusi yang akan datang. Ini terlihat dari seberapa panas cangkang menyentuh."},
            {"Beedrill", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/015.png","Bug","Poison","Beedrill sangat teritorial. Tidak seorang pun boleh mendekati sarangnya — ini untuk keselamatan mereka sendiri. Jika marah, mereka akan menyerang dengan gerombolan yang geram."},
    };

    public static ArrayList<Pokemon> getListPokemon() {
        ArrayList<Pokemon> list = new ArrayList<>();
        for (String[] data : dt_pokemon) {
            Pokemon pokemon = new Pokemon();
            pokemon.setNames(data[0]);
            pokemon.setImages(data[1]);
            pokemon.setType1(data[2]);
            pokemon.setType2(data[3]);
            pokemon.setDeskripsi(data[4]);

            list.add(pokemon);
        }

        return list;
    }


}
