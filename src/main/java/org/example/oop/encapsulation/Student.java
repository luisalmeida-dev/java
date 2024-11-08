package org.example.oop.encapsulation;

public class Student {
    /*
    o metodo de acesso Private é uma das bases do encapsulamento, ela restringe o atributo de poder ser acessado e alterado por outras classes,
    assim temos que dizer para o programa como ele deve fazer para disponibilizar e acessar essas propriedades. Para isso que servem os getters, setters e construtor.
    */
    private String name;
    private Integer age;
    private String address;

    public Student(String name, Integer age, String address) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
