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
	  void update(Final f[],int N)
    {
	 String num;
	int i;
	int flag=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the no.to be modified");
	num=obj.next();
	for(i=0;i<N;i++)
	{
	if(num.equals(f[i].phonenumber))
	{ 
	 System.out.println("Enter the name of the person");
	 f[i].name=obj.next();
	 System.out.println("Enter the phone no.");
     f[i].phonenumber=obj.next();
	 System.out.println("Enter the amount of the bill");
	 f[i].amount=obj.nextInt();
	 flag=1;
	 break;
	 }
	}
				if(flag==0)
					System.out.println("Record not found");
				else
					System.out.println("Record succesfully added");		  
	 
}

	void pay(Final f[],int N)
	{
	 int amt,flag=0,i;
	 String ph;
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the phone no. whose bill is to be paid");
	 ph=obj.next();
	 System.out.println("Enter the amount you are going to pay");
	 amt=obj.nextInt();
	 for(i=0;i<N;i++)
	 {
	 if(ph.equals(f[i].phonenumber))
	 {
	 f[i].amount-=amt;
	 flag=1;
	 break;
	 }
	 }
	 if(flag==0)
	System.out.println("Record not found");
	else
	{
		if(amt<f[i].amount)
		System.out.println("You have paid"+f[i].amount+"less than the actual amount to be paid\n The remaining amount will be added in your new bill");
		else
		System.out.println("Amount paid successfully");
		}
	}