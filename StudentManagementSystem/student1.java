package studentProject;

abstract public class student1 
{

	protected int stuId[];
	protected String name[];
	protected String address[];
	protected String course[];
	protected char attendence[];
	static String School_name;
	
	abstract void display();
	static 
	{

        School_name = "Sri Poojitha Public School";
	}
}
