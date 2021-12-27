import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XMLCreator xml = new XMLCreator();
        List<Student> s = new ArrayList<Student>();
        s.add(new Student("Stefan", "Stefanovski", 100));
        s.add(new Student("Aleksandar", "Ristevski", 105));
        xml.createXMLFile("file.xml", s);
    }
}
