package org.mod9;

public class Tarefa_Wrapper {

    public static void main(String args[]) {
        wraper();
    }
    public static void wraper() {
        System.out.println("Tipo primitivo convertido para Wrapper:" );
        int num = 456;
        System.out.println("Tipo primitivo: " + num);
        Integer convert = Integer.valueOf(num);
        System.out.println("Conversao tipo primirivo para wrapper: " + convert);
    }
}
