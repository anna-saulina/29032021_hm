public class BarChair extends  Chair {

    private String height;

    public BarChair(String human, String color, int legs) {
        super(human, legs, color);
        this.height="High";
    }

    public BarChair(String human, int legs, String color){
        super(human, legs, color);
        this.height=height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}

