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
        doc.addCharacter('5', "Comic Sans", 10, "Yellow");
        doc.addCharacter('8', "Comic Sans", 10, "Yellow");
        doc.addCharacter('0', "Comic Sans", 10, "Yellow");
        doc.addCharacter('0', "Comic Sans", 10, "Yellow");

        System.out.println(doc.getContent());

        System.out.println("~");
        
        System.out.println(doc.getCharacterPropInfo());
    }
}