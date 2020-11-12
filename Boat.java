public class Boat extends Vehicle{
    
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        return "Je suis " + brand + " et je fais glou glou !,ma vitesse est de : " + kilometers + " Noeuds";
        
    }
}
