/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.java;

/**
 *
 * @author Abh!shek
 */
public class StackParanthesis {
    
    static void check(char str[], int n, char[] stack){
        int top = -1;
        for(int i=0; i<n; i++){
            if(str[i] == '('){
                top = top+1;
                stack[top] = '(';
                
            }
            if(str[i]==')' && stack[top] ==  '('){
                top = top-1;
            }
        }
        if(top == -1){
            System.out.println("bal");
        }else{
            System.out.println("unbal");
        }
    }
    
    public static void main(String[] args){
        char str[] = {'(', 'a', '+', '(', 'b', '-', 'c', ')', ')'};
        char stack[] = new char[15];
        check(str, str.length, stack);
        
    }
    
}
