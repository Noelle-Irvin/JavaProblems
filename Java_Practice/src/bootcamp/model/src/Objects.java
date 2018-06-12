public class Main {
//Public class Test{
//    Public static void main (String [] args){
//        Person person1 = new Person ( // your code here );

//Your code here

    public static void main(String[] args) {
        // 'Sonny', email of 'sonny@gmail.com', and phone of '483-485-4948'
        Person sonny = new Person("Sonny", "sonny@gmail.com", "483 - 485 - 4948");
        //'Jordan', email of 'jordan@aol.com', and phone of '495-586-3456'
        Person jordan = new Person("Jordan", "jordan@aol.com", "495 - 586 - 3456");

//        print Sonny's email as output using getEmail
        sonny.getEmail();
//        Use this getEmail getter method to print Jordan's email as output
        jordan.getEmail();
//        change Sonny's phone number to ' 123-434-4323' using setPhoneNumber
        sonny.setPhoneNumber("123 - 434 - 4323");
//        print Sonny's phone number and print Jordan's phone number using getPhoneNumber
        sonny.getPhoneNumber();
        jordan.getPhoneNumber();
//        Have sonny greet jordan using the printGreeting method.
        sonny.printGreeting(jordan);
//        Have jordan greet sonny using the printGreeting method.
        jordan.printGreeting(sonny);
    }
}