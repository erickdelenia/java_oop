public class Main {
    public static void main(String[] args) {
        Cell cell = new Cell("Cell Koruptor", false,"abcd");
        Prisoner bubba = new Prisoner("Setya Novanto", 2.08, 4, cell);
        bubba.display();
        // bubba.openDoor("abcd"); // error
        // bubba.openDoor("acd");  // error
        // bubba.openDoor("abcd"); // error
        // bubba.cell.openDoor("abcd"); // error karena cell sudah private tidak bisa diakses diluar

        
    }
}
