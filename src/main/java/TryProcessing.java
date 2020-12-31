import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int x_pos = 0;

    public static void main(String args[]) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        drawSketch();
    }

    private void drawSketch() {

        for (int speed = 1; speed < 5; speed++) {
            drawCircle(speed);
        }

        x_pos++;
    }

    public void drawCircle(int speed) {
        int x = speed * x_pos;
        int y = (speed * HEIGHT) / 5;
        ellipse(x, y, DIAMETER, DIAMETER);
    }

}