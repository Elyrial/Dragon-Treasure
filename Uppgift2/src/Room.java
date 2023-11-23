// Room klassen
import java.util.HashMap;

public class Room {
    private String rumNamn;
    private String roomDesc;
    private HashMap<String, Room> connectedRoom; // Använder en map för att hålla de kopplade rummen baserat på riktning

    // Konstruktör för angivna parametrar
    public Room(String rumNamn, String roomDesc) {
    // Kollar om rum namn/beskrivning är null/tomma
        if (rumNamn == null || roomDesc == null || rumNamn.isEmpty() || roomDesc.isEmpty()) {
            throw new IllegalArgumentException("Rumsnamn eller beskrivning får inte vara null eller tom.");
        }
    // Intitializerar 
        this.rumNamn = rumNamn;
        this.roomDesc = roomDesc;
        this.connectedRoom = new HashMap<>();
    }
    
   // Nedan setter och getters för rumnamn & rumbeskrivning
   // Kollar samt så att de ej är null/tomma
    public String getRoomDesc() {
        return roomDesc;
    }

    public String getrumNamn() {
        return rumNamn;
    }

    public void setRoomDesc(String roomDesc) {
        if (roomDesc == null || roomDesc.isEmpty()) {
            throw new IllegalArgumentException("Rumsbeskrivning får inte vara null eller tom.");
        }
        this.roomDesc = roomDesc;
    }

    public void setrumNamn(String rumNamn) {
        if (rumNamn == null || rumNamn.isEmpty()) {
            throw new IllegalArgumentException("Rumsnamn får inte vara null eller tom.");
        }
        this.rumNamn = rumNamn;
    }
   
    // Metod för att koppla ett rum till en specific riktning
    public void connectRum(String direction, Room room) {
        connectedRoom.put(direction, room); // Förvarar de
    }

    // Metod för att få de kopplade rummen i en pecifik riktning
    public Room getConnectedRoom(String direction) {
        return connectedRoom.get(direction); // Returnerar kopplade rummen, baserat på riktning
    }
