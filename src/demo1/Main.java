
package demo1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        String students[] = new String[5];
        Scanner sc = new Scanner(System.in);
        
        for(int j = 0; j < students.length; j++)
        {
            System.out.println("Enter" +students[j] + "name :");
            students[j] = sc.nextLine();
            
        }
        
        for(int i = 0; i < students.length; i++)
        {
            System.out.println("Student names is" +students[i]);
        }
    }
    
}
