import acm.program.*;
import acm.graphics.*;
import java.awt.Color;

public class Runner extends GraphicsProgram {

    public void run() {
        GRect sq = new GRect(0, 0, 100, 100);
        sq.setFilled(true);
        sq.setColor(Color.RED);
        add(sq);
    }

    public static void main(String[] args) {

        Runner world = new Runner();
        world.start();      

    }

}