package HospitalManagment1.Lab;

import java.util.Scanner;

import HospitalManagment1.Doctor.Hospital;

public class Lab implements Hospital{
        public static String fecility;
        public String facility;
        public int lab_cost;
        public void newInput(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Facility:-");
            facility=sc.nextLine();
            System.out.println("cost:-");
            lab_cost=sc.nextInt();

        }
        public void data(){
            System.out.println(facility+"\t\t"+lab_cost);
        }
    
}
