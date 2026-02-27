import java.util.*;
public class New{
public static void main(String[] args){
double passed=0;
double total=0;
double failed=0; 
Scanner sc = new Scanner(System.in);
while(true){
System.out.print("enter the marks:");
double marks=sc.nextDouble();
if(marks==-1){
System.out.println("exit!");
break;
}
if(marks>=40 && marks<60){
System.out.println("passed : D grade");
passed=passed+1;
}
else if(marks>=60 && marks<79){
System.out.println("passed : C grade");
passed=passed+1;
}
else if(marks>=79 && marks<89){
System.out.println("passed : B grade");
passed=passed+1;
}
else if(marks>=89 && marks<95){
System.out.println("passed : A grade");
passed=passed+1;
}
else if(marks>=95 && marks<=100){
System.out.println("passed : A+ grade");
passed=passed+1;
}
else{
System.out.println("failed : F grade");
failed=failed+1;
}
total=total+1;
}
System.out.println("total passed:"+passed);
System.out.println("total failed:"+failed);
System.out.println("total:"+total);
System.out.println("average:"+((passed/total)*100));
}
}
