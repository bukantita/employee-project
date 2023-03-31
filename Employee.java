/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author dyahs
 */
public class Employee {

    int nip;
    String name;
    String sex;
    String marital_status;
    String jobdesk;
    double salary = 4000000;
    int workingHours;
    double bonus;
    double salary_cuts = 50000*workingHours;
    
    public void setnip (int nip) {
        this.nip=nip;
    }
    
    public int getnip () {
        return nip;
    }
    
    public void setname (String name) {
        this.name=name;
    }
    
    public String getname () {
        return name;
    }
    
    public void setsex (String sex) {
        this.sex=sex;
    }
    
    public String getsex () {
        return sex;
    }
    
    public void setmarital_status (String marital_status) {
        this.marital_status=marital_status;
    }
    
    public String marital_status () {
        return marital_status;
    }
    
    public void setjobdesk (String jobdesk) {
        this.jobdesk=jobdesk;
    }
    
    public String getjobdesk () {
        return jobdesk;
    }
    
    public void setworkingHours (int workingHours) {
        this.workingHours=workingHours;
    }
    
    public int getworkingHours () {
        return workingHours;
    }
    
    
}
