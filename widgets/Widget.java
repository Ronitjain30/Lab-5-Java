package widgets;

import display.Display;

public abstract class Widget {
    private int width;
    private int height;
    private Location p;

    Widget(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setPos(Location p) {    // what is appropriate access specifier here?
        // position of lower left corner of widget in global coordinates of Display
        this.p = p;
    }

    public Location getPos() {   // what is the appropriate access specifier here?
        return p;
    }

    abstract public void draw(); // widget uses methods of Display to draw an outline
    // and any text within the outline
    // widgets should redraw themselves only if they have changed since last
    // draw

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    // add other protected/public methods as needed
}
