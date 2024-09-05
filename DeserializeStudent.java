import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //To deserialize, we need data from file. Use FileInputStream to read the file
        FileInputStream fis = new FileInputStream("new.txt");

        //to read object from byte stream
        ObjectInputStream ois = new ObjectInputStream(fis);

        //to convert stream into object
        Student student = (Student) ois.readObject();
        student.displayName();

        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
    }
}
