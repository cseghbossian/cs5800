import java.util.ArrayList;

public class Folder {

    // Variables
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subfolders;

    // Constructor
    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
        this.subfolders = new ArrayList<Folder>();
    }

    // Accessors
    public String getName() {
        return name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubfolders() {
        return subfolders;
    }

    // Mutators
    public void addFile(File file) {
        files.add(file);
    }

    public void addSubfolder(Folder subfolder) {
        subfolders.add(subfolder);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void removeSubfolder(Folder subfolder) {
        subfolders.remove(subfolder);
    }

    // Print
   public void print(String prefix) {
        System.out.println(prefix + name + "/");
        for (File file : files) {
            System.out.println(prefix + " - " + file.getName());
        }
        for (Folder subfolder : subfolders) {
            subfolder.print(prefix + " ");
        }
    }
    
}
