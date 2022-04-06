import java.util.*;  
public class employee {
    String ID;
    String name;
    String phn_no;
    String Dept;
    String desgntn;
    String rcrd_id;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        ID = sc.nextLine();
        System.out.print("Enter Record_id : "); 
        rcrd_id = sc.nextLine();
        System.out.print("Enter Name : "); 
        name = sc.nextLine();
        System.out.print("Enter Phone number : "); 
        phn_no = sc.nextLine();
        System.out.print("Enter Department : "); 
        Dept = sc.nextLine();
        System.out.print("Enter Designation: "); 
        desgntn = sc.nextLine();
    }

    public void display(){
        System.out.println("*******EMPLOYEE DETAILS*********");
        System.out.println("Employee Id :"+ID);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Phone number :"+phn_no);
        System.out.println("Department :"+Dept); 
        System.out.println("Designation :"+desgntn);
        System.out.println("Record Id :"+rcrd_id);
    }
    public static void main(String []args){
        employee emp_1 = new employee();
        emp_1.read();
        emp_1.display();

        employee emp_2 = new employee();
        emp_2.read();
        emp_2.display();
    }
}