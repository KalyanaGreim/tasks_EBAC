package org.mod18mod19;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflections {
    public static void main(String args[]) {
        executeReflections();
    }

    private static void executeReflections() {
        UseTable table = new UseTable();
        Field[] fields = table.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("**** DADOS DA TABELA ****");
            System.out.println("Nome da tabela: " + field.getName());
            System.out.println("Tipo da tabela: " + field.getType());
        }
        Method[] methods = table.getClass().getDeclaredMethods();
        for (Method m: methods) {
            System.out.println("Nome do metodo: " + m.getName());
            System.out.println();
        }
    }
}
