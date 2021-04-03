package widgets;

public class Label extends Widget {

    // has a text string as data - which is provided at create time
    String str = "Vote up or down";

    // width and height are determined from this
    public Label(int width, int height) {
        super(0, 0);
    }

    // assume each character is 5 units wide and 10 units high
    // does not react to mouse events
    // provides methods to get text

    @Override
    public void draw() {
        Display.drawText(getPos().getX(), getPos().getY(), str);
    }
}
