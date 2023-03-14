public class Main {

    public static void main(String[] args) {
        
        // Create the root folder
        Folder root = new Folder("php_demo");
        
        // Create the subfolders of thr root folder
        Folder[] subfolders_root = new Folder[3];
        subfolders_root[0] = new Folder("Source Files");
        subfolders_root[1] = new Folder("Include Path");
        subfolders_root[2] = new Folder("Remote Files");
        
        // Create subfolders of Source Files
        Folder[] subfolders_source = new Folder[4];
        subfolders_source[0] = new Folder(".phalcon");
        subfolders_source[1] = new Folder("app");
        subfolders_source[2] = new Folder("cache");
        subfolders_source[3] = new Folder("public");

        // Create files of Source Files
        File[] files_source = new File[3];
        files_source[0] = new File(".htaccess.php");
        files_source[1] = new File("htrouter.php");
        files_source[2] = new File("index.html");

        // Create subfolders of app
        Folder[] subfolders_app = new Folder[6];
        subfolders_app[0] = new Folder("config");
        subfolders_app[1] = new Folder("controllers");
        subfolders_app[2] = new Folder("library");
        subfolders_app[3] = new Folder("migrations");
        subfolders_app[4] = new Folder("models");
        subfolders_app[5] = new Folder("views");

        for (Folder subfolder: subfolders_app) {
            subfolders_source[1].addSubfolder(subfolder);
        }

        for (File file: files_source) {
            subfolders_root[0].addFile(file);
        }

        for (Folder subfolder: subfolders_source) {
            subfolders_root[0].addSubfolder(subfolder);
        }

        // Add the subfolders to the root folder
        for (Folder subfolder: subfolders_root) {
            root.addSubfolder(subfolder);
        }

        // Print the file system
        root.print("");
    }
}