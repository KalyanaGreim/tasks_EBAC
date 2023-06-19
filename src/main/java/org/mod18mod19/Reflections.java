package org.mod18mod19;

import java.lang.annotation.Annotation;
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
            System.out.println("***DADOS DA CLASSE*** ");
            System.out.println("Nome da tabela: " + field.getName());
            System.out.println("Tipo da tabela: " + field.getType());
            if(field.isAnnotationPresent(Tabela.class)){
                Tabela an = field.getAnnotation(Tabela.class);
                System.out.println("Nome da anotacao: " + an.toString());
                System.out.println("Valor colunas: " + an.colunaAula());
            }
        }
        Method[] methods = table.getClass().getDeclaredMethods();
        for (Method m: methods) {
            System.out.println("Nome do metodo: " + m.getName());
        }

    }
}
