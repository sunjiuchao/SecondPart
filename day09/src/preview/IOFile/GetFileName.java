package preview.IOFile;

import java.io.File;

public class GetFileName {
    public static void main(String[] args) {
        File path = new File("E:\\IOFileTest");
        mkdir(path);
    }



    private static void mkdir(File path) {
        File[] files = path.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            }else{
                mkdir(file);
            }
        }
        path.delete();
    }
}
