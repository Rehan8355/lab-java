package HospitalManagment1.Patient;

import java.util.*;

import javax.sound.sampled.SourceDataLine;
interface Hospital{
    void newInput();
    void data();
}

public class Patient implements Hospital {
    public String pid;
    public String pName;
    public String pDisease;
    public String sex;
    public String admit_status;
    public int age;
    public void newInput(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Id:-");
    pid=sc.nextLine();
    System.out.println("Name:-");
    pName=sc.nextLine();
    System.out.println("Diseae:-");
    pDisease=sc.nextLine();
    System.out.println("Sex:-");
    sex=sc.nextLine();
    System.out.println("Admit Status:-");
    admit_status=sc.nextLine();
    System.out.println("Age:-");
    age=sc.nextInt();
    }
    public void data(){
        System.out.println(pid+"\t"+pName+"\t"+pDisease+"\t"+sex+"\t"+admit_status+"\t"+age);
    }
}
