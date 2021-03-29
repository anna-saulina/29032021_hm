public class Sofa extends ProFurniture {

    private String material;

    public Sofa (String brand, int legs, String cover) {
        super(brand, legs);
        this.material = cover;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
