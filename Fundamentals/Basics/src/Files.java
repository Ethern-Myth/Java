import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir");
        path += "/Basics/src/textfile/myfile.txt";

        String contents = "Forget to tell that I am AI";
        WriteFile(path, contents);
        ReadFile(path);

    }

    public static void ReadFile(String path) throws IOException {
        if (isFileExist(path)) {
            Scanner scan = new Scanner(Paths.get(path), "UTF-8");
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } else {
            System.out.println("No file was found to read.");
        }
    }

    public static void WriteFile(String path, String contents) throws IOException {
        if (isFileExist(path)) {
            FileWriter writer = new FileWriter(path, true);
            writer.write("\n" + contents);
            writer.close();
        } else {
            System.out.println("No file was found. Created new one");
            System.out.println("Re-run the app again.");
        }
    }

    private static boolean isFileExist(String path) throws IOException {
        File file = new File(path);
        if (file.exists() && !file.isDirectory()) {
            return true;
        } else {
            file.createNewFile();
            return false;
        }
    }
}
