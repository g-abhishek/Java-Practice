/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

import java.util.Scanner;

/**
 *
 * @author Abh!shek
 */
public class BreadthHeight {
    
    static boolean flag = true;
    static int B,H;
    
    
    
    static{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Breadth: ");
        B = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the value of Height: ");
        H = sc.nextInt();
        sc.close();
        try{
            if(B<=0 && H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }else{
                
                flag = true;
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }
    

    public static void main(String[] args){
		if(flag){
                    int area=B*H;
                    System.out.print(area);
		}
		
	}
    
}
