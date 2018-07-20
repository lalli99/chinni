import java.util.*;
class TestPattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(“Enter the row limit”);
int limit=sc.nextInt();
System.out.println(“Pattern…………..!!”);
for(int i=limit+1;i>=1;i–){
for(int j=i;j<=limit+1;j++){
if(j==limit+1){
System.out.print("0");
}
else
System.out.print(j+" ");
}

System.out.print("\n");
}
}
}

