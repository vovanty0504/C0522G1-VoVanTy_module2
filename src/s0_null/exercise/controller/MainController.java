package s0_null.exercise.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chào mừng bạn đến với Codegym. \n" +
                    "1. Quản lí học sinh.\n" +
                    "2. Quản lí giảng viên. \n" +
                    "3. Thoát chương trình.");

            System.out.print("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
