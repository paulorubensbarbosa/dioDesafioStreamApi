import java.util.*;
import java.util.stream.Collectors;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> doisMaiores = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(2)
                .toList();
        int segundoMaior = doisMaiores.get(1);
        System.out.println(segundoMaior);
    }
}

/* possíveis usos .distinct para remover itens duplicados
*/