/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculator_walaa;
import  java.util.Scanner;
/**
 *
 * @author Student
 */
public class SalaryCalculator_Walaa {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int workingHours=0;
 int BasicSalary=36*15;
 double overallSalary=0;
 int additionalHours1=0;
 int additionalHours2=0;
 double Extra1=0;
 double Extra2=0;
 int rate=15;
     //object take input from user   
        Scanner input=new Scanner(System.in);
        
        System.out.println("please enter you working Hours:");
        try{
        workingHours=input.nextInt();}
        catch(Exception e){System.out.println("fix the erorr");}
        if(workingHours<=36)
        {
        overallSalary=rate*workingHours;
        }
        else
        {
        additionalHours1=workingHours-36;
        if(additionalHours1<=5)
        {
        Extra1=additionalHours1* 1.5 *rate;
        overallSalary=BasicSalary+Extra1;
        }
        else
        {
        additionalHours2=additionalHours1-5;
        Extra2=additionalHours2*2*rate;
        Extra1=5 *1.5 *rate;
        overallSalary=BasicSalary+Extra1+Extra2;
        
        }
        }
        System.out.println(overallSalary);
    } 
}
