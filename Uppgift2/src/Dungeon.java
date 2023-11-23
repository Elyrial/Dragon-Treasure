// Dungeon klassen
import java.util.Scanner;

public class Dungeon {
    private Room currentRoom;
    private String welcomeMessage;
    private boolean endGame;
    
    // Konstruktör för angivna parametrar
    public Dungeon(Room currentRoom, String welcomeMessage) { 
    	this.currentRoom = currentRoom;
    	this.welcomeMessage = welcomeMessage;
    }
    
    // Konstruktör för att initializera rummen och kopplingarna
    public Dungeon() {
    // Array med rummens beskrivningar samt talar om för spelaren deras navigations alternativ
    	Room[] rooms = {
    			new Room("Du befinner dig i hallen. Du ser en brinnande fackla i rummets ena hörn och känner en motbjudande stank.", "Kommando: e, w eller tryck in [Avsluta] för att avsluta spelet."),
                new Room("Du befinner dig i observatoriet. Rummet är upplyst av några ljus som sitter på ett bord framför dig. ", "Kommando: n, w"),
                new Room("Du befinner dig i bergrummet med en ljusstrimma sipprandes genom en spricka i den östra väggen.", "Kommando: n, e"),
                new Room("Du befinner dig i ett fuktigt rum. Det är väldigt mörkt och grått. Du ser en död kropp på golvet.", "Kommando: s, n"),
                new Room("Du befinner dig i passagen. Det finns tre dörrar, en av dörrarna är låst. Ingen nyckel som passar. " + "Du kikar genom nyckelhålet och ser en skattkista full med guld." + "\n"
                		+ "            \"              _.-'_:-'||\\n\"+\n"
                		+ "            \"          _.-'_.-::::'||\\n\"+\n"
                		+ "            \"     _.-:'_.-::::::'  ||\\n\"+\n"
                		+ "            \"   .'`-.-:::::::'     ||\\n\"+\n"
                		+ "            \"  /.'`;|:::::::'      ||_\\n\"+\n"
                		+ "            \" ||   ||::::::'      _.;._'-._\\n\"+\n"
                		+ "            \" ||   ||:::::'   _.-!oo @.!-._'-.\\n\"+\n"
                		+ "            \" \\'.  ||:::::.-!() oo @!()@.-'_.||\\n\"+\n"
                		+ "            \"   '.'-;|:.-'.&$@.& ()$%-'o.'\\\\U||\\n\"+\n"
                		+ "            \"     `>'-.!@%()@'@_%-'_.-o _.|'||\\n\"+\n"
                		+ "            \"      ||-._'-.@.-'_.-' _.-o  |'||\\n\"+\n"
                		+ "            \"      ||=[ '-._.-\\\\U/.-'    o |'||\\n\"+\n"
                		+ "            \"      || '-.]=|| |'|      o  |'||\\n\"+\n"
                		+ "            \"      ||      || |'|        _| ';\\n\"+\n"
                		+ "            \"      ||      || |'|    _.-'_.-'\\n\"+\n"
                		+ "            \"      |'-._   || |'|_.-'_.-'\\n\"+\n"
                		+ "            \"      '-._'-.|| |' `_.-'\\n\"+\n"
                		+ "            \"           '-.||_/.-'\\n", "Kommando: s, n"),
                new Room("Du befinner dig i monsterrummet! VÄCK INTE DRAKEN!" + "\n"
                		+ "        \"                                                 .~)>>\\n\"+\n"
                		+ "        \"                                               .~))))>>>\\n\"+\n"
                		+ "        \"                                             .~))>>             ___\\n\"+\n"
                		+ "        \"                                           .~))>>)))>>      .-~))>>\\n\"+\n"
                		+ "        \"                                         .~)))))>>       .-~))>>)>\\n\"+\n"
                		+ "        \"                                       .~)))>>))))>>  .-~)>>)>\\n\"+\n"
                		+ "        \"                   )                 .~))>>))))>>  .-~)))))>>)>\\n\"+\n"
                		+ "        \"                ( )@@*)             //)>))))))  .-~))))>>)>\\n\"+\n"
                		+ "        \"              ).@(@@               //))>>))) .-~))>>)))))>>)>\\n\"+\n"
                		+ "        \"            (( @.@).              //))))) .-~)>>)))))>>)>\\n\"+\n"
                		+ "        \"          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\\n\"+\n"
                		+ "        \"       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\\n\"+\n"
                		+ "        \"      )) @@*. )@@ )   (\\\\_(\\\\-\\\\b  |))>)) //)))>>)))))))>>)>\\n\"+\n"
                		+ "        \"    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\\n\"+\n"
                		+ "        \"     )* @@@ )@*     (@)  (@) /\\\\b|))) //))))))>>))))>>\\n\"+\n"
                		+ "        \"   (( @. )@( @ .   _/  /    /  \\\\b)) //))>>)))))>>>_._\\n\"+\n"
                		+ "        \"    )@@ (@@*)@@.  (6///6)- / ^  \\\\b)//))))))>>)))>>   ~~-.\\n\"+\n"
                		+ "        \" ( @jgs@@. @@@.*@_ VvvvvV//  ^  \\\\b/)>>))))>>      _.     `bb\\n\"+\n"
                		+ "        \" ((@@ @@@*.(@@ . - | o |' \\\\ (  ^   \\\\b)))>>        .'       b`,\\n\"+\n"
                		+ "        \"   ((@@).*@@ )@ )   \\\\^^^/  ((   ^  ~)_        \\\\  /           b `,\\n\"+\n"
                		+ "        \"     (@@. (@@ ).     `-'   (((   ^    `\\\\ \\\\ \\\\ \\\\ \\\\|             b  `.\\n\"+\n"
                		+ "        \"       (*.@*              / ((((        \\\\| | |  \\\\       .       b `.\\n\"+\n"
                		+ "        \"                         / / (((((  \\\\    \\\\ /  _.-~\\\\     Y,      b  ;\\n\"+\n"
                		+ "        \"                        / / / (((((( \\\\    \\\\.-~   _.`\\\" _.-~`,    b  ;\\n\"+\n"
                		+ "        \"                       /   /   `(((((()    )    (((((~      `,  b  ;\\n\"+\n"
                		+ "        \"                     _/  _/      `\\\"\\\"\\\"/   /'                  ; b   ;\\n\"+\n"
                		+ "        \"                 _.-~_.-~           /  /'                _.'~bb _.'\\n\"+\n"
                		+ "        \"               ((((~~              / /'              _.'~bb.--~\\n\"+\n"
                		+ "        \"                                  ((((          __.-~bb.-~\\n\"+\n"
                		+ "        \"                                              .'  b .~~\\n\"+\n"
                		+ "        \"                                              :bb ,' \\n\"+\n"
                		+ "        \"                                              ~~~~\\n", "Kommando: s"),
                new Room("Utgång", "Du lämnar grottan med livet i behåll. Grattis, du förlorade inte! " + "Ange [Avsluta] för att avsluta spelet.")
             };
    	
    	connectRum(rooms); // Kopplar ihop rummen
    	currentRoom = rooms[0]; // Spelaren startar i detta rum som är hallen
    	endGame = false;
    	}
    
    // Kopplar ihop rummen baserat på deras navigation
    // Rum 0 = Hallen, Rum 1 = Observatoriet, Rum 2 = Bergrum, Rum 3 = Fuktigt rum, Rum 4 = Passage, Rum 5 = Monsterrummet, Rum 6 = Utgång
    // Exempel: rooms[0] kopplar e (east) till rooms[1] osv...
    private void connectRum(Room[] rooms) {
    	rooms[0].connectRum("e", rooms[1]);
        rooms[0].connectRum("w", rooms[2]);
        rooms[1].connectRum("w", rooms[0]);
        rooms[1].connectRum("n", rooms[4]);
        rooms[2].connectRum("e", rooms[0]);
        rooms[2].connectRum("n", rooms[3]);
        rooms[3].connectRum("s", rooms[2]);
        rooms[3].connectRum("n", rooms[6]);
        rooms[4].connectRum("s", rooms[1]);
        rooms[4].connectRum("n", rooms[5]);
        rooms[5].connectRum("s", rooms[4]);
    }

    // Metoden för att börja spela 
    public void playGame() {
    	Scanner scanner = new Scanner(System.in);
    	String welcomeMessage = ("När du går in i grottan kollapsar ingången bakom dig.");
    	System.out.println(welcomeMessage);
    
    // Loop för spelet
    do {
    	
    // Visar det nuvarande rummets beskrivning & namn
        System.out.println(currentRoom.getrumNamn());
        System.out.println(currentRoom.getRoomDesc());
        System.out.print("Ange ett kommando: ");
        String svar = scanner.nextLine();
        userSvar(svar); // Tar emot input för kommandon
    } while (!endGame);
}
    
    // Går igenom spelarens input för olika kommando alternativ
    private void userSvar(String svar) {
        switch (svar.toLowerCase()) {
    // De giltiga navigerings kommandon som finns i spelet
            case "n":
            case "s":
            case "e":
            case "w":
                userRiktning(svar);
                break;
    // Kommando för att sluta spela om användaren önskar det
            case "avsluta":
                endGame();
                break;
    // Talar om för spelaren att de har matat in ett ogiltigt kommando
            default:
                System.out.println("Ogiltigt kommando.");
                break;
        }
    }
    
    // Navigerar spelaren till deras valda riktning
    private void userRiktning(String direction) {
        Room nästaRum = currentRoom.getConnectedRoom(direction);

     // Ser om riktningen har ett rum kopplat, annars talar den om för spelaren att det ej är giltigt   
        if (nästaRum == null) {
            System.out.println("Det finns ingen väg där. ");
        } else {
            currentRoom = nästaRum; // Om giltigt, tar spelaren vidare till det kopplade rummet
        }
    }
    
    // Metoden för att avsluta spelet
    private void endGame() {
    endGame(true); // Statusen blir true för att avsluta
    printendGameMeddelande(); // Metod för att skriva avslutningsmeddelande
    }
    
    private void endGame(boolean status) {
    endGame = status; // Uppdaterar spelets status
    }
    
    private void printendGameMeddelande() { // Avslutningsmeddelande metoden
    System.out.println("Avslutar spelet. Tack för att du spelade!");
    }
}
