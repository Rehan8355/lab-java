

package HospitalManagment1.Staff;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

import HospitalManagment1.Doctor.Hospital;

public class Staff implements Hospital{
    public String Sid;
    public String Sname;
    public String Desg;
    public String sex;
    public int salary;
    public void newInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Id:-");
        Sid=sc.nextLine();
        System.out.println("Name:-");
        Sname=sc.nextLine();
        System.out.println("Desigination:-");
        Desg=sc.nextLine();
        System.out.println("Sex:-");
        sex=sc.nextLine();
        System.out.println("Salary:-");
        salary=sc.nextInt();

    }
    public void data(){
        System.out.println(Sid+"\t"+Sname+"\t"+Desg+"\t"+sex+"\t"+salary);
        
    }
}
