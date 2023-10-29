package org.example.Functions;

public abstract class Usage {

    public void printPhrase() {
        System.out.println("Public function");
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    protected String concatStrings(String a, String b) {
        return a + b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    public static void print() {
        System.out.println("Static function");
    }

    public abstract int squaredNumber(int a);
}

class Tester{
    public static void main(String[] args) {
        //Uso do metodo Static
        Usage.print();

        //Declaracao para utilizar outros metodos da classe
        Usage usage = new Usage() {

            //Declaracao do metodo abstrato para poder ser instanciada
            @Override
            public int squaredNumber(int a) {
                return a*a;
            }
        };

        //Uso do metodo Public
        usage.printPhrase();

        //Uso do metodo Protected (esta no mesmo pacote da classe Usage)
        System.out.println(usage.concatStrings("string1", "string2"));

        //Uso do metodo Defaut (Esta no mesmo pacote)
        System.out.println(usage.divide(8, 2));

        //Uso de metodo predefindo
        System.out.println("Maior numero: " + Math.max(9, 99) );

        //Uso do metodo abstract que teve sua logica criada nessa classe
        System.out.println(usage.squaredNumber(4));

    }
}
