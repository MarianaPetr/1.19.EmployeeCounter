/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Employees {
	public static int count=0;
	
    public Employees() {
        count++;
    }
    
    public static int getCount(){
    	return count;
    }

    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        System.out.println("Employees count is " + getCount() );
        
    }
}