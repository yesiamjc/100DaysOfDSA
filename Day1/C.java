// Reverse of an array

class Test{
Test(){
System.out.println("\t\t\t Reversing a array");
}

void swap(int[] arr, int a, int b){
int temp=arr[b];
arr[b]=arr[a];
arr[a]=temp;
}
}

class C{
public static void main(String[] args){
Test ob=new Test();

int[] arr={1,2,3,4,5};

for(int i=0;i<(arr.length/2);i++)
ob.swap(arr,i,(arr.length-1)-i);
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
}
}