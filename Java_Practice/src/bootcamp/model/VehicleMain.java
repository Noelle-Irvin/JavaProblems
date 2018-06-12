public class Main {

    //create a vehicle object and print the contents of a vehicle in output
    public static void main (String [] args){
        Vehicle ford = new Vehicle ( "Mitch", 2010, "Ford Fusion");
//        ford.getOwner();
//        ford.getYear();
//        ford.getModel();
        System.out.println(ford.toString());
    }
}
