public class Door {
    private int position;
    private boolean locked;
    
    public Door(int position, boolean locked) {
        this.position = position;
        this.locked = locked;
        }

    public void isLocked() {
    if (locked) {
        System.out.println("Dörren är låst");
    }
        else {
            System.out.println("Dörren är öppen");
        }
    }
}