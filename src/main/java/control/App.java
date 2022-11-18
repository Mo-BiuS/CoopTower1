package control;

import view.MainWindow;
import processing.core.PApplet;

public class App extends PApplet {
    public static final Game game = new Game();

    public static void main(String[] args) {
        PApplet.main(MainWindow.class);
        game.start();
    }
}