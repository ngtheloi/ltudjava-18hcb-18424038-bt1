//package file_handling;
package javaapplication1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Vudn
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass lop = new NewClass(); 
        Scanner scanner = new Scanner(System.in);
        int khoa2017 = 0;
        int khoa2018 = 0;
        int giaovu = 0 ;
        String username ;
        String MSSV;
        String username1;
        String password;
        System.out.println("    DANG NHAP\n");
        System.out.println("===================\n");
        
        while(true) {
            System.out.println("Tai khoan: \n");
            username1 = scanner.next();
            System.out.println("Mat khau: \n");
            password = scanner.next();        
            khoa2017 = lop.login(username1, password, "khoa2017.csv");
            khoa2018 = lop.login(username1, password, "khoa2018.csv");
            giaovu = lop.login(username1, password, "giaovu.csv");
            username = username1;
            if (khoa2017 == 1 || khoa2018 == 1 || giaovu == 1 ) {
                System.out.println("----Dang nhap thanh cong!----");
            } else {
                System.out.println("Tai khoan hoac mat khau khong dung!");
            }
        
            if (khoa2017 == 1 | khoa2018 == 1){
                while(true){
                    System.out.println("0: DANG XUAT.\n");
                    System.out.println("1: Xem diem mon Java.\n");
                    System.out.println("2: Xem diem mon KCPM.\n");
                    System.out.println("3: Xem mon MMT.\n");
                    System.out.println("4: Xem diem mon TKGD.\n");

                    int value = scanner.nextInt();
                    if (value==0) break;
                    switch (value) {
                    case 1:
                        lop.score(username,"diemJAVA.csv");
                        break;
                    case 2:
                        lop.score(username, "diemKCPM.csv");         
                        break;
                    case 3:
                        lop.score(username, "diemMMT.csv");         
                        break;
                    case 4:
                        lop.score(username, "diemTKGD.csv");          
                        break;
                    }
                }
            } else if (giaovu == 1 ) {
                while(true){
                    System.out.println("0: DANG XUAT.");
                    System.out.println("1: Import danh sach sinh vien khoa 2017.");
                    System.out.println("2: Import danh sach sinh vien khoa 2018.");
                    System.out.println("3: Xem diem mon cac mon.");
                    System.out.println("4: MSSV muon xoa.");
                    System.out.println("5: Sua diem SV.");
                    System.out.println("6: Them SV co lop.");
                    System.out.println("7: Tong ket mon hoc.");
                    System.out.println("8: Doi mat khau.");
                    System.out.println("9: Sanh sach  sinh vien.");
                    System.out.println("10: Thoi khoa bieu.");

                    int value = scanner.nextInt();
                    if (value == 0) break;
                    String fileinput;
                    switch (value) {
                    case 1:
                        fileinput = scanner.next();
                        lop.importFile(fileinput,"khoa2017.csv");
                        break;
                        
                    case 2:
                        fileinput = scanner.next();      
                        lop.importFile(fileinput, "khoa2018.csv"); 
                        break;

                    case 3:
                        System.out.println("Import bang diem //Moi ban nhap lop ma ban can xem diem theo thu tu sau: diemJAVA.csv, diemKCPM.csv, diemMMT.csv, diemTKGD.csv. ");
                        fileinput = scanner.next();
                        lop.showFile(fileinput);         
                        break;                  

                    case 4:
                        System.out.println("Moi ban nhap maso sinh vien de remove.");
                        MSSV = scanner.next();
                        System.out.println("Moi ban ten mon ma can remove theo ten danhsachJAVA.csv, danhsachKCPM.csv, danhsachMMT.csv, danhsachTKGD.csv.");
                        fileinput = scanner.next();
                        lop.removeStudent(MSSV,fileinput );         
                        break;
                        
                    case 5:
                        System.out.println("Moi ban nhap maso sinh vien de sua diem.");
                        MSSV = scanner.next();
                        System.out.println("Moi ban ten mon ma can sua diem theo ten diemJAVA.csv, diemKCPM.csv, diemMMT.csv, diemTKGD.csv.");
                        fileinput = scanner.next();
                        lop.changeScore(MSSV,fileinput );      
                        break;
                        
                    case 6:
                        System.out.println("Moi ban them sinh vien vao he thong vd:  khoa2018.csv hoac 2017.csv.");
                        String LOP = scanner.next();
                        lop.addStudent(LOP);     
                        break;
                        
                    case 7:
                        System.out.println("Tong ket theo mon - diemJAVA.csv, diemKCPM.csv, diemMMT.csv, diemTKGD.csv.");
                        String Mon = scanner.next();
                        lop.result(Mon);         
                        break; 
                        
                     case 8:
                        System.out.println("Doi mat khau.");
                        MSSV = scanner.next();
                        lop.changePassword(MSSV,"khoa2017.csv");
                        lop.changePassword(MSSV,"khoa2018.csv");
                        break;
                        
                    case 9:
                        System.out.println("Moi ban nhap ten khoa hoc+.csv.   vd: khoa2018.csv   \n hoac thoi khoa bieu vd: tkb2017.csv.");                     
                        String khoa = scanner.next(); 
                        lop.showFile(khoa);
                        break; 
                    }
                }
            }
        }  
    }
}


