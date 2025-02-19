public class j77_abstract_class {
    public static void main (String args[]){
    
        Horse H = new Horse();
        H.eats();
        H.walk();
        Chicken c = new Chicken();
        c.eats();
        c.walk();
        
    }
}
abstract class Animal{  // abstract class - can have abstract methods - cannot create class objects - can create constructor
    void eats(){
        System.out.println("eats");
    }
    abstract void walk();  // only gives the method definition - idea of method
}

class Horse extends Animal{
    
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
  
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}
