
package ObjectsAndClasses;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner s = new Scanner(System.in);

            while(true){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap so thong tin cua n sinh vien: ");
            System.out.println("2. Hien thi tat ca thong tin sinh vien ");
            System.out.println("3. Tim kiem sinh vien bang id ");
            System.out.println("4. Xoa sinh vien bang id ");
            System.out.println("5. Chinh sua sinh vien bang id ");
            System.out.println("6. thoat");
            System.out.print("Nhap chuc nang ban muon chon:  ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    System.out.println();
                    studentList.enterStudents();
                    break;

                case 2:
                    System.out.println();
                    studentList.displayAllStudent();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Nhap id can tim : ");
                    String idToFind = s.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        System.out.println("Tim thay sinh vien co :" + idToFind);
                        foundStudent.displayInformation();
                    } else {
                        System.out.println("sinh vien voi id " + idToFind + " khong tim thấy");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Nhap ma sinh vien can xoa ");
                    String idToDelete = s.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("xoa sinh vien thanh cong !");
                    } else {
                        System.out.println("khong tim thay sinh vien co id : " + idToDelete);
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.print("Nhap Sinh vien can sua: ");
                    String idToEdit = s.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("Chinh sua sinh vien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien voi id :  " + idToEdit);
                    }
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Thoat chuong trinh.");
                    
                  break;

                default:
                    System.out.println("Lua chon khong hop le ! .Vui long chon lai.");
                    break;
            }
            if(choice==6){
                break;
            }
        }
    }
}
