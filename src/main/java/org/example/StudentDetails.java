package org.example;

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

    StudentDetails(String n,int a,Double g)
    {
        this.name=n;
        this.age=a;
        this.gpa=g;
    }
}