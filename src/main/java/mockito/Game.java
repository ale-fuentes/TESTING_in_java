package mockito;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    public void play() {
        ScoreBoard scoreBoard = new ScoreBoard();
        printGameRules();
        String choice = input.nextLine().toUpperCase();

        while (!choice.equals("QUIT")) //do the following if the user does not put in "quit"
        {
            GameOption choicenum = getChoiceNum(choice);
            if (choicenum == null) {
                System.out.println("Sorry, it looks like you didn't enter a correct input. Try again.");
                continue;
            }

            GameOption compnum = getChoiceComputer();
            gameResult(scoreBoard, choicenum, compnum);
            printResult(scoreBoard);
            choice = input.nextLine().toUpperCase();
        }

    }

    private void printResult(ScoreBoard scoreBoard) {
        System.out.println("wins:" + scoreBoard.getWinnum().toString().toLowerCase() + "\nloses:" + scoreBoard.getLossnum().toString().toLowerCase() + "\nties:" + scoreBoard.getTienum().toString().toLowerCase()); //print out number of wins, ties, and loses
        System.out.println("Let's play again! \n \n"); //start game again
        System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
    }

    private void gameResult(ScoreBoard scoreBoard, GameOption choicenum, GameOption compnum) {
        if (choicenum == compnum) //tie cases
        {
            showTie(scoreBoard);
        } else if ((choicenum == GameOption.ROCK && compnum == GameOption.SCISSORS) //user wins rock vs scissors
                || (choicenum == GameOption.SCISSORS && compnum == GameOption.PAPER) //user wins scissors vs paper
                || (choicenum == GameOption.PAPER && compnum == GameOption.ROCK) //user wins paper vs rock
        ) {
            showWins(scoreBoard);
        } else //otherwise computer wins
        {
            showLose(scoreBoard);
        }
    }

    private void showLose(ScoreBoard scoreBoard) {
        System.out.println("you lose.");
        scoreBoard.incrementLoss();
    }

    private void showTie(ScoreBoard scoreBoard) {
        System.out.println("It's a tie");
        scoreBoard.incrementTie();
    }

    private void showWins(ScoreBoard scoreBoard) {
        System.out.println("you win!");
        scoreBoard.incrementWin();
    }

    private GameOption getChoiceNum(String choice) {

        GameOption selectOption = null;
        if (choice.equals("quit"))
            System.exit(0);

        try {
            selectOption = GameOption.valueOf(choice);
        } catch (Exception ex) {
            return null;
        }
        return selectOption;

    }

    private GameOption getChoiceComputer() {
        GameOption option = GameOption.values()[random.nextInt(3)];
        System.out.println("Computer chose " + option.toString().toLowerCase());
        return option;
    }

    private void printGameRules() {
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Say \"Rock\", \"Paper\", or \"Scissors\" to indicate your choice. Otherwise say \"Quit\" to quit.");
    }
}