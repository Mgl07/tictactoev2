public abstract class Game {
    Board board;
    Player player1, player2, currentPlayer;

    public Game(int size){
        this.board = new Board(size);
    }

    public void play(){
        while (!nextTurn()){
            nextTurn();
        }
    }

    abstract boolean nextTurn();

    abstract boolean isGameOver();
}