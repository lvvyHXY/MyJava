package showingMovieSystem;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies)
    {
        this.movies = movies;
    }
    public void printAllMovies()
    {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getID() + "\t" + m.getPrice() + "\t" + m.getName() + "\t" + m.getActor());
        }
    }
    public void searchMovieByID()
    {
        System.out.println("请输入要查找的ID:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getID() == id) {
                System.out.println(m.getID() + "\t" + m.getPrice() + "\t" + m.getName() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("未找到该电影");
    }
}
