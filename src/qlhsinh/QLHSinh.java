/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlhsinh;

import java.util.ArrayList;
import java.util.Scanner;
/*Quan ly 1 mang hs gồm 
HSCap 1(MaHS, TenHS, DiemToan, DiemVan)
HSCap 2(MaHS, TenHS, DiemToan, DiemVan,DiemLy)
HSCap 3(MaHS, TenHS, DiemToan, DiemVan,DiemTiengAnh)
Nhap va xuat 1 mang HS.
Xuat ra xep loai cua tung HS trong mang.*/
public class QLHSinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<HS> mang = new ArrayList();
        while (true) {
            System.out.println("Ban muon nhap gi 1. HSCap1 2. HSCap2 3. HSCap 3  4. ket thuc");
            Scanner a = new Scanner(System.in);
            int chon = a.nextInt();
            HS b = null;
            if (chon == 1) {
                b = new HSCap1();
            }
            if (chon == 2) {
                b = new HSCap2();
            }
            if (chon == 3) {
                 b = new HSCap3();
            }
            if (chon == 4) {
                break;
            }
            b.nhap();
            mang.add(b);

        }
        for(int i=0;i<mang.size();i++)
        {
            mang.get(i).xuat();
            mang.get(i).xeploaiHS();
        }
        
        
        
        
        
        
    }
    
}
