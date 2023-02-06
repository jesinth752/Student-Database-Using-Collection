package org.example;

import java.util.*;
import java.util.logging.Logger;

 class StudentDetails
{
    private String name;
    private int age;

    private  double gpa;


    public String getName() {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    StudentDetails(String N,int A,Double G)
    {
        this.name=N;
        this.age=A;
        this.gpa=G;
    }
}


public class StudentTest extends Thread {
     public static final Logger log=Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        String n;
        int age;
        int k=0;
        double gradepoint;
        String rec;

        int records;

        Scanner input=new Scanner(System.in);

        ArrayList<StudentDetails> x = new ArrayList<StudentDetails>();
        log.info("ENTER NO OF RECORDS ");
        records=input.nextInt();
        try {
            for(int i=0;i<=5;i++) {
                Thread.sleep(1200);
                String calc="Creating database..."+k+"%";
                log.info(calc);
                k=k+20;
            }
        }
        catch (Exception E){
            log.info("Failed Try Again");
        }
        rec=records+" records created";
        log.info(rec);
        for(int i=1;i<=records;i++) {
            System.out.print("Enter Student Name :");
            n = input.next();
            System.out.print("Enter Age : ");
            age = input.nextInt();
            System.out.print("Enter GPA : ");
            gradepoint = input.nextDouble();

            StudentDetails sd=new StudentDetails(n,age,gradepoint);
            x.add(sd);


        }
        log.info("Uploading Student Details..");
        try {


            for (StudentDetails st : x) {
                Thread.sleep(1010);
                String p1=st.getName() + " " + st.getAge() + " " + st.getGpa();
                log.info(p1);

            }
        }
        catch (Exception e)
        {
            log.info("Failed Uploading Try Again");
        }

        Collections.sort(x, new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                return Double.compare(o2.getGpa(),o1.getGpa());
            }
        });
        log.info("Sorting Student Details..");
        try {


            for (StudentDetails st : x) {
                Thread.sleep(1010);
                String p2=st.getName() + " " + st.getAge() + " " + st.getGpa();
                log.info(p2);

            }
        }
        catch (Exception e)
        {
            log.info("Failed sorting Try again");
        }

    }
}