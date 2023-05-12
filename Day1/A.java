// Configuring an Array 

import java.util.Scanner;

class Test{
Test(){
System.out.println("\t\t\t Configuring an Array");
}
void inputArray(int size){
int[] arr=new int[size];
System.out.println();
System.out.println("Enter the elements of the array : ");
Scanner sc1=new Scanner(System.in);
for(int i=0;i<size;i++)
arr[i]=sc1.nextInt();
System.out.println("Elements of the array are : ");
printArray(arr,size);
}

void printArray(int[] arr,int size){
for(int i=0;i<size;i++)
System.out.print(arr[i]+" ");
System.out.println();
}
}

class A{
public static void main(String[] args){
Test ob=new Test();
Scanner sc=new Scanner(System.in);

System.out.print("Enter the size of your array : ");
int size=sc.nextInt();
ob.inputArray(size);
}
}