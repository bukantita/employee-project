/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author dyahs
 */
public class NewMain {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manage = new Manager();
        OfficeBoy ob = new OfficeBoy();
        OJT ojt = new OJT();
        
        System.out.println("Data Karyawan PT. Maju Mundur 2023"+"\n"
                          +"__________________________________");
        
        boss.setnip(286);
        boss.setname("Elios Vortigern");
        boss.setsex("male");
        boss.setmarital_status("married");
        boss.setjobdesk("presedir");
        boss.setworkingHours(9);
        boss.hitungGaji();
        boss.gajiHitung();
        boss.print();
        
        manage.setnip(665);
        manage.setname("Mikaela Ryuu");
        manage.setsex("female");
        manage.setmarital_status("not married");
        manage.setjobdesk("general manager");
        manage.setworkingHours(8);
        manage.hitungGaji();
        manage.gajiHitung();
        manage.print();
        
        ob.setnip(529);
        ob.setname("Lee");
        ob.setsex("Non-binary");
        ob.setmarital_status("married");
        ob.setjobdesk("Office Boy");
        ob.setworkingHours(8);
        ob.hitungGaji();
        ob.gajiHitung();
        ob.print();
        
        ojt.setnip(912);
        ojt.setname("Wendy Mctory");
        ojt.setsex("female");
        ojt.setmarital_status("not married");
        ojt.setjobdesk("On the Job Training");
        ojt.setworkingHours(6);
        ojt.hitungGaji();
        ojt.gajiHitung();
        ojt.print();
    }
    
}
