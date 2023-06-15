package org.mod18;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Tabela {

    // VALOR DEFAULT
    String colunaAula() default "Especializaçao Java";

    String[] colunaNomes();

    int[] colunaIdade();
}
