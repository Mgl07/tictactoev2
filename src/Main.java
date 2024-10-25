import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size do you want the board?");
        int size = scanner.nextInt();

        System.out.println("Choose the type game \n1.-Normal \n2.-Inverted");
        int type = scanner.nextInt();

       // TicTacToeInverted inverted  = new TicTacToeInverted(size, type);
        TicTacToeNormal normal= new TicTacToeNormal(size, type);
        normal.play();

       //(type == 1 ? normal : normal ).play();
    }
}