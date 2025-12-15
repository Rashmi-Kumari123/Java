import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileHandling {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("abc.text");
            if (file.createNewFile()) {
                System.out.println("File is created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter("abc.text");
            writer.write("Students are the brand amabassador of Sitare University");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            int i;
            FileReader reader = new FileReader("abc.text");
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File file = new File("abc.text");
            if (file.delete()) {
                System.out.println("File is deleted: " + file.getName());
            } else {
                System.out.println("Failed in deletion.");
            }
        }finally {

        }

    }
}
