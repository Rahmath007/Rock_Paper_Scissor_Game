public class Validator {
    public boolean isValidMove(String move) {
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }
}
