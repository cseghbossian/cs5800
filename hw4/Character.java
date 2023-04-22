public class Character {
    private char character;
    private CharacterProps props;

    public Character(char c, CharacterProps props) {
        this.props = props;
        this.character = c;
    }

    public String getCharacterInfo() {
        return character + String.format(" [font=%s, size=%d, color=%s]",
            props.getFont(), props.getSize(), props.getColor());
    }
}