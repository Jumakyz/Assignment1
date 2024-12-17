public class Person {
    public String name;
    public int age;

    public Person(String name , int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name:" +name);
        System.out.println("Age:"+ age);
    }
    //public void displayIncrement(int age){
       // this.age=this.age+1;
       // return this.age;
    //}


}
