public class OfficeChair extends  Chair {

    private String wheels;

    public OfficeChair (String brand, int legs, String color, String wheels){
        super(brand, legs, color);
        this.wheels=wheels;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
}




