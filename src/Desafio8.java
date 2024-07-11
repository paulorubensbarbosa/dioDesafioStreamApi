import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream()
                .map(n -> String.valueOf(n)
                        .chars())
                .forEach(charStream -> charStream.forEach(c -> System.out.print(c + " ")));































//        int somaDosDigitos = numeros.stream().mapToInt(n -> String.valueOf(n).chars()
//                        .map(Character::getNumericValue)
//                        .sum())
//                .sum();
//
//        System.out.println(somaDosDigitos);
    }
}
