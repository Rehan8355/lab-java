package HospitalManagment1.Main;

import java.util.Calendar;
import java.util.Scanner;

import HospitalManagment1.Lab.Lab;
import HospitalManagment1.Medical.Medical;
import HospitalManagment1.Patient.Patient;
import HospitalManagment1.Staff.Staff;
import HospitalManagment1.Doctor.Doctor;
import HospitalManagment1.Facility.Facility;

public class HospitalManagmente {
    public static void main(String args[])
    {
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 6;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            * Welcome to Hospital Management System Project in Java *");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        Doctor[] d = new Doctor[25];
        Patient[] p = new Patient[100];
        Lab[] l = new Lab[20];
        Facility[] f = new Facility[20];
        Medical[] m = new Medical[100];
        Staff[] s = new Staff[100];
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new Doctor();
        for (i = 0; i < 100; i++)
            p[i] = new Patient();
        for (i = 0; i < 20; i++)
            l[i] = new Lab();
        for (i = 0; i < 20; i++)
            f[i] = new Facility();
        for (i = 0; i < 100; i++)
            m[i] = new Medical();
        for (i = 0; i < 100; i++)
            s[i] = new Staff();

        d[0].Did = "21";
        d[0].Dname = "Dr.Ghanendra";
        d[0].specilist = "ENT        ";
        d[0].appoint = "5-11AM";
        d[0].Quali = "MBBS,MD";
        d[0].roomNo = 17;
        Doctor.did = "32";
        d[1].Dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].Quali = "MBBS,MD";
        d[1].roomNo = 45;
        d[2].Did = "17";
        d[2].Dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].Quali = "BDM";
        d[2].roomNo = 8;
        d[3].Did = "33";
        d[3].Dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].Quali = "MBBS,MS";
        d[3].roomNo = 40;

        p[0].pid = "12";
        p[0].pName = "Pankaj";
        p[0].pDisease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pName = "Sumit";
        p[1].pDisease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pName = "Alok";
        p[2].pDisease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pName = "Ravi";
        p[3].pDisease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].facility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fec_name = "Ambulance";
        f[1].fec_name = "Admit Facility ";
        f[2].fec_name = "Canteen";
        f[3].fec_name = "Emergency";

        s[0].Sid = "22";
        s[0].Sname = "Prakash";
        s[0].Desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[1].Sid = "23";
        s[1].Sname = "Komal";
        s[1].Desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[2].Sid = "24";
        s[2].Sname = "Raju";
        s[2].Desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[3].Sid = "25";
        s[3].Sname = "Rani";
        s[3].Desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
        s[4].Sid = "26";
        s[4].Sname = "Rakesh";
        s[4].Desg = "Security";
        s[4].sex = "Male";
        s[4].salary = 5000;
        s[5].Sid = "27";
        s[5].Sname = "Rohan ";
        s[5].Desg = "Security";
        s[5].sex = "Male";
        s[5].salary = 5000;
        s[6].Sid = "28";
        s[6].Sname = "Suraish";
        s[6].Desg = "Security";
        s[6].sex = "Male";
        s[6].salary = 5000;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                               *DOCTOR SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].newInput();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t   |   Specilist |\tTiming \t | Qualification  |  \tRoom No.");
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].data();
                                        }
                                        System.out.println("-----------------------------------------------------------------------------------");
                                        break;
                                        
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                                   *PATIENT SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].newInput();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].newInput();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                               *MEDICINE SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].newInput();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name |\t Company |\t Expiry Date |\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            m[j].data();
                                        }
                                        System.out.println("---------------------------------------------------------------------------------");
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                              *LABORATORY SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l[count4].newInput();count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Fecilities\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++) {
                                            l[j].data();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                case 5:
                    {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("          *HOSPITAL FACILITY SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1)
                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        f[count5].newInput();count5++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count5; j++) {
                                            f[j].data();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }
                case 6:
                    {
                        s6 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                              *STAFF SECTION*");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s6 == 1)
                        {
                            String a = "Nurse", b = "Worker", c = "Security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count6].newInput();count6++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                            if (a.equals(s[j].Desg))
                                                s[j].data();
                                        }
                                        break;
                                    }
                                case 3:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                            if (b.equals(s[j].Desg))
                                                s[j].data();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                            if (c.equals(s[j].Desg))
                                                s[j].data();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}