public class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(String prefix) {
        System.out.println(prefix + "- " + name);
    }
}


