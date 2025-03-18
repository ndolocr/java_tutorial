public class Student {
    int age;
    String name;
    String adminNo;
    String studentClass;


    Student(int age, String name, String adminNo, String studentClass){
        this.age = age;
        this.name = name;
        this.adminNo = adminNo;
        this.studentClass = studentClass;
    }

    // SETTERS
    void setAge(int age){
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAdminNo(String adminNo){
        this.adminNo = adminNo;
    }

    void setStudentClass(String studentClass){
        this.studentClass = studentClass;
    }

    // GETTERS
    int getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    String getAdminNo(){
        return this.adminNo;
    }

    String getStudentClass(){
        return this.studentClass;
    }

    public static void main(String [] args){
        Student studentOne = new Student(4, "Joan Kamau", "001", "1");
        Student studentTwo = new Student(3, "Charles Kapala", "002", "1");
        Student studentThree = new Student(4, "Ruth Jibran", "003", "1");
        Student studentFour = new Student(3, "Gavin Kasyoka", "004", "1");

        // Creating an array of students
//        Student[] studentsArray = {
//                new Student(4, "Joan Kamau", "001", "1"),
//                new Student(3, "Charles Kapala", "002", "1"),
//                new Student(4, "Ruth Jibran", "003", "1"),
//                new Student(3, "Gavin Kasyoka", "004", "1")
//        };

        Student[] students = {studentOne, studentTwo, studentThree, studentFour};

        System.out.println("***********************************************");
        System.out.println("STUDENT DETAILS");
        System.out.println();
        System.out.println("# \t Name \t Age \t Class");
        for(Student student : students){
            System.out.print(student.adminNo);
            System.out.print("\t");
            System.out.print(student.name);
            System.out.print("\t");
            System.out.print(student.age);
            System.out.print("\t");
            System.out.print(student.studentClass);
            System.out.println();
            System.out.println("--------------------------------------------");
        }


    }
}
