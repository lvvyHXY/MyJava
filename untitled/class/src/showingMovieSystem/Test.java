package showingMovieSystem;

public class Test {
    public static void main(String[] args) {
        Movie[] movie = new Movie[6];
        movie[0] = new Movie("《三傻大闹宝莱坞》", 1, 30, "alia");
        movie[1] = new Movie("《大话西游》", 2, 20, "tom");
        movie[2] = new Movie("《龙猫》", 3, 15, "jerry");
        movie[3] = new Movie("《1》",4,25,"A");
        movie[4] = new Movie("《2》",5,35,"B");
        movie[5] = new Movie("《3》",6,45,"C");

        MovieOperator mp = new MovieOperator(movie);
        mp.printAllMovies();
        mp.searchMovieByID();
    }
}
