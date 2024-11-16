package ObjectsAndClasses;
import java.text.*;
import java.util.*;

public class Student {

    String ID;
    String name;
    Date dateOfBrirth;
    String major;
    float gpa;
    private Date dateOfBirth;

    public Student() {
    }

    public Student(String ID, String name, Date dateOfBrirth, String major, float gpa) {
        this.ID = ID;
        this.name = name;
        this.dateOfBrirth = dateOfBrirth;
        this.major = major;
        this.gpa = gpa;
    }

    public void enterStudenthInfo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter is ID: ");
        this.ID = s.nextLine();

        System.out.print("Enter is Name: ");
        this.name = s.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        while (true) {
            System.out.print("Enter date of birth (dd/MM/yyyy): ");
            String dateOfBirthStr = s.nextLine();
            try {
                this.dateOfBirth = df.parse(dateOfBirthStr);
                break; 
            } catch (ParseException e) {
                System.out.println("Invalid date. Please enter again.");
            }
        }

        System.out.print("Enter is major: ");
        this.major = s.nextLine();

        System.out.print("Enter is gpa: ");
        this.gpa = s.nextFloat();

    }

    public void displayInformation() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("DateOfBrirth: " + dateOfBrirth);
        System.out.println("Major: " + major);
        System.out.println("Gpa:" + gpa);

    }

    String getStudentId() {
        return ID;
    }

}
