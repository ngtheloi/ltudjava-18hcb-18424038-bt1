/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Nguyen The Loi
 */
public class QuanLySinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dang_Nhap();
    }
    
    public static void Dang_Nhap() {
        System.out.println("    DANG NHAP");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tai khoan: ");
        String taikhoan = scanner.nextLine();
        
        System.out.println("Mat khau: ");
        String matkhau = scanner.nextLine();
        
        if (taikhoan.matches("[0-9]+") && taikhoan.length() > 2) {
            ChucNangSinhVien();
        } else if (taikhoan.equals("giaovu")) {
            ChucNangGiaoVu();
        } else {
            System.out.println("Tai khoan hoac mat khau bi sai! Vui long dang nhap lai.");
        }
    }
    
    public static void ChucNangGiaoVu() {
        System.out.println("1. Import danh sach lop.");
        System.out.println("2. Them sinh vien.");
        System.out.println("3. Import thoi khoa bieu.");
        System.out.println("4. Khong hieu dung chon.");
        System.out.println("5. Xem danh sach lop.");
        System.out.println("6. Xem thoi khoa bieu.");
        System.out.println("7. Import bang diem.");
        System.out.println("8. Xem bang diem.");
        System.out.println("9. Sua diem sinh vien.");
        System.out.println("10. Doi mat khau.");
        System.out.println("11. DANG XUAT.");
    }
    
    public static void ChucNangSinhVien() {
        System.out.println("1. Xem diem theo mon hoc.");
        System.out.println("2. Doi mat khau.");
        System.out.println("3. DANG XUAT.");
    }
}
