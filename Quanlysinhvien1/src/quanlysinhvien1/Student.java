
package quanlysinhvien1;
import java.util.Scanner;
public class Student {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Student() {
    }

    public Student(String maSV, String hoTen, int tuoi,
                   double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap diem Toan: ");
        diemToan = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem Ly: ");
        diemLy = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem Hoa: ");
        diemHoa = Double.parseDouble(sc.nextLine());
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();

        if (dtb >= 8) {
            return "Gioi";
        } else if (dtb >= 6.5) {
            return "Kha";
        } else if (dtb >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    public void hienThiThongTin() {
        System.out.printf("%-12s %-20s %-6d %-8.2f %-8.2f %-8.2f %-8.2f %-15s%n",
                maSV, hoTen, tuoi, diemToan, diemLy, diemHoa,
                tinhDiemTrungBinh(), xepLoai());
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }
}
    
