package com.company.A6_0_0pps;
/*
class Student {//student is class
    int id;
    String name;
    static String college="DC";

//constructor have same name as class do not have return type

    Student(){
//Default Constructor so whenever we call new function we are call this constructor
        System.out.println("New Student is added");
    }

    static void change(){
        college="MVP";
        System.out.println(college);
    }


//    Student(int i,String  n){//Parameterized Constructor
//        id=i;
//        name=n;
//
//    }

    Student(int id,String name){
        //if the parameter are same we can use
        // this keyword to refer immediate parent variables
        //this method cant be used in a static method because you dont call any instance in stactic
        this.id=id;
        this.name=name;
    }

    void addid(int idno){
        id=idno;
        this.DisplayId();
    }

    void DisplayId(){//Method id

        System.out.println(id+" ");

    }

    void DisplayName(){//Method name

        System.out.println(name+" ");
    }

    void DisplayCollage(){//Method college
        System.out.println(college+" ");
    }

    void addName(String names){
        name=names;
    }


    public static void main(String[] args) {

//        Student s1=new Student();//S1 is object
//        Student s2=new Student();
//        s2.id=3;
//        s2.name="Abc";
//
//
//        s1.id=2;
//        s1.name="Mohit";
//
//        System.out.print(s2.id+" ");
//        System.out.print(s2.name);
//        System.out.println();
//        System.out.print(s1.id+" ");
//        System.out.println(s1.name);
//        System.out.print("");
//
//        s1.DisplayId();//calling the Methods
//        s1.DisplayName();//calling the Methods
//

        Student s1= new Student(2,"Mohit");
        Student s2=new Student(5,"Mohit2");

        s1.DisplayId();
        s2.DisplayName();
        s1.change();

    }
}

 */ //class ,object, method,constructors

//you can do inheritance and polymorphism on your own we will take look at encapsulation


/*
class Bike2{
    void run(){
        System.out.println("running");
    }
}
class Honada extends Bike2{
    void run(){
        System.out.println("Running Honda");
    }

    public static void main(String[] args) {
        Bike2 bike=new Honada();
        bike.run();//Running honda
        Bike2 b=new Bike2();
        b.run(); //rinning

    }
}

 */
//upcasting : if the reference variable of variable of
//            parent class refers to the object int child class,it is known as upcasting