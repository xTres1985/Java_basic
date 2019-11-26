package excersiseHw2;

public class Ex3 {
    private String text;
    public Ex3(String text) {
        this.text = text;
    }
    public int getSize() {
        return text.length();
    }
    public int getSizeWithoutSpaces () {
        return text.length() - text.replaceAll(" ", "").length();
    }

    public static void main(String[] args) {
        Ex3 ex3 = new Ex3("Ala ma kota a kot ma Alę");
        System.out.println("Długość napisu: " + ex3.getSize());
        System.out.println("Ilość spacji: " + ex3.getSizeWithoutSpaces());
    }

}
