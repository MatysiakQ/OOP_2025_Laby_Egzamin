class Animal {
    void speak() { System.out.println("Generic sound"); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("Woof!"); }
}