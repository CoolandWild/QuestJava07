public class Car extends Vehicle{

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

        public String doStuff() {
            return "Je suis" + brand + "et je fais vroum vroum !,ma vitesse est de : " + kilometers + " Km/h";
        
    }
}