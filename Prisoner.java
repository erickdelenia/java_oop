public class Prisoner {
    private String name;
    private double height;
    private int sentence;
    private Cell cell;

    public Prisoner(String name, double height, int sentence, Cell cell) {

        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
        // System.out.println(name + " has been put in a cell");
    }

    public void think() {
        System.out.println("I'll have my revenge.");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence);
        cell.display();
    }

    // public void openDoor() {
    //     if (cell.isDoorOpen()) {
    //         cell.setDoor(false);
    //         System.out.println("The door is already Closed");
    //     } else {
    //         cell.setDoor(true);
    //         System.out.println("The door is already Opened");
    //     }
    // }

    // public void openDoor(String code) {
    //     cell.setDoor(code);
    // }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getSentence() {
        return sentence;
    }

    public String getCellName() {
        return cell.getCellName();
    }

    public void setName(String finalName) {
        name = finalName;
    }

    public void setHeight(double finalHeight) {
        height = finalHeight;
    }

    public void setSentence(int finalSentence) {
        sentence = finalSentence;
    }

    public void setCellName(String finalCellName) {
        cell.setName(finalCellName);
    }

}
