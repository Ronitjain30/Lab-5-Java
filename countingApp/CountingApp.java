package countingApp;


import display.Display;
import widgets.*;


public class CountingApp {

    Display disp;
    public CountingApp(Display d) {
        // Display object made available at construction. Cannot be changed
        disp = d;
    }

    public void init() {
        // sets up widgets

        // create a Panel with location 50,50 and width 400, height 200
        Panel panel = new Panel(400,200);

        // creates the following widgets, which are added as children of this panel
        // Note locations are relative to Panel
        // - Toggle button:   location 100, 60, size 50, 50
        // - Counter button:  location 200, 60, size 100, 40
        // - Label: location  150, 150, text: "Vote up or down"

        Toggle toggle_widget = new Toggle(50, 50);
        Counter counter_widget = new Counter(100, 40, toggle_widget);
        Label label_widget = new Label(0,0);

        //location for every widget type will be (given location)+50, (given location)+50

        Location toggle_widget_location = new Location(150, 110);
        Location counter_widget_location = new Location(250, 110);
        Location label_widget_location = new Location(200, 200);

        panel.addWidget(toggle_widget, toggle_widget_location);
        panel.addWidget(counter_widget, counter_widget_location);
        panel.addWidget(label_widget, label_widget_location);

        disp.set(panel, 50, 50);

        // registers those widgets that are Clickable with Display
        disp.registerClickable(toggle_widget);
        disp.registerClickable(counter_widget);

        disp.redisplay();
    }
}
