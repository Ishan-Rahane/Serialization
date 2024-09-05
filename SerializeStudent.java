import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) throws IOException {

        //create an object of student
        Student student = new Student("Ishan","ishan@gmail.com",28,"Pune");

        //We need to use fileOutputStream to write into file
        FileOutputStream fis = new FileOutputStream("new.txt");

        //now create a bytestream
        ObjectOutputStream oos = new ObjectOutputStream(fis);

        //how to serialize? we use writeObject() to write the object into stream
        oos.writeObject(student);
        //so once the object goes in writeObject(), it will get converted to byte stream
        oos.close();
        fis.close();
        System.out.println("Object state is transferred to file new");
    }
}
