
package quanlysinhvien1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> danhSach = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n========== QUAN LY SINH VIEN ==========");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap sinh vien thu " + (i + 1));
                        Student sv = new Student();
                        sv.nhapThongTin(sc);
                        danhSach.add(sv);
                    }
                    break;

                case 2:
                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sach sinh vien rong!");
                    } else {
                        System.out.println("\n========== DANH SACH SINH VIEN ==========");
                        System.out.printf("%-12s %-20s %-6s %-8s %-8s %-8s %-8s %-15s%n",
                                "Ma SV", "Ho Ten", "Tuoi",
                                "Toan", "Ly", "Hoa", "DTB", "Xep loai");

                        for (Student sv : danhSach) {
                            sv.hienThiThongTin();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String ma = sc.nextLine();

                    boolean timThay = false;

                    for (Student sv : danhSach) {
                        if (sv.getMaSV().equalsIgnoreCase(ma)) {
                            System.out.println("Tim thay sinh vien:");
                            sv.hienThiThongTin();
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sinh vien!");
                    }
                    break;

                case 4:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 4);

        sc.close();
    }
}


