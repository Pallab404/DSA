public class p1 {
    public static void main(String[] args) {
        
        Student pallab = new Student(12, "Pallab", 90.0f);

        Student Hori = new Student();

        System.out.println(pallab.roll+"\n"+pallab.name+"\n"+pallab.marks);
        System.out.println(Hori.roll+"\n"+Hori.name+"\n"+Hori.marks);
    }
}

// class example
class Student{
    int roll;
    String name;
    float marks;

    // constructor : 

    // we need a way to add the values of the above properties object by object
    
    // we need one word to access every object : this keyword
    Student(int roll,String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    Student(){
        this.roll = 0;
        this.name = "No Name";
        this.marks = 0.0f;
    }

    // this is called constructor overloading .. when we call the constructor with 3 arguments it will call the first constructor and when we call the constructor with no arguments it will call the second constructor...this is known as  contructor overloading
}
