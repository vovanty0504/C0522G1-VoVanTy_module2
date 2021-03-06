package ss00_mvc_haitt.controller;

import ss00_mvc_haitt.service.IPersonService;
import ss00_mvc_haitt.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService iPersonService = new TeacherService();
    int choose;

    public void menuTeacher() {
        do {
            System.out.println("1. Thêm mới giảng viên \n" +
                    "2. Xóa giảng viên \n" +
                    "3. Xem danh sách giảng viên \n" +
                    "4. Tìm kiếm theo ID\n" +
                    "5. Tìm kiếm theo tên\n" +
                    "6. Sắp xếp theo tên\n" +
                    "7. Quay về menu chính.\n");
            while (true) {
                try {
                    System.out.print("Mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai cú pháp vui lòng nhập số! ");
                }
            }
            switch (choose) {
                case 1:
                    iPersonService.add();
                    break;
                case 2:
                    iPersonService.remove();
                    break;
                case 3:
                    iPersonService.display();
                    break;
                case 4:
                    iPersonService.searchID();
                    break;
                case 5:
                    iPersonService.searchName();
                    break;
                case 6:
                    iPersonService.sortName();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);
    }
}

