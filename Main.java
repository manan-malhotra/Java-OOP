public class Main{
    public static void main(String[] args) {
        Swift myCar = new Swift(10,30,5);

        System.out.println(myCar.getDoor());
        System.out.println(myCar.getWheels());
        System.out.println(myCar.getSunroof());
        System.out.println(myCar.getCost());
        System.out.println(myCar.getTank());
        System.out.println(myCar.getMileage());
        System.out.println(myCar.getGears());
        myCar.gearUp();
        System.out.println(myCar.getGears());
        myCar.gearUp(30);
        System.out.println(myCar.getGears());
        myCar.gearDown();
        System.out.println(myCar.getGears());
        myCar.gearDown(10);
        System.out.println(myCar.getGears());
    }
}

class Vehicles{
    private int door,wheels,sunroof;

    public Vehicles(int door, int wheels, int sunroof) {
        this.door = door;
        this.wheels = wheels;
        this.sunroof = sunroof;
    }
    

    public int getDoor() {
        return this.door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSunroof() {
        return this.sunroof;
    }

    public void setSunroof(int sunroof) {
        this.sunroof = sunroof;
    }
    
}

class Cars extends Vehicles{
    private int cost,tank,mileage;
    public Cars( int sunroof,int cost,int mileage,int tank){
        super(4,  4, sunroof);
        this.cost=cost;
        this.mileage=mileage;
        this.tank=tank;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTank() {
        return this.tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}

class Swift extends Cars{
    private int gears;
    public Swift(int mileage,int tank,int gears){
        super( 0, 45, mileage,tank);
        this.gears=gears;
    }

    public int getGears() {
        return this.gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void gearUp(){
        this.gears+=1;
    }

    public void gearUp(int k){
        this.gears+=k;
    }

    public void gearDown(int k){
        this.gears-=k;
    }

    public void gearDown(){
        this.gears-=1;
    }
}