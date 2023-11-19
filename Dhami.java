import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class Dhami
{
String name,id,age,add,cno;
public void entry()
{
System.out.println("\t\t\t\t\t\t\t\tDHAMI NURSING HOME\n============================================================================================================================================================");
Scanner in = new Scanner (System.in);
System.out.println("\n\t\t\t\t\t\t\t-------New Patient Entry-------\n");
System.out.print("\t\t\t\t\t\t\tEnter Patient's Id  = ");
id=in.next();
System.out.print("\t\t\t\t\t\t\tEnter Patient's Name = ");
name=in.next();
System.out.print("\t\t\t\t\t\t\tEnter Patient's Age  = ");
age=in.next();
System.out.print("\t\t\t\t\t\t\tEnter Patient's Address = ");
add=in.next();
System.out.print("\t\t\t\t\t\t\tEnter Patient's Contact No. = ");
cno=in.next();
}
public void save()
{
	try
	{
		FileWriter W= new FileWriter("Dhamidata.text",true);		
		String Record=id+"  "+name+"  "+age+"  "+add+"  "+cno;
		W.write(Record);
		W.write(System.lineSeparator());
		W.close();
	}
	catch(IOException X)
	{
		System.out.println("Error in data saving");
	}
	}
public void Patientslip()
{

System.out.println("\n\t\t\t\t\t\t\t\tDHAMI NURSING HOME\t\t");
System.out.println("\n\t\t\t\tSno.\t     :______ \n\t\t\t\tPatient Name :______"
+"\t\t\t\tId       :______"
+"\n\t\t\t\tDr.Name      :______\t\t\t\tDiagnose :______\n\t\t\t\t============="+
"==============================================================="+
"\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|"+
"\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t\t\t|\n\t\t\t\t============="+
"===============================================================");      
}	
public void Showall()
{
	String d;
	Scanner in= new Scanner(System.in);
	System.out.println("\t\t\t\t\t\t\t\tPatient list"+"\n============================================================================================================================================================"+
	"\n\t\tId "+"\t\tName"+"\t\t\tAge "+"\t\t\tAddress"+"\t\t\t\t\tContact No."+
	"\n===========================================================================================================================================================");
	try
	{
		int recount=0;
		int count=0;
		FileReader R= new FileReader("Dhamidata.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			
			count=count+1;
			String []Parts = d.split("  ");
			if(recount<15)
			{
				
				recount=recount+1;
				
System.out.printf(count+"\t\t%-7s\t\t%-15s\t\t%-3s\t\t\t%-20s\t\t\t%-10s",Parts[0],Parts[1],Parts[2],Parts[3],Parts[4]);
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");		
			}
else
{	
    System.out.println("Enter any input to continue");
    in.next();
System.out.println("\033[H\033[2J");
System.out.println("\t\t\t\t\t\t\t\tPatient list"+"\n============================================================================================================================================================"+
	"\n\t\tId "+"\t\tName"+"\t\t\tAge "+"\t\t\tAddress"+"\t\t\t\t\tContact No."+
	"\n===========================================================================================================================================================");
System.out.printf(count+"\t\t%-7s\t\t%-15s\t\t%-3s\t\t\t%-20s\t\t\t%-10s",Parts[0],Parts[1],Parts[2],Parts[3],Parts[4]);
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");		
recount=0;
}	
}
Br.close();
	}
catch(IOException X)
	{
		System.out.println("Error");
	}
}

public void Modify()
{	
String ano;
Scanner in= new Scanner(System.in);
System.out.print("\n\n\t\t\t\t\t\t\t\tEnter Patient Id = ");
ano=in.next();

	String d;
	String Name,Id,Age,Add,Con;
	try
	{
		int f=0;
		int recount=0;
		int count=0;
		String Record;
		ArrayList<String> RecordList = new ArrayList<>();
		FileReader R= new FileReader("Dhamidata.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			count=count+1;
			String []Parts = d.split("  ");
			if(ano.equals(Parts[0]))
			{f=1;
		
				System.out.print("\n\n\t\t\t\t\t\t\t\t-------ID FOUND-------\n\n\n");
				System.out.println("\t\t\t\t\t\t\t\tPatient list"+"\n============================================================================================================================================================"+
	"\n\t\tId "+"\t\tName"+"\t\t\tAge "+"\t\t\tAddress"+"\t\t\t\t\tContact No."+
	"\n===========================================================================================================================================================");
	System.out.printf(count+"\t\t%-7s\t\t%-15s\t\t%-3s\t\t\t%-20s\t\t\t%-10s",Parts[0],Parts[1],Parts[2],Parts[3],Parts[4]);
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");		
            System.out.print("\n\n\t\t\t\t\t\t\t\t-----ENTER NEW DATA-----\n\n\n");
			System.out.print("\t\t\t\t\t\t\t\tEnter ID : ");
			Id=in.next();
			System.out.print("\t\t\t\t\t\t\t\tEnter Name : ");
			Name=in.next();
			System.out.print("\t\t\t\t\t\t\t\tEnter Age : ");
			Age=in.next();
			System.out.print("\t\t\t\t\t\t\t\tEnter Address : ");
			Add=in.next();
			System.out.print("\t\t\t\t\t\t\t\tEnter Contact : ");
			Con=in.next();
			
		   Record=Id+"  "+Name+"  "+Age+"  "+Add+"  "+Con;
		   RecordList.add(Record);
			
		FileWriter w = new FileWriter ("Dhamidata.text");
		BufferedWriter Bw = new BufferedWriter(w);
		for(String  line : RecordList)
			{
				Bw.write(line);
				Bw.newLine();
			}
			Bw.close();	
			break;
			}
			else{
			
System.out.print("\n\n\t\t\t\t\t\t\t\t---------NOT FOUND----------");
}
}
Br.close();
}
catch(IOException X)
	{
		System.out.println("Error");
	}
}
public void Delete()
{
	String ano;
Scanner in= new Scanner(System.in);
System.out.print("\n\n\t\t\t\t\t\t\t\tEnter Patient Id To Delete = ");
ano=in.next();

	String d;
	String Name,Id,Add,Con;
	try
	{int f=0;
		int recount=0;
		int count=0;
		String Record;
		ArrayList<String> RecordList = new ArrayList<>();
		FileReader R= new FileReader("Dhamidata.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			String []Parts = d.split("  ");
			count=count+1;
			if(ano.equals(Parts[1]))
			{f=1;
		
				System.out.print("\n\n\t\t\t\t\t\t\t\t-------Id Found-------\n\n\n");
				System.out.println("\t\t\t\t\t\t\t\tPatient list"+"\n============================================================================================================================================================"+
	            "\n\t\tName"+"\t\t\tAge"+"\t\t\tAddress"+"\t\t\t\t\tContact No."+
	            "\n===========================================================================================================================================================");
		System.out.printf(count+"\t\t%-7s\t\t%-15s\t\t%-3s\t\t\t%-20s\t\t\t%-10s",Parts[0],Parts[1],Parts[2],Parts[3],Parts[4]);
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");		
	        break;
			}
			else{
				Record=Parts[0]+"  "+Parts[1]+"  " +Parts[2]+"  "+Parts[3];
			RecordList.add(Record);
			}
		}	
        if(f==0)
		{
		System.out.println("not found");	
		}
		else
		{
				FileWriter w = new FileWriter ("Dhamidata.text",false);
		BufferedWriter Bw = new BufferedWriter(w);
		for(String  line : RecordList)
			{
				Bw.write(line);
				Bw.newLine();
			}
			Bw.close();
			
				if(recount<15)
			{
				
				recount=recount+1;	
		}
		System.out.print("\n\t\t\t\t\t\t\t\tThis Id Deleted Successfully");
	}
	}
	
		catch(IOException X)
	{
		System.out.println("Error");
	}
	
	
}

public static void main(String Z[])
{
    Dhami P = new Dhami();
	 int ch;
	 Scanner in = new Scanner(System.in);
	 	System.out.println("\033[H\033[2J");

while(true)
{
    System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t DHAMI NURSING HOME");
	
	System.out.println("\t\t\t\t\t\t\t_________________________________________"+"\n\t\t\t\t\t\t\t|\t1:Patient Entry\t\t\t|"+
	"\n\t\t\t\t\t\t\t|\t2:Patient Slip\t\t\t|"+"\n\t\t\t\t\t\t\t|\t3:Patient Data\t\t\t|"+
	"\n\t\t\t\t\t\t\t|\t4:Modify\t\t\t|"+"\n\t\t\t\t\t\t\t|\t5:Delete\t\t\t|"+"\n\t\t\t\t\t\t\t|\t6:Exit\t\t\t\t|"+
	"\n\t\t\t\t\t\t\t|_______________________________________|");
System.out.print("\n\n\n\t\t\t\t\t\t\tEnter choice 1,2,3,4,5 Or 6 = ");
ch=in.nextInt();
	System.out.println("\033[H\033[2J");

if(ch==1)
{

        P.entry();
		P.save();
		System.out.print("\n\n\n\n\n\n\n\n\t\t\t\t\t\t\tEnter any input and press enter = ");
		in.next();
		System.out.println("\033[H\033[2J");
}
else if(ch==2)
{
	
	    P.Patientslip();
		System.out.print("\n\n\n\n\n\n\n\n\t\t\t\t\t\t\tEnter any input and press enter = ");
		in.next();
		System.out.println("\033[H\033[2J");
}
else if(ch==3)
{
	
	    P.Showall();
		System.out.print("\n\n\n\n\n\n\t\t\t\t\t\t\tEnter any input and press enter = ");
		in.next();
		System.out.println("\033[H\033[2J");
}
else if(ch==4)
{
	
	    P.Modify();
		System.out.print("\n\n\n\n\n\n\t\t\t\t\t\t\tEnter any input and press enter = ");
		in.next();
		System.out.println("\033[H\033[2J");
}
else if(ch==5)
{
	
	    P.Delete();
		System.out.print("\n\n\n\n\n\n\t\t\t\t\t\t\tEnter any input and press enter = ");
		in.next();
		System.out.println("\033[H\033[2J");
}
else if(ch==6)
{	
break;
}
}
}
}