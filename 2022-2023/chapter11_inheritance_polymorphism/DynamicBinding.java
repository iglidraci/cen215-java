public class DynamicBinding {
    public static void main(String[] args) {
        /*
        A method can be implemented in several classes along the inheritance chain. The JVM
        decides which method is invoked at runtime.
        */
        display(new Capuchin()); // polymorphic call
        display(new Monkey());
        display(new Mammal());
        display(new Animal());
    }

    public static void display(Object obj) {
        /*
        Which toString() method is invoked by obj is determined by obj’s actual type. This is known as dynamic binding
        Suppose that an object is an instance of classes C1 where C1 is a subclass of C2, C2, C3 ... Cn
        The  JVM searches for the implementation of the method in C1, C2, . . . , Cn-1, and Cn,
        in this order, until the method is found.
        Once an implementation is found, the search stops and the first-found implementation is invoked.
         */
        System.out.println(obj.toString()); // dynamic binding
    }
}

class Capuchin extends Monkey {
    @Override
    public String toString() {
        return "Capuchin monkey";
    }
}

class Monkey extends Mammal {
    @Override
    public String toString() {
        return "A monkey";
    }
}

class Mammal extends Animal {
    @Override
    public String toString(){
        return "A mammal";
    }
}

class Animal {
    // child of the Object class
    @Override
    public String toString() {
        return "An animal";
    }
}
