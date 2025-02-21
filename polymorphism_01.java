
class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound ");
    }

}
class pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says : wee wee ");
    }
}

class Dog extends Animal {
    public void animalSound(){
        System.out.println("Dog is says : bow bow ");

    }

}

public class polymorphism_01 {
    public static void main(String[] args) {
        
        Animal myAnimal=new Animal();
        Animal myPig =new pig();
        Animal myDog =new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        

    }
    

}
