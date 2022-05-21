package mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    public static final int OPTION_ROCK = 0;
    public static final int OPTION_PAPER = 1;
    public static final int OPTION_SCISSORS = 2;

    @InjectMocks
    private Game game;

    @Mock
    Scanner scanner;
    @Mock
    Random random;


    private ByteArrayOutputStream out;

    @Before
    public void before(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void should_show_SentenceWelcomeTheGameBeforeQuit() {

        when(scanner.nextLine()).thenReturn("Quit");

        game.play();

        Assert.assertTrue(out.toString().contains("Let's play Rock, Paper, Scissors!"));
    }

    @Test
    public void should_exit_theGameWithQuit() {
        when(scanner.nextLine()).thenReturn("Quit");
        game.play();
    }

    @Test
    public void should_exit_theGameWithQuitAfterRock() {
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        game.play();
    }


    @Test
    public void when_chooseRock_then_beatsScissors() {

        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_SCISSORS);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose scissors"));
        Assert.assertTrue(out.toString().contains("you win!"));
    }

    @Test
    public void when_chooseScissor_then_beatsPaper() {

        when(scanner.nextLine()).thenReturn("Scissors").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_PAPER);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose paper"));
        Assert.assertTrue(out.toString().contains("you win!"));
    }

    @Test
    public void when_choosePaper_then_beatsRock() {

        when(scanner.nextLine()).thenReturn("Paper").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_ROCK);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose rock"));
        Assert.assertTrue(out.toString().contains("you win!"));
    }


    @Test
    public void when_chooseRock_then_losePaper(){
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_PAPER);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose paper"));
        Assert.assertTrue(out.toString().contains("you lose."));

    }

    @Test
    public void when_choosePaper_then_loseScissor(){
        when(scanner.nextLine()).thenReturn("Paper").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_SCISSORS);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose scissors"));
        Assert.assertTrue(out.toString().contains("you lose."));

    }

    @Test
    public void when_chooseScissor_then_loseRock(){
        when(scanner.nextLine()).thenReturn("Scissors").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_ROCK);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose rock"));
        Assert.assertTrue(out.toString().contains("you lose."));

    }


    @Test
    public void when_bothChooseRock_then_tie(){
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_ROCK);

        game.play();

        Assert.assertTrue(out.toString().contains("Computer chose rock"));
        Assert.assertTrue(out.toString().contains("It's a tie"));

    }
}
