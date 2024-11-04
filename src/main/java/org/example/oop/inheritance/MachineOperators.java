package org.example.oop.inheritance;

public class MachineOperators extends Employee {// Extends deve ser utilizado para fazer a heranca
    private String addressedMachine;

    public MachineOperators(String addressedMachine, String name, Integer age, Long code, String sector) {
        super(name, age, code, sector); //Super usado para referenciar o construtor da classe pai. Usar o construtor como a primeira coisa da classe.
        this.addressedMachine = addressedMachine;
    }

    public void changeEmployeeMachine(String newMachine){
        this.addressedMachine = newMachine;
    }

    public String getAddressedMachine() {
        return addressedMachine;
    }

    public void setAddressedMachine(String addressedMachine) {
        this.addressedMachine = addressedMachine;
    }
}
