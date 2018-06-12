public class Vehicle {
    String owner;
    int year;
    String model;
    //Create a constructor to instantiate the state (aka fields, attributes, properties, or members)
    public Vehicle ( String owner, int year, String model){
        this.owner = owner;
        this.year = year;
        this.model = model;
    }
//    public String getOwner(){
//        System.out.println(owner);
//        return owner;
//    }
//    public int getYear(){
//        System.out.println(year);
//        return year;
//    }
//    public String getModel(){
//        System.out.println(model);
//        return model;
//    }


    public String toString (){
        return owner + " " + year + " " + model;
    }


}
