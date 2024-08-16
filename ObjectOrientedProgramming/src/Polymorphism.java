import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("adventure", "The Lord of the Rings");
//        theMovie.watchMovie();
//        theMovie = Movie.getMovie("comedy", "The Hangover");
//        theMovie.watchMovie();
//        theMovie = Movie.getMovie("drama", "The Shawshank Redemption");
//        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter the movie type (A for Adventure, C for Comedy, D for Drama): ");
            String type = s.nextLine();
            System.out.println("Enter the movie title: ");
            String title = s.nextLine();
            Movie theMovie = Movie.getMovie(type, title);
            theMovie.watchMovie();
            System.out.println("Do you want to watch another movie? (Y/N): ");
        } while (!s.nextLine().equalsIgnoreCase("N"));
    }

}

class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Watching " + instanceType + " movie: " + title);
    }

    public static Movie getMovie(String type, String title) {
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'D' -> new Drama(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Adventure", "Action", "Fantasy");
    }

    public void watchAdventure() {
        System.out.println("Watching Adventure movie");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);

    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Comedy", "Romance", "Drama");
    }
    public void watchComedy() {
        System.out.println("Watching Comedy movie");
    }
}

class Drama extends Movie {
    public Drama(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3), "Drama", "Thriller", "Mystery");
    }

    public void watchDrama() {
        System.out.println("Watching Drama movie");
    }
}
