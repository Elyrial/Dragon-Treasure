// DragonTreasure klassen
import java.util.Scanner;

public class DragonTreasure {	
	public static void main(String[] args) {
	 setupGame(); // Spelets start
	 
	}
	
	// Välkommnar spelaren & ber om deras namn input
	public static void setupGame() {
		Scanner input = new Scanner(System.in);
		System.out.println("Välkommen till Dragon Treasure\n" + "Skriv ditt namn och tryck på [Enter] för att starta ett nytt spel...");
		Player spelareNamn = new Player(input.nextLine());
	
	// Skapar Dungeon för spelet & ger förklaring om spelet
    Dungeon dungeon = new Dungeon();
    System.out.println("Välkommen " + spelareNamn.getName() + " till din skattejakt. " + "Du står utanför en grotta. Det luktar svavel från öppningen. " + "Grottöppningen är norr. Skriv \"n\" och tryck på [Enter] för att komma in i grottan.");
   
    // Ber spelaren om input för att starta spelet, startar enbart om spelaren matar in "n" 
    String användareInput;
    do {
    	användareInput = input.nextLine().toLowerCase(); // Omvandlar inputen till lowercase
        if (!användareInput.equals("n")) {
            System.out.println("Du måste skriva 'n' för att komma in i grottan. Försök igen."); // Ber om rätt input
        }
    } while (!användareInput.equals("n"));
    dungeon.playGame(); // Startar spelet
    
    input.close(); // Stänger Scanner input
    
    }
}
