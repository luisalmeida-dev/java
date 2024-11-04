package org.example.oop.inheritance;

public class Employee {
    protected String name; //Utilizanod protected para que o parametro possa ser acessado na classe filha se utilizar getter e setter.
    protected Integer age;
    protected Long code;
    protected String sector;

    public Employee(String name, Integer age, Long code, String sector) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.sector = sector;
    }
     public void chageSector(String newSector){
        this.sector = newSector;
     }
}
