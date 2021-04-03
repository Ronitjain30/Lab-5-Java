package countingApp;


public class Counter extends Button {
    int counter = 0;

    // has a reference to an instance of Toggle button
    Toggle toggle_instance = new Toggle(0,0);

    Counter(int width, int height, Toggle toggle_instance) {
        super(width, height);
        this.toggle_instance = toggle_instance;
    }

    @Override
    public void onClick(Location p) {
        if (p.getX() >= getPos().getX() && p.getX() <= getPos().getX() + getWidth() && p.getY() >= getPos().getY() && p.getY() <= getPos().getY() + getHeight()) {
            handleClick();
        }
    }

    // Everytime it is clicked, it increments or decrements counter by 1
    // depending on state of the Toggle instance
    @Override
    public void handleClick() {
        if (Objects.equals(toggle_instance.get_current_state(), "Up")) counter = counter + 1;
        else counter = counter - 1;
        draw();
    }

    // Shows the current count as its text

    @Override
    public void draw(){
        Display.drawBox(getPos().getX(), getPos().getY(), getPos().getX() + getWidth(), getPos().getY() + getHeight());
        super.set_text(Integer.toString(counter));
        super.draw();
    }
}
