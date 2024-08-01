package View;



import Controller.RegularController;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        chooseMainFunction();
    }
    public static void chooseMainFunction(){
        do {
            System.out.println("Lựa chọn chức năng : \n" +
                    "1. Thành viên Thường. \n" +
                    "2. Thanh viên VIP. \n" +
                    "3. Thoát.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    chooseBenhNhanThuong();
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(1);
                default:
                    System.out.println("Vui lòng nhập đúng lựa chọn.");
            }
        } while(true);
    }
    public static void chooseBenhNhanThuong(){
        RegularController regularController = new RegularController();
        do {
            System.out.println("Lựa chọn chức năng : \n" +
                    "1. Thêm mơi. \n" +
                    "2. Xóa. \n" +
                    "3. Hiển thị danh sách. \n" +
                    "4. Trở lại Menu chính.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    regularController.addRegular();
                    break;
                case 2:
                    regularController.deleteRegular();
                    break;
                case 3:
                    regularController.displayAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Vui lòng nhập đúng lựa chọn.");
            }
        } while(true);
    }

}
