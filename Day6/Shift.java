import java.util.Scanner;
class Shift{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=5,times=2;

System.out.println("Enter your choice : \n1) Left Shift\n2) Right Shift ");
int choice=sc.nextInt();

switch(choice){
case 1:
System.out.println("Result : "+ (number << times));
break;
case 2:
System.out.println("Result : "+ (number >> times));
break;
default :
System.out.println("Error Occoured !!!");
break;
}
}
}