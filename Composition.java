public class Composition{
    public static void main(String[] args) {
        window Win = new window(3);

        Room myRoom = new Room(Win , new Bulb(240));

        myRoom.close();
        myRoom.open();

        myRoom.switchBulb();
    }
}

class Room{
    private window theWindow;
    private Bulb bulb;
    public Room(window theWindow, Bulb bulb) {
        this.theWindow = theWindow;
        this.bulb=bulb;
    }

    public void open(){
        theWindow.openWindow();
    }
    public void close(){
        theWindow.closeWindow();
    }

    public void switchBulb(){
        bulb.switchBulb();
    }

    

}

class Bulb{
    private int voltage;
    public Bulb(int voltage){
        this.voltage=voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void switchBulb(){
        System.out.println("Bulb of "+ this.voltage +"V is on");
    }

}

class window{
    private int noOfWindows;

    public window(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }

    public int getNoOfWindows() {
        return this.noOfWindows;
    }

    public void openWindow(){
        System.out.println("Window is open now");
    }
    public void closeWindow(){
        System.out.println("Window is close now");
    }

}