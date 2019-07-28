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
public class HS {
    public String Ma;
    public String Ten;
    public double Toan;
    public double Van;
    public void xuat()
    {
        System.out.print("MaHS:" + Ma + " TenHS:"+ Ten + " Toan:"+ Toan+ " Van:"+Van);
        
    }
    public void nhap()
    {
        System.out.println("Moi Nhap Ma:");
        Scanner a = new Scanner(System.in);
        this.Ma=a.nextLine();
        
        System.out.println("Moi Nhap ten:");
        Scanner b = new Scanner(System.in);
        this.Ten=b.nextLine();
        
        System.out.println("Moi Nhap Toan:");
        Scanner c = new Scanner(System.in);
        this.Toan=c.nextDouble();
        
        System.out.println("Moi Nhap Van:");
        Scanner d= new Scanner(System.in);
        this.Van=d.nextDouble();
        
        
    }
    public void xeploai(double  DTB)
    {
        if(DTB>=8)
            System.out.println("Gioi");
        if(DTB>=7 &&DTB<8)
            System.out.println("kha");
        if(DTB<7)
            System.out.println("TB Yeu");
    }
    public void xeploaiHS()
    {
        double dtb=(Toan + Van)/2.0;
        xeploai(dtb);
                
    }
    
            
}
