package project;
import java.util.Scanner;
public class Final {
  String name;
  String phonenumber;
  long amount;
  void Add(){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the name of the customer");
  name = scan.next();
  System.out.println("Enter the contact number of the customer");
  phonenumber = scan.next();
  System.out.println("Enter the amount deposited by the customer");
  amount = scan.nextInt();
  System.out.println("Record Successfully Added");
  System.out.println();
	 }

static void Display(Final f[],int N){
   for(int i=0;i<N;i++){
	  System.out.println("The name of the person is "+f[i].name);
   System.out.println("The contact number of the person is "+f[i].phonenumber);
   System.out.println("The amount in the account of the person is "+f[i].amount);
   }
  }

  void search(Final f[],int N)
  {
    String ph;
    int i,j;
     boolean a=false;
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the Phone no. you want to search");
     ph=obj.next();
	for(i=0;i<N;i++)
	{j=ph.compareTo(f[i].phonenumber);
	if(j==0)
	{       a=true;
			break;
	} 
	}
 	
	if(a==false)
	System.out.println("Record not found");
	else
	{
		System.out.println("RECORD FOUND SUCCESSFULLY");
		System.out.println("Name :"+f[i].name);
  		System.out.println("Mobile no."+f[i].phonenumber);
	}
	
	}	
