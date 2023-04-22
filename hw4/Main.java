 public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.addCharacter('H', "Arial", 12, "Black");
        doc.addCharacter('e', "Arial", 12, "Black");
        doc.addCharacter('l', "Times New Roman", 16, "Red");
        doc.addCharacter('l', "Times New Roman", 16, "Red");
        doc.addCharacter('o', "Calibri", 10, "Blue");
        doc.addCharacter('W', "Arial", 12, "Black");
        doc.addCharacter('o', "Calibri", 10, "Blue");
        doc.addCharacter('r', "Arial", 12, "Black");
        doc.addCharacter('l', "Times New Roman", 16, "Red");
        doc.addCharacter('d', "Arial", 12, "Black");
        doc.addCharacter('C', "Arial", 12, "Black");
        doc.addCharacter('S', "Arial", 12, "Black");
        doc.addCharacter('5', "Arial", 12, "Black");
        doc.addCharacter('8', "Arial", 12, "Black");
        doc.addCharacter('0', "Arial", 12, "Black");
        doc.addCharacter('0', "Arial", 12, "Black");

        System.out.println(doc.getContent());
    }
}