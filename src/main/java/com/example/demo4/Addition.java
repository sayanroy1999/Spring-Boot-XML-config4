package com.example.demo4;

public class Addition {
    private int a;
    private int b;

    //So when IOC calls, it checks 2 things- As v r entering the values in string,
    //and if string constructor is present, then it takes the string values
    //If not present, then it takes the order, that is, it first takes the double, then integer.

    public Addition(double a, double b)
    {
        this.a=(int)a;
        this.b=(int) b;
        System.out.println("Constructor: double, double");
    }

    public Addition(int a, int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Constructor: int, int");
    }

    public Addition(String a, String b)
    {
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("Constructor: String, String");
    }

}
