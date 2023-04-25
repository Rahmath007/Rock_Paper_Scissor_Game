import java.util.Scanner;

public class Player {
    private String name;
    private String move;
    private Scanner scanner;

    public Player(String name) {
        this.name = name;
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return move;
    }

    public void chooseMove() {
        System.out.print(name + ", choose rock, paper, or scissors: ");
        move = scanner.nextLine().toLowerCase();
    }
}
