/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc31b;

import java.util.Scanner;
public class CC31B {
    static double mean (double[] a){
        double sum = 0;
        for (int i=0;i<a.length;i++){
            sum += a [i];
        }
        System.out.println("sum = " + sum);
        return sum/a.length;
    }
    static double mode(double a[]){
        double maxValue = 0;
        double maxCount =0;
        for (int i=0;i<a.length; i++){
            int count = 0;
            for (int j=0;j<a.length; j++){
                if (a[j] == a [i]) ++count;
            }
            if (count > maxCount){
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args){
      //TODO code application logic here  
    Scanner X = new Scanner(System.in);
    System.out.print("Enter size of array = ");
    int ed = X.nextInt();
    double list[] = new double[ed];
    int i,num = 0;
    String input = " ";
    
//    for (1=0; i<sz;  i++) {
//         list [i] =0;
//    }
    for (i=0; i<ed; i++){
        System.out.print("Input value for list [" + i +"] = ");
        list[i] = X.nextInt();
    }
    
        System.out.println("Mean is;" +mean(list));
        System.out.println("Mode is; " + mode(list));
    
    }
    
}
