import java.util.ArrayList;
import java.util.Scanner;

class Test{
Test(){
System.out.println("\t\t\t Configuring an ArrayList");
}

void addElements(ArrayList<Integer> al){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your element : ");
int element=sc.nextInt();
al.add(element);
}
}

class B{
public static void main(String[] args){
Test ob=new Test();
Scanner sc1=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<>();
System.out.println("Enter how many element do you want to have in your ArrayList : ");
int size=sc1.nextInt();
while(al.size()<size)
ob.addElements(al);
System.out.println("Your elements are : ");
System.out.println(al);
}
}