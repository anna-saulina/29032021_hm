public class ProFurnuture {
    public ProFurnuture(String human, int legs) {
    }

    public class Furnniture {


        private String usedByHuman;

        private int noOfLegs;

        public Furnniture(){}

        public Furnniture( String human, int legs){
            this.usedByHuman = human;
            this.noOfLegs = legs;

        }

        public String getUsedByHuman() {
            return usedByHuman;
        }

        public void setUsedByHuman(String usedByHuman) {
            this.usedByHuman = usedByHuman;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }
    }

}
