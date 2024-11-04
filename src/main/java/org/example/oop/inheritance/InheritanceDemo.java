package org.example.oop.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        MachineOperators machineOperators = new MachineOperators("Excavator", "Fernando", 29, 392L, "North Mine"); //Ao instanciar a classe filha ela tambem chama o construtor da classe pai para poder preencher os campos derivados dela.

        System.out.println("Addressed Machine: " + machineOperators.getAddressedMachine());
        System.out.println("Operator Name: " + machineOperators.name); //O campo nome é da classe pai, porém pode ser acessado devido a herança
        System.out.println("Operator Sector: " + machineOperators.sector);

        machineOperators.chageSector("South Mine"); //Tambem é possível utilizar metodos daclasse pai.
        System.out.println("Operator New Sector: " + machineOperators.sector);
    }
}
