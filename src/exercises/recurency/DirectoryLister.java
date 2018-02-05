package exercises.recurency;

import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        DirectoryLister dl = new DirectoryLister();
        File file = new File("D:/");
        dl.showDirectories(file);
    }

    public void showDirectories(File file) {
        File[] files = file.listFiles();

        if(files != null) {
            for (File f: files) {
                if (f.isDirectory()) {
                    System.out.println("folder " + f.getAbsolutePath());
                    showDirectories(f);
                } else {
                    System.out.println(" plik " + f.getAbsolutePath());
                }
            }
        }
    }
}
