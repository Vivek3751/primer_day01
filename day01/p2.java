/* 2. Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments. */


class p2{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int perimeter=0;
perimeter=a+b+c;
System.out.println("Perimeter of triangle of given length "+a+" and breadth "+b+"height"+c+" is "+perimeter);
}
}

