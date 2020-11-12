public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car(" Clio ",50);
        System.out.println(clio.doStuff());
        Boat ferry = new Boat(" Le France ",12);
        System.out.println(ferry.doStuff());
        
    }
    
}
