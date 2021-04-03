package display;


import widgets.*;

public class Display {

    public void set(Panel p, int x0, int y0) {
        // add a Panel at location x0,y0
        Location loc_of_panel = new Location(x0, y0);
        p.setPos(loc_of_panel);
        p.draw();
    }

    public void redisplay() {
        // invokes draw of panels

    }

    ArrayList<Clickable> all_clickables = new ArrayList<>();
    public void registerClickable(Clickable c) {
        // maintains list of Clickables that have been registered. These will
        // be notified when processClick is invoked
        all_clickables.add(c);
    }

    public void processClick(int x, int y) {  // x,y in global coordinates of Display
        // passes on to all Clickables registerd
        for ( int i=0; i < all_clickables.size() ; i++){
            Location p = new Location(x, y);
            all_clickables.get(i).onClick(p);
        }
        // invokes redisplay after each click
    }

    // methods used by other classes to actually draw on the display
    public static void drawBox(int x0, int y0, int x1, int y1) {
        // draw a line from lower left x0,y0 to upper right x1, y1
        // for purposes of this exercise print to System.out:
        // Box from <x0>, <y0> to <x1>, <y1>
        System.out.println("Box from " + x0 + ", " + y0 + " to " + x1 + ", " + y1);

    }

    public static void drawText(int x0, int y0, String s) {
        // display a string starting at position x0, y0
        // for purposes of this exercise, print to System.out:
        // Text at <x0>, <y0> : <input string s>
        System.out.println("Text at " + x0 + ", " + y0 + " : " + s);
    }

    public static void drawCircle(int cx, int cy, int radius) {
        // draw a circle with given parameters
        // for purposes of this exercise, print to System.out:
        // Circle at <cx>, <cy> : radius <radius>
        System.out.println("Circle at " + cx + ", " + cy + " : radius " + radius);
    }
}
