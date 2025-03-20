package com.example.demo;

class Person {
    private String name;
    private int age;
    private String address;

    public Person() {}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Use Getters in display() method
    public void display() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress());
    }
}


class Student extends Person {
    private String studentId;

    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

class PersonFactory {
    public static Person createDefaultPerson() {
        return new Person("Default Name", 30, "Default Address");
    }

    public static Student createDefaultStudent() {
        return new Student("Student", 20, "University Campus", "S12345");
    }
}

class ObjectHolder<T> {
    private T object;

    public ObjectHolder(T object) {
        this.object = object;
    }

    public T getObject() { return object; }
    public void setObject(T object) { this.object = object; }

    public void displayObjectDetails() {
        if (object instanceof Person) {
            ((Person) object).display();
        } else {
            System.out.println("Stored object: " + object.toString());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25, "New York");
        person.display();

        Student student = new Student("Alice", 22, "Los Angeles", "S1001");
        student.display();

        Person defaultPerson = PersonFactory.createDefaultPerson();
        defaultPerson.display();

        Student defaultStudent = PersonFactory.createDefaultStudent();
        defaultStudent.display();

        ObjectHolder<Person> personHolder = new ObjectHolder<>(person);
        personHolder.displayObjectDetails();

        ObjectHolder<Student> studentHolder = new ObjectHolder<>(student);
        studentHolder.displayObjectDetails();
    }
}
