public class Dungeon {
    private Room currentRoom;
    private String welcomeMessage;
    
    public Dungeon(Room currentRoom, String welcomeMessage) {
        this.currentRoom = currentRoom;
        this.welcomeMessage = welcomeMessage;
    }

    // playGame metod
    public void playGame() {
        System.out.println("Skriv ditt namn och tryck på [Enter] för att komma in i grottan");
    }
}
