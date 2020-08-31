import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FitnessRep {
    public static void main(String[] args) {

        Employee emp1 = new Administration("Claus", "221175-1011");
        Employee emp2 = new Instructor("Tove", "011080-1014",20);
        Employee emp3 = new Administration("Anna", "011080-1012");
        Employee emp4 = new Instructor("Henning", "011080-1014",15);

        Member mem1 = new Member("Morten","130195-1301",false);
        Member mem2 = new Member("Martin","221175-1011",true);
        Member mem3 = new Member("Martina","050970-1409",false);
        Member mem4 = new Member("Marcel","221175-1011",true);


        ArrayList<Person> fullList = new ArrayList<>();
        fullList.addAll(Arrays.asList(emp1,emp2,emp3,emp4,mem1,mem2,mem3,mem4));

        System.out.println("Employees" +"\n"+  "Name" + "\t\t" + "CPR" + "\t\t\t\t" + "Hours" + "\t\t" + "Salary" + "\t\t" + "Vacation");
        for(Person p : fullList){
            if (p instanceof Employee)
            System.out.println(p);
        }
        System.out.println("\n");
        System.out.println("Members" + "\n"+  "Name" + "\t\t" + "CPR" + "\t\t\t\t" + "Membership" + "\t\t" + "Fee");
        for(Person p : fullList){
            if (p instanceof Member)
                System.out.println(p);
        }
        System.out.println("\n");
        System.out.println("All" +"\n"+  "Name" + "\t" + "CPR");
        for (Person p : fullList) {
            System.out.println(p.getName() + "\t" + p.getCpr());
        }
        /*
        Scanner input = new Scanner(System.in);
        String inputChoice = " ";
        FileHandler fileHandler = new FileHandler();
        fileHandler.læsFil();
        */

    }
}
