public class Main {

    public static void main(String[] args) {
        
        // 0 -- Create the root folder
        Folder root = new Folder("php_demo");
        
        // 1 -- Create the subfolders of thr root folder
        Folder[] subfolders_root = new Folder[3];
        subfolders_root[0] = new Folder("Source Files");
        subfolders_root[1] = new Folder("Include Path");
        subfolders_root[2] = new Folder("Remote Files");
        
        // 2 -- Create subfolders of Source Files
        Folder[] subfolders_source = new Folder[4];
        subfolders_source[0] = new Folder(".phalcon");
        subfolders_source[1] = new Folder("app");
        subfolders_source[2] = new Folder("cache");
        subfolders_source[3] = new Folder("public");

        // 3 -- Create files of Source Files
        File[] files_source = new File[3];
        files_source[0] = new File(".htaccess.php");
        files_source[1] = new File("htrouter.php");
        files_source[2] = new File("index.html");

        // 4 -- Create subfolders of app
        Folder[] subfolders_app = new Folder[6];
        subfolders_app[0] = new Folder("config");
        subfolders_app[1] = new Folder("controllers");
        subfolders_app[2] = new Folder("library");
        subfolders_app[3] = new Folder("migrations");
        subfolders_app[4] = new Folder("models");
        subfolders_app[5] = new Folder("views");

        // 4 -- Add subfolders to app
        for (Folder subfolder: subfolders_app) {
            subfolders_source[1].addSubfolder(subfolder);
        }

        // 3 -- Add files to Source Files
        for (File file: files_source) {
            subfolders_root[0].addFile(file);
        }

        // 2 -- Add folders to Source Files
        for (Folder subfolder: subfolders_source) {
            subfolders_root[0].addSubfolder(subfolder);
        }

        // 1 -- Add subfolders to the root folder
        for (Folder subfolder: subfolders_root) {
            root.addSubfolder(subfolder);
        }

        // Print the file system
        root.print("");
    }
}