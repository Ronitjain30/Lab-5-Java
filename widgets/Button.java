package widgets;

public abstract class Button extends Widget implements Clickable {

    public Button(int width, int height) {
        super(width, height);
    }

    // has methods to get/set text
    private String str;
    public String get_text(){
        return str;
    }
    public void set_text(String s){
        str = s;
    }

    // implements/overrides draw to draw a box at the correct position and size
    // and displays the text of the button
    @Override
    public void draw() {
        Display.drawText(getPos().getX(), getPos().getY(), str);
    }

    // implement the onClick method to check if the click is within its bounds
    // and if so, invokes protected method handleClick
    public abstract void onClick(Location p);

    public abstract void handleClick();  // should we make this abstract?
}
