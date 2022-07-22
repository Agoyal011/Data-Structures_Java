package com.apnacollege;


class Pen
{
    String color;// attributes of the class
    String type; // ball-point pen;gel  pen

    public void write()// method of the class
    {
        System.out.println("writing something");
    }

    public void printColor()
    {

        System.out.println(this.color);
    }

}

class Student {

    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(String name,int age)// paramaterized constructor
    {
        this.name=name;
        this.age=age;

    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }


}

public class Main {

    public static void main ( String args[]){



        Pen pen1= new Pen ();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();

        pen1.printColor();

        Pen pen2= new Pen();
        pen2.color= "White";

        pen2.printColor();

        Student student1=new Student("Aniket",24);
        student1.printInfo();

    }


    }
