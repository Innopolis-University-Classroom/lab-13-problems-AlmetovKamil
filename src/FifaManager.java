import java.util.Scanner;

public class FifaManager {
    public Scanner scanner = new Scanner(System.in);
    Fifa fifa = new Fifa();

    void addGame() {
        System.out.println("Enter the game date");
        String date = scanner.nextLine();
        System.out.println("Enter the game place");
        String place = scanner.nextLine();
        System.out.println("Enter the game plan");
        String plan = scanner.nextLine();
        System.out.println("Enter the game ticket");
        String ticket = scanner.nextLine();
        Game game = new Game();
        game.date = date;
        game.place = place;
        game.plan = plan;
        game.ticket = ticket;
        fifa.notify(game);

    }

    void subscribeToPlaystation(Observer<Game> observer) {
        fifa.subscribe(observer);
    }
}
