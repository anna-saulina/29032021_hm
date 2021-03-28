public class OfficeChair extends  Chair {

    private String wheels;

    public OfficeChair(String human, int legs, String color) {
        super(human, legs, color);
        this.wheels="Rollers";
    }

    public OfficeChair (String human, int legs, String color) {
        super(human, legs, color);
        this.wheels="Rollers";
    }

    public OfficeChair (String human, int legs, String color) {
        super(human, legs, color);
    }

    public String getHeight() {
        return wheels;
    }

    public void setHeight(String height) {
        this.wheels = wheels;
    }
}


