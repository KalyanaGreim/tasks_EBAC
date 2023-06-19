package org.mod18mod19;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Tabela {

    // VALOR DEFAULT
    String colunaAula() default "Especializacao Java";

    String[] colunaNomes();

    int[] colunaIdade();
}
