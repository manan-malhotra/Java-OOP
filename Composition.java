public class Composition{
    public static void main(String[] args) {
        window Win = new window(3);
        Room myRoom = new Room(Win , 3);

        myRoom.close();
        myRoom.open();
    }
}

class Room{
    private window theWindow;
    private int bulb;
    public Room(window theWindow, int bulb) {
        this.theWindow = theWindow;
        this.bulb=bulb;
    }

    public void open(){
        theWindow.openWindow();
    }
    public void close(){
        theWindow.closeWindow();
    }

    public int getBulb() {
        return bulb;
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