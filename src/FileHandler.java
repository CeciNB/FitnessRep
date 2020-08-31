import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    private Scanner sc;
    private List<Person> fullList;

    public FileHandler() {
        try{
            this.sc = new Scanner(new File("persons.txt"));
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

        }
    }
    public void læsFil() {
        String navn = null;
        String cpr = null;

        while (sc.hasNext()) {

        }
    }
}
