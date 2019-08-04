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
        int khoa2018 =0;
        int giaovu =0 ;
        String username ;
        String MSSV;
        String username1;
        String password;
        System.out.println("Moi ban dang nhap\n");
        
        while(true)
        {
            System.out.println("Moi ban nhap user name");
            System.out.println("Username:\n");
            username1 = scanner.next();
            System.out.println("Moi ban nhap mat khau\n");
            System.out.println("Password:\n");
            password = scanner.next();        
            khoa2017 =lop.login(username1, password, "khoa2017.csv");
            khoa2018 = lop.login(username1, password, "khoa2018.csv");
            giaovu = lop.login(username1, password, "giaovu.csv");
            username = username1;
            if (khoa2017==1 || khoa2018==1 || giaovu== 1 ){
                System.out.println("dang nhap thanh cong");
                
            }
            else {
                System.out.println("ban da nhap sai username hoac password");
            }
        
        
        if(khoa2017 ==1 | khoa2018 ==1){
            while(true){
                System.out.println("moi ban nhap tinh nang\n");
                System.out.println("0: de dang xuat\n");
                System.out.println("1: xem danh diem mon Java\n");
                System.out.println("2: xem danh sach diem mon KCPM\n");
                System.out.println("3: xem danh diem mon MMT\n");
                System.out.println("4: xem danh diem mon TKGD\n");
                
                
                int value = scanner.nextInt();
                if (value==0) break;
                switch (value) {
                case 1:
                lop.showinfor(username,"diemJAVA.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 2:
                lop.showinfor(username, "diemKCPM.csv");         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 3:
                lop.showinfor(username, "diemMMT.csv");         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 4:
                lop.showinfor(username, "diemTKGD.csv");         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                }
            
            }
        }
        
        
        
        
        
        
        
        if(giaovu == 1 ){
            while(true){
                System.out.println("moi ban nhap tinh nang\n");
                System.out.println("0: an 0 de dang xuat");
                System.out.println("1: import danh sach sinh vien khoa 2017");
                System.out.println("2: import danh sach sinh vien khoa 2018");
                System.out.println("3: xem diem mon cac mon");
                System.out.println("4: nhap ma so sinh vien de remove khoi mon nao do");
                System.out.println("5: Sua diem sinh vien theo ma so va mon hoc");
                System.out.println("6: Them sinh vien vao danh sach lop");
                System.out.println("7: Tong ket mon hoc");
                System.out.println("8: Doi mat khau");
                System.out.println("9: danh sach  sinh vien");
		System.out.println("10: bieu dien thoi khoa bieu 2 khoa");
                              
                
                
                int value = scanner.nextInt();
                if (value==0) break;
                String fileinput;
                switch (value) {
                case 1:
                fileinput = scanner.next();
                    lop.importfile( fileinput,"khoa2017.csv");
                        //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                    break;
                case 2:
                fileinput = scanner.next();
                        //lop.showinfor(username, "danhsachKCPM.csv");         
                    lop.importfile(fileinput, "khoa2018.csv"); 
                    break;

                case 3:
                    System.out.println("Import bang diem //Moi ban nhap lop ma ban can xem diem theo thu tu sau: diemJAVA.csv, diemKCPM.csv, diemMMT.csv, diemTKGD.csv ");
                    fileinput = scanner.next();
                    lop.showfile(fileinput);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                  
                    
                case 4:
                    System.out.println("moi ban nhap maso sinh vien de remove");
                    
                    MSSV = scanner.next();
                    System.out.println("moi ban ten mon ma can remove theo ten danhsachJAVA.csv, danhsachKCPM.csv, danhsachMMT.csv, danhsachTKGD.csv");
                    fileinput = scanner.next();
                    lop.remove(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 5:
                    System.out.println("moi ban nhap maso sinh vien de sua diem");
                    
                     MSSV = scanner.next();
                    System.out.println("moi ban ten mon ma can sua diem theo ten diemJAVA.csv, diemKCPM.csv, diemMMT.csv, diemTKGD.csv");
                    fileinput = scanner.next();
                    lop.change(MSSV,fileinput );         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;
                case 6:
                    System.out.println("Moi ban them sinh vien vao he thong vd:  khoa2018.csv hoac 2017.csv");
                    
                    String LOP = scanner.next();
                  
                    lop.add(LOP);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;                   
                case 7:
                    System.out.println("tong ket theo mon - diemJAVA.csv, diemKCPM.csv, diemMMT.csv, diemTKGD.csv ");
                    
                    String Mon = scanner.next();
                  
                    lop.result(Mon);         
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break;  
                 case 8:
                    System.out.println("Doi mat khau khoa 2017 hoac 2018");
                     
                     MSSV = scanner.next();
                  
                    lop.changePassword(MSSV,"khoa2017.csv");
                    lop.changePassword(MSSV,"khoa2018.csv");
                //lop.importfile("importkhoa2017.csv", "khoa2017.csv"); 
                break; 
                    
                
                case 9:
                    System.out.println("moi ban nhap ten khoa hoc+.csv.   vd: khoa2018.csv   \n hoac thoi khoa bieu vd: tkb2017.csv ");                     
                    String khoa = scanner.next(); 
                    lop.showfile(khoa);

                break; 
                    
                }


                    
               
            }
        }
        }   
        
        
        
        
        
    }
}


