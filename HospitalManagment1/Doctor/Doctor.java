package HospitalManagment1.Doctor;

import java.util.*;
public class Doctor implements Hospital{
    public static String did;
    public String Did;
    public String Dname;
    public String specilist;
    public String appoint;
    public String Quali;
    public int roomNo;
    public void newInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Id:-");
        Did=sc.nextLine();
        System.out.println("Name:-");
        Dname=sc.nextLine();
        System.out.println("Specialization:-");
        specilist=sc.nextLine();
        System.out.println("Time:-");
        appoint=sc.nextLine();
        System.out.println("Qualification:-");
        Quali=sc.nextLine();
        System.out.println("Room No:-");
        roomNo=sc.nextInt();

    }
   public  void data(){
        // System.out.println("Did \t"+ "Name     \t"+"specilist     \t"+"appointment     \t"+"qualificatrion      \t" +"Room No");
        System.out.println(Did+" \t"+Dname+"   \t"+specilist+"    \t"+appoint+"        \t"+Quali+"              \t"+roomNo);
    } 
}
    
