import java.util.Scanner;
class Bits{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=2,b=3;

System.out.println("Enter the specified digits : \n1)And Operation\n2)Or Operation\n3)Not Opearion\n4)XOR Operation");
int choice=sc.nextInt();

switch(choice){
case 1: 
System.out.println("Result : "+ (a & b));
break;
case 2: 
System.out.println("Result : "+ (a | b));
break;
case 3: 
System.out.println("Result : "+ (~ a));
break;
case 4: 
System.out.println("Result : "+ (a ^ b));
break;
default : 
System.out.println("error");
break;
}

}
}