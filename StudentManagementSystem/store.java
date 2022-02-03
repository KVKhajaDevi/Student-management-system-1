package studentProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class store extends student1 
{
	int l,i = 0, c = 0, r = 0;
	int usr;
	
	Scanner scan = new Scanner(System.in);
	
	store() {
        stuId = new int[10];
        name = new String[10];
        address = new String[10];
        course = new String[10];
        attendence = new char[10];
    }

    public void add()
    {
    	
    	if (l > 50) 
    {
        System.out.println(" Over flow");
    } 
    else 
    {
    	
        try 
        {
        	System.out.println("Enter number of student to added : ");
         	int n = scan.nextInt();
         	for(int i=0;i<n;i++)
         	{
        	System.out.println("--------------------------");
            
        	System.out.println("Enter stuId : ");
            stuId[i] = scan.nextInt();
            System.out.println(" Enter name :");
            name[i] = scan.next();
            System.out.println(" Enter Address :");
            address[i] = scan.next();
            System.out.println("Enter course : ");
            course[i] = scan.next();
            System.out.println(" Enter attendence : ");
            attendence[i] = scan.next().charAt(0);
         	}
        } 
        catch (Exception e) 
        {
        	//e.printStackTrace();
            System.out.println(e);
            e.getMessage();
        }
    }
    display();
}
    
    public void search() {

        System.out.println("Enter the student Id you want to search");
        r = scan.nextInt();
        for (i = 0; i < stuId.length; i++) {
            if (stuId[i] == r) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
        System.out.println("STUId    NAME   ADDRESS  COURSE    ATTENDENCE");
        System.out.print(stuId[i]);
        System.out.print(name[i]+"   ");
        System.out.print(address[i]+"  ");
        System.out.println(course[i]+"  ");
        System.out.println(attendence[i]+"  ");
        System.out.println(" "); 
    }
    
    public void delete() {
        System.out.println("Enter the stuId to be deleted");
        r = scan.nextInt();

        for (i = 0; i < stuId.length; i++) {
            if (stuId[i] == r) {
                stuId[i] = 0;
                name[i] = " ";
                address[i] = "  ";
                course[i] = "  ";
                attendence[i] = ' ';
                System.out.println("Deleted Successfully");
            }
        }
        display();
    }

    public void update() {
        System.out.println("Enter the stuId to be updated");
        r = scan.nextInt();

        for (i = 0; i < stuId.length; i++) {
            if (stuId[i] == r) {
            	System.out.println("Enter stuId : ");
                stuId[i] = scan.nextInt();
                System.out.println(" Enter attendence : ");
                attendence[i] = scan.next().charAt(0);
            /*	stuId[i] = 0;
                name[i] = " ";
                address[i] = "  ";
                course[i] = "  ";
                attendence[i] = ' ';*/
            }
        }
        display();
    }

    
    @Override
    void display()
    {
    	// TODO Auto-generated method stub
    
    	System.out.println("----THE UPDATED RECORDS OF STUDENTS ARE----");
        System.out.println("STUId\tNAME\tADDRESS\tCOURSE\tATTENDENCE");
        for (i = 0; i < stuId.length; i++) 
        {
            if(stuId[i]!=0)
            {       
            System.out.print(stuId[i]+"    ");
            System.out.print(name[i]+"    ");
            System.out.print(address[i]+"    ");
            System.out.print(course[i]+"    ");
            System.out.print(attendence[i]+"    ");
            System.out.println();
            }
        }
    }
}
