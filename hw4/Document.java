import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document {
    private List<Character> characters = new ArrayList<>();
    private Map<String, CharacterProps> propsMap = new HashMap<>();

    public void addCharacter(char c, String font, int size, String color) {

        String propsString = font + Integer.toString(size) + color;
        CharacterProps props = propsMap.get(propsString);

        if (props == null) {
            props = new CharacterProps(font, size, color);
            propsMap.put(props.toString(), props);
        }

        Character character = new Character(c, props);
        characters.add(character);

    }

    public String getContent() {

        StringBuilder sb = new StringBuilder();

        for (Character character : characters) {
            sb.append(character.getCharacterInfo());
            sb.append("\n"); // newlines added for readability
        }

        return sb.toString();

    }

    public String getCharacterPropInfo() {

        StringBuilder sb = new StringBuilder();

        sb.append("Total number of Character Props: ");
        sb.append(propsMap.size());
        sb.append("\n"); 

        for (String key : propsMap.keySet()) {
            sb.append(key);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void saveToFile(String filename) {
        // implementation to save document to file
    }

    public void loadFromFile(String filename) {
        // implementation to load document from file
    }
}