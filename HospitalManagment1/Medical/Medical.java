package HospitalManagment1.Medical;

import java.util.Scanner;

import HospitalManagment1.Doctor.Hospital;

public class Medical implements Hospital{
    
    public String med_name;
    public String med_comp;
    public String exp_date;
    public int med_cost;
    public int count;
    public void newInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:-");
        med_name=sc.nextLine();
        System.out.println("Comp:-");
        med_comp=sc.nextLine();
        System.out.println("Exp_date:-");
        exp_date=sc.nextLine();
        System.out.println("cost:-");
        med_cost=sc.nextInt();
        System.out.println("No of count:-");
        count=sc.nextInt();
    }
    public void data(){
        System.out.println(med_name+"  \t"+med_comp+"    \t"+exp_date+"  \t" +med_cost);
    }
}
