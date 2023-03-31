/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author dyahs
 */
public class Manager extends Employee{
    
    public void print () {
        System.out.println(
                "Name : "+name+"\n"
                +"Sex : "+sex+"\n"
                +"NIP : "+nip+"\n"
                +"Marital Status : "+marital_status+"\n"
                +"Jobdesk : "+jobdesk+"\n"
                +"Working Hours : "+workingHours+"\n"
                +"Salary : "+salary+"\n");
    }
    
    public void hitungGaji (){
        if (marital_status.equalsIgnoreCase("married")){
            bonus+=100000;
        } else {
            bonus+=0;
        }
        
        if (workingHours<8) {
            int hours = 8-workingHours;
            hours *= 50000;
            salary_cuts += hours;
        } else {
            salary_cuts+=0;
        }
    }
    
    public void gajiHitung () {
        salary+=bonus;
        salary-=salary_cuts;
    }
    
}
