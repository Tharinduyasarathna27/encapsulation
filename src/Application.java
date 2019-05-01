public class Application {
    public static void main(String[] args) {

        Student student = new Student();

        // privet and getter, setter - Type 1
        student.setName("Tharindu");
        System.out.println("Student name is : "+ student.getName());

        // Member Class - Type 2
        Student.Marks stuAge = student.new Marks();
        stuAge.setMark(80);
        System.out.println("Student's Mark is : "+stuAge.getMark());

        //Inner Class Type-3
        student.generateResults("A");

        //Anonymous class Type-4
        student.generateStatus("Passed");
    }
}
