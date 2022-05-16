public class Cup {
    private double capacity;
    private double currentVolume;
    public Cup(double c, double v) {
        capacity = c;
        currentVolume = v;
    }

    public Cup(double c) {
        capacity = c;
    }

    public void setCapacity(double c) {
        capacity = c;
    }

    public void setCurrentVolume(double v) {
        currentVolume = v;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public String toString() {
        return "A " + capacity + " oz cup currently filled with " + currentVolume + " oz";
    }

    public void pour(Drink drink) {
        double room = capacity - currentVolume;
        if(room >= drink.getOunces()){
            double newVol = (getCurrentVolume() + drink.getOunces());
            currentVolume = newVol;
            drink.setOunces(0.0);
        }
        if(room < drink.getOunces()) {
            currentVolume = capacity;
            double drinkVol = drink.getOunces() - room;
            drink.setOunces(drinkVol);
        }
    }

    public static void main(String[] args) {
        Drink DietCoke = new Drink("Diet Coke", 7.5);
        Cup RedSolo = new Cup(32);
        RedSolo.pour(DietCoke);
        System.out.println(RedSolo);
        System.out.println(DietCoke);
        Drink Sprite = new Drink("Sprite", 67.628);
        RedSolo.pour(Sprite);
        System.out.println(RedSolo);
        System.out.println(Sprite);
    }
}