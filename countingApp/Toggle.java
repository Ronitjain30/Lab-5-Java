package countingApp;

import display.Display;
import widgets.Button;

public class Toggle extends Button {

    private String current_state = "Up";

    Toggle(int width, int height) {
        super(width, height);
    }

    // redefines draw so that it draws a circular outline
    // (instead of the default rectangular outline of Button)
    // "position" of Toggle is defined as the lower left corner of the
    // box that would enclose the circle

    @Override
    public void onClick(Location p) {
        if (p.getX() >= getPos().getX() && p.getX() <= getPos().getX() + getWidth() && p.getY() >= getPos().getY() && p.getY() <= getPos().getY() + getHeight()) {
            handleClick();
        }
    }

    // Toggles its state on each click.
    // Displays the text "Up" or "Down" accordingly

    @Override
    public void handleClick() {
        if (Objects.equals(current_state, "Up")) current_state = "Down";
        else current_state = "Up";
        draw();
    }

    @Override
    public void draw(){
        Display.drawCircle(getPos().getX() + (getWidth()/2) , getPos().getY() + (getHeight()/2) , (getHeight()/2));
        super.set_text(current_state);
        super.draw();
    }

    // has a method to get its current state
    public String get_current_state(){
        return current_state;
    }
}
