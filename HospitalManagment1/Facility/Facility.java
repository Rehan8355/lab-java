package HospitalManagment1.Facility;

import java.util.Scanner;

import HospitalManagment1.Doctor.Hospital;

public class Facility implements Hospital {
   public String fec_name;
    public void newInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Facility:-");
        fec_name=sc.nextLine();

    }
    public void data()
    {
        System.out.println(fec_name);
    }

}
