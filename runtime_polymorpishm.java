class Animal {
    String makeSound() {
        return "Animal has different sounds";
    }
}

class Dog extends Animal {
    String makeSound() {
        return "Dog sounds as BOW BOW";
    }
}

class Cat extends Animal {
    String makeSound() {
        return "Cat sounds as MEOW MEOW";
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println(animal.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
