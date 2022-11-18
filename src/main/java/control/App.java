package control;

import processing.core.PApplet;
import processing.core.PFont;

public class App extends PApplet {
    int sizeX = 800, sizeY = 600;

    public static void main(String[] args) {
        String[] appletArgs = new String[] { "control.App" };
        PApplet.main(appletArgs);
    }

    @Override
    public void settings() {
        size(sizeX, sizeY);
    }

    public void setup(){
    }

    @Override
    public void draw() {

    }

    @Override
    public void keyPressed(){


    }
    @Override
    public void keyReleased(){

    }

    @Override
    public  void mousePressed(){

    }
}