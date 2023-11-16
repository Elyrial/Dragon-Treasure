public class DragonTreasure {
private Room[][] rooms;
    
    // setupGame metod, här skapas rum och dörrar, kallar på den från Room klassen
    public void setupGame() {
        rooms = new Room[3][3];
        // private Room[][] rooms = new Room [3][3];
        rooms[0][0] = new Room("Rum 1");
        rooms[0][1] = new Room("Rum 2");
        rooms[0][2] = new Room("Rum 3");
        rooms[1][0] = new Room("Rum 4");
        rooms[1][1] = new Room("Rum 5");
        rooms[1][2] = new Room("Rum 6");
        rooms[2][0] = new Room("Rum 7");
        rooms[2][1] = new Room("Rum 8");
        rooms[2][2] = new Room("Rum 9");
        
    }
    
    // endGame metod, exit spelet
    public void endGame() {
    }

}