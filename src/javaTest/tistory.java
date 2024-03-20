package javaTest;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name);  // 부모 클래스의 생성자 호출
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + super.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("나비", 4);

        dog.display();
    }
}
