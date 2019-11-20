package src;

import src.person;

public class program {
    public static void main(String[] args) {
        person alex = new person("Alex",20,176,100);
        Dog rex = new Dog();
        rex.size=34;
        rex.bark();

        person Andrei = new Student("Andrei",17,160,100,"A");
        Andrei.grow(10);
        System.out.println(Andrei.getHeight());
    if(alex instanceof Student){
        System.out.println(Andrei.getName() + " este persoana");
    }
        Student s= (Student) Andrei;
        System.out.println(Andrei.toString());
        /*System.out.println(alex.name + " are " + alex.age + " de ani");
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.stamina);
        alex.sleep();
        System.out.println(alex.stamina);*/
        if(alex.isMajor())
            System.out.println("Drink beer");
    }
}
