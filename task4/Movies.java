class Movies {

    static String[] kannadaMovies = {
        "Kantara", "James", "Kaatera", "Kurukshetra", "Raajakumara", "Mungaru Male", "Satya Harishchandra", "Om", 
        "Mungaru Male", "Raajakumara", "KGF", "Vikrant Rona", "777 Charlie", "Roberrt", "Avane Srinamnarayana", 
        "RRR", "Vikrant Rona", "Double Trouble", "O2", "Kaalidas", "Gadinadu", "Rose", "Veera Parampare", "Magadi", "Kushka"
    };

    static String[] hindiMovies = {
        "Taare Zameen Par", "The Lunchbox", "Jab We Met", "3 Idiots", "Kahaani", "Rang De Basanti", "Lagaan", 
        "Dilwale Dulhania Le Jayenge", "Hum Aapke Hain Koun..!", "Sholay", "Golmaal", "Bajirao Mastani", "PK", 
        "Swades", "Om Shanti Om", "Fashion", "Koi... Mil Gaya", "Guru", "Jodhaa Akbar", "My Name Is Khan", 
        "Veer-Zaara", "Taalismaan", "Fanaa", "Dhoom 2", "Kabhi Khushi Kabhie Gham..."
    };

    static String[] koreanDramas = {
        "Crash Landing on You", "Vagabond", "Strong Girl Bong-soon", "Goblin", "Reply 1988", "Boys Over Flowers", 
        "Descendants of the Sun", "What's Wrong with Secretary Kim", "Her Private Life", "Hospital Playlist", 
        "True Beauty", "My Roommate Is a Gumiho", "The Penthouse: War in Life", "Squid Game", "Hotel Del Luna", 
        "The Crowned Clown", "My Love from the Star", "Doctor Stranger", "Dream High", "Healer"
    };

    public static void main(String[] args) {
        System.out.println("Kannada movies are:");
        for (String movie : kannadaMovies) {
            System.out.println(movie);
        }

        System.out.println("-------------------");

        System.out.println("Hindi Movies are:");
        for (String movie : hindiMovies) {
            System.out.println(movie);
        }

        System.out.println("-------------------");

        System.out.println("The Korean dramas are:");
        for (String drama : koreanDramas) {
            System.out.println(drama);
        }
    }
}
