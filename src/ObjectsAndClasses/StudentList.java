package ObjectsAndClasses;

import java.util.*;
import java.lang.String;

public class StudentList {

    ArrayList<Student> List;
    Student s = new Student();

    public StudentList() {
        this.List = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> list) {
        this.List = List;
    }

    public void enterStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can nhap thong tin : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin sinh vien thu " + (i + 1) + ":");
            s.enterStudenthInfo();
            List.add(s);

        }
    }

    public void displayAllStudent() {
        if (List.isEmpty()) {
            System.out.println("Danh sach sinh vien rong !");
        } else {
            System.out.println("Danh sach sinh vien :");
            for (Student student : List) {
                student.displayInformation();
                System.out.println();

            }
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student s : List) {
            if (s.getStudentId().equals(idToFind)) {
                return s;
            }

        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student s = findStudentById(idToDelete);
        if (s != null) {
            List.remove(s);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student s = findStudentById(idToEdit);
        if (s != null) {
            System.out.println("Nhập Thong tin moi cho sinh vien :");
            s.enterStudenthInfo();
            return true;
        }
        return false;
    }
}
