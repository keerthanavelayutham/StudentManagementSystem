import java.util.ArrayList;
import java.util.Scanner;

class Student{

    private int id;
    private String name;
    private int age;
    private String grade;

  
public Student(int id, String name, int age, String grade) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.grade = grade;
}

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }

    public void setName(String name){
        this.name = name;
    }
     public void setAge(int age){
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    public String toString(){
        return "ID: "+ id +"| Name: " + name + "| Age: " +age +"| Grade: " +grade;
    }
}

public  class StudentManagementSystem {
    private static ArrayList <Student> students = new ArrayList<>();
    private static  Scanner sc = new Scanner(System.in);

    public static void main(String []args){
        while (true) { 
            System.out.println("\n===== Student=====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Enter choice");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                addStudent();
                break;
                case 2:
                viewStudents();
                break;
                case 3:
                updateStudent();
                break;
                case 4:
                deleteStudent();
                break;
                case 5:{
                    System.out.println("Exiting.... Goodbye");
                    System.exit(0);
                    break;
                }
                default:
                System.out.println("invalid choice! Try Again");
            }
        }
    }
private static void addStudent(){
    System.out.println("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Name: ");
    String name = sc. nextLine();
    System.out.println("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Grade: ");
    String grade = sc.nextLine();

    students.add(new Student(id,name, age, grade));
    System.out.println("Student Added Successfully");
}
private static void viewStudents(){
    if(students.isEmpty()){
        System.out.println("No Students found!");
    }else{
        System.out.println("\n--- Student List ---");
        for (Student s: students){
            System.out.println(s);
        }
    }
}
private static void updateStudent(){
    System.out.println("Enter Student ID to update: ");
    int id = sc.nextInt();
    sc.nextLine();

    for (Student s : students){
        if(s.getId() == id){
            System.out.println("Enter new Name: ");
            s.setName(sc.nextLine());
            System.out.println("Enter new Age: ");
            s.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter new grade: ");
            s.setGrade(sc.nextLine());
            System.out.println("Student Updated Successfully!");
            return;
        }
    }
    System.out.println("Student not found!");
}
private static void deleteStudent(){
    System.out.println("enter Student ID to delete: ");
    int id = sc. nextInt();

    for (int i = 0; i < students.size(); i++) {
    if (students.get(i).getId() == id) {
        students.remove(i);
        System.out.println("Student Deleted Successfully");
        return;
        }
    }
    System.out.println("Student not found!");
  }
}
