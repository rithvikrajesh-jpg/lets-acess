class Student
{
    int id;
    String name;
    float stipend;
     Student(){}

     Student(int id, String name){
          this.id = id;
          this.name = name;
     }
     
     Student(int id, String name, float stripend){
          this.id = id;
          this.name = name;
          this.stipend=stipend;
     }

     void displayDetails(){
      System.out.println(this.id + " |" + this.name + "|" + this.stipend);
 }
}
 

 class Main
 {

    public static void main(String[] args)
    { 
        Student st1 =new Student();
        Student st2 =new Student(45, "Aashish");
        Student st3 =new Student(234, "cody", 10300);

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();

    }
 }
