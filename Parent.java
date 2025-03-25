public class Parent{
    String lastName;
    String firstName;
    int age;
    public Parent(String f, String l, int a){
        firstName = f;
        lastName = l;
        age = a;
    }
    public String toString(){
        return ("Name: " + this.firstName + " " + this.lastName + "\nAge: " + this.age);
    }
}