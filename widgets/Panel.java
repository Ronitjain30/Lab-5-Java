package widgets;

import java.util.ArrayList;

public class Panel extends Widget {

    ArrayList<Widget> loc_in_panel = new ArrayList<>();

    public Panel(int width, int height) {
        super(width, height);
    }

    public void addWidget(Widget w, Location loc) {
        // add a child widget
        // position of lower left of child is at loc in Panel coordinates
        w.setPos(loc);
        loc_in_panel.add(w);
    }

    @Override
    public void draw() {
        Display.drawBox(getPos().getX(), getPos().getY(), getPos().getX() + getWidth(), getPos().getY() + getHeight());

        for (int i=0 ; i < loc_in_panel.size() ; i++) loc_in_panel.get(i).draw();
    }
    // implements/overrides draw. Draws a box corresponding to its size and
    // calls draw on each child widget
}
