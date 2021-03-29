class Main {

        public static void main(String[] args) {
            Chair chair = new Chair("ikea", 4, "black");
            BarChair barChair = new BarChair("ikea", 3, "black");
            OfficeChair officeChair = new OfficeChair("ikea", 4, "black", "Rollers");
            Sofa sofa = new Sofa("ikea", 4, "leather");

            System.out.println("Chair brand" + chair.getBrand());
            System.out.println("Chair has " + chair.getNoOfLegs() + " legs.");
            System.out.println("Chair color is " + chair.getColor());
            System.out.println("Office Chair wheels type is " + officeChair.getWheels());
            System.out.println("Office Chair color is " + officeChair.getColor());
            System.out.println("Barchair color is " + barChair.getColor());
            System.out.println("Barchair color is " + barChair.getHeight());
            System.out.println("Sofa cover material is " + sofa.getMaterial());
            System.out.println("Sofa brand " + sofa.getBrand());

        }

    }



