public class Game {
    private Player player1;
    private Player player2;
    private Validator validator;

    public Game() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        validator = ValidatorFactory.createValidator();
    }

    public void play() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {
            player1.chooseMove();
            if (validator.isValidMove(player1.getMove())) {
                player2.chooseMove();
                if (validator.isValidMove(player2.getMove())) {
                    determineWinner();
                    break;
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }

    private void determineWinner() {
        String move1 = player1.getMove();
        String move2 = player2.getMove();
        System.out.println("Player 1 chose " + move1);
        System.out.println("Player 2 chose " + move2);
        if (move1.equals(move2)) {
            System.out.println("It's a tie!");
        } else if (move1.equals("rock") && move2.equals("scissors")
                || move1.equals("paper") && move2.equals("rock")
                || move1.equals("scissors") && move2.equals("paper")) {
            System.out.println("Congratulations, Player 1 won!");
        } else {
            System.out.println("Congratulations, Player 2 won!");
        }
    }
}
