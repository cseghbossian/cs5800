public class CharacterProps {
    
    private String font;
    private int size;
    private String color;

    public CharacterProps(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return font + Integer.toString(size) + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CharacterProps) {
            CharacterProps other = (CharacterProps) obj;
            return font.equals(other.font) && size == other.size && color.equals(other.color);
        }
        return false;
    }
}