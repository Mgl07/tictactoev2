public abstract class Game {
    Board board;
    Player player1, player2, currentPlayer;
    int type;

    public Game(int size, int type){
        this.board = new Board(size);
        this.type = type;
    }

    public void play(){
        while (!nextTurn()){
            nextTurn();
        }
    }

    abstract boolean nextTurn();

    abstract boolean isGameOver();

}