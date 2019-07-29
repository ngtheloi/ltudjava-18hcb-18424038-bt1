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
        SignIn_Screen();
    }
    
    public static void SignIn_Screen() {
        System.out.println("    DANG NHAP");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tai khoan: ");
        String taikhoan = scanner.nextLine();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Mat khau: ");
        String matkhau = scan.nextLine();
    }
}
