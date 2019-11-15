public class program {
    public static void main(String[] args) {
        person alex = new person();
        alex.name= "Alexandru Popescu";
        alex.age=20;
        alex.height=185;
        alex.stamina=10;
        Dog rex = new Dog();
        rex.size=34;
        rex.bark();



        System.out.println(alex.name + " are " + alex.age + " de ani");
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.stamina);
        alex.sleep();
        System.out.println(alex.stamina);
        if(alex.isMajor())
            System.out.println("Drink beer");
    }
}
