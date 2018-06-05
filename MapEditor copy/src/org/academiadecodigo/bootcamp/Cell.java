import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell extends Rectangle {

    private Rectangle cell;

    public Cell() {

        cell = new Rectangle(4, 4, 10, 10);

        cell.draw();

        cell.isFilled();




    }
}