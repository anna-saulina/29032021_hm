public class Chair extends ProFurniture {

    private String color;

    public Chair(String brand, int legs, String color){
        super(brand, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
