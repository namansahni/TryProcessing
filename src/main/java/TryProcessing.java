import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int xPos = 0;
    public static int yAxisDivider = 5;

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

        xPos++;
    }

    public void drawCircle(int speed) {
        int x = speed * xPos;
        int y = (speed * HEIGHT) / yAxisDivider;
        ellipse(x, y, DIAMETER, DIAMETER);
    }

}