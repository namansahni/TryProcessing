import  processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;

    public static void main(String args[]) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
//        System.out.println("Testing setup method..");
//        ellipse(WIDTH/2, HEIGHT/2, DIAMETER, DIAMETER);
    }

    @Override
    public void draw() {
        ellipse(WIDTH/2, HEIGHT/2, DIAMETER, DIAMETER);
//        System.out.println("Testing draw method..");
//        super.draw();
    }
}