public class Chair extends ProFurnuture {

    private String color;

    public Chair(String human, int legs) {
        super(human, legs);
        this.color="Black";
    }

    public Chair(String human, int legs, String color){
        super(human, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
