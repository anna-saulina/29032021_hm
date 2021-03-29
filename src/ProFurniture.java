public class ProFurniture {

        private String brand;

        private int noOfLegs;

        public ProFurniture(){}

        public ProFurniture(String brand, int legs){
            this.brand = brand;
            this.noOfLegs = legs;

        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }
    }


