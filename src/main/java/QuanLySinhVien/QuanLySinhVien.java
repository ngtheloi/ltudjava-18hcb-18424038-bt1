/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLySinhVien;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
 
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lua chon cua ban la: ");
        int luachon = scanner.nextInt();
        
        if (luachon == 11) {
            System.out.println("Hen gap lai (^_^)");
        }
    }
    
    public static void ChucNangSinhVien() throws FileNotFoundException, IOException {
        System.out.println("1. Xem diem theo mon hoc.");
        System.out.println("2. Doi mat khau.");
        System.out.println("3. DANG XUAT.");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lua chon cua ban la: ");
        int luachon = scanner.nextInt();
        
        if (luachon == 3) {
            System.out.println("Hen gap lai (^_^)");
        }
        // Đọc một file XSL.
       FileInputStream inputStream = new FileInputStream(new File("./TKB.xlsx"));
  
       // Đối tượng workbook cho file XSL.
       HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
 
  
       // Lấy ra sheet đầu tiên từ workbook
       HSSFSheet sheet = workbook.getSheetAt(0);
 
  
       // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
       Iterator<Row> rowIterator = sheet.iterator();
 
       while (rowIterator.hasNext()) {
           Row row = rowIterator.next();
     
           // Lấy Iterator cho tất cả các cell của dòng hiện tại.
           Iterator<Cell> cellIterator = row.cellIterator();
 
           while (cellIterator.hasNext()) {
               Cell cell = cellIterator.next();
  
               // Đổi thành getCellType() nếu sử dụng POI 4.x
               CellType cellType = cell.getCellTypeEnum();
 
               switch (cellType) {
               case _NONE:
                   System.out.print("");
                   System.out.print("\t");
                   break;
               case BOOLEAN:
                   System.out.print(cell.getBooleanCellValue());
                   System.out.print("\t");
                   break;
               case BLANK:
                   System.out.print("");
                   System.out.print("\t");
                   break;
               case FORMULA:
       
                   // Công thức
                   System.out.print(cell.getCellFormula());
                   System.out.print("\t");
                    
                   FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
         
                   // In ra giá trị từ công thức
                   System.out.print(evaluator.evaluate(cell).getNumberValue());
                   break;
               case NUMERIC:
                   System.out.print(cell.getNumericCellValue());
                   System.out.print("\t");
                   break;
               case STRING:
                   System.out.print(cell.getStringCellValue());
                   System.out.print("\t");
                   break;
               case ERROR:
                   System.out.print("!");
                   System.out.print("\t");
                   break;
               }
 
           }
           System.out.println("");
       }
    }
}
