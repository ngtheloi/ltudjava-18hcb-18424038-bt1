/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhsinh;

import java.util.Scanner;

/**
 *
 * @author nam
 */
public class HSCap3  extends HS{
    public double TiengAnh;
    public double Ly;
     @Override
    public void nhap()
    {
        super.nhap();
        System.out.println("Moi Nhap Ly:");
        Scanner d= new Scanner(System.in);
        this.Ly=d.nextDouble();
        System.out.println("Moi Nhap Tieng Anh:");
        Scanner e= new Scanner(System.in);
        this.TiengAnh=e.nextDouble();
        
        
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println(" Ly:"+this.Ly + " TA:"+this.TiengAnh);
    }
    public void xeploaiHS()
    {
        double dtb=(Toan+Van+Ly+TiengAnh)/4.0;
        xeploai(dtb);
    }
}
