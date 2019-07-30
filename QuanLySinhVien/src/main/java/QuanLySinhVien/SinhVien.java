/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLySinhVien;

/**
 *
 * @author Nguyen The Loi
 */
public class SinhVien {
    public String MSSV;
    public String HoTen;
    public String GioiTinh;
    public int CMND;
    
    public void xuat() {
        System.out.print("MSSV:" + MSSV + " Ho Ten:"+ HoTen + " Gioi Sinh:"+ GioiTinh+ " CMND:"+CMND);
    }
}
