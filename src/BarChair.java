public class BarChair extends  Chair {

    private String height;

    public BarChair (String brand, int legs, String color){
        super(brand, legs, color);
        this.height="High";
    }


    public String getHeight() {
        return height;
    }

    public void setHeight(String wheels) {
        this.height = height;
    }
}



