package functionalIterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	 public static void main(String[] args) {
		 
		 
		 //CONSUMER
		 System.out.println("---CONSUMER---");
		 List<Integer> numerosc = Arrays.asList(1, 2, 3, 4, 5);
		 
		 /*numerosc.forEach(n -> {
			 if(n % 2 == 0) {
				 System.out.println(n);
			 }
		 	}
		 );*/
		 
		 numerosc.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		 System.out.println();
		 //SUPPLIER
		 System.out.println("---SUPPLIER---");
		 //Supplier<String> saudacao = () -> "hello, world!";
		 
		 List<String> listaSaudacoes = Stream.generate(() -> "hello, world!").limit(3).toList();	
		 
		 listaSaudacoes.forEach(s -> System.out.println(s));
		 
		 
		 System.out.println();
		 //FUNCTION
		 System.out.println("---FUNCTION---");
		 List<Integer> numerosf = Arrays.asList(1, 2, 3, 4, 5);
		 
		 //Function<Integer, Integer> dobrar = numero -> numero * 2;
		 
		 List<Integer> numerosDobrados = numerosf.stream().map(n -> n * 2).toList();
		 
		 numerosDobrados.forEach(n -> System.out.println(n));
		 
		 
		 System.out.println();
		 //PREDICATE
		 System.out.println("---PREDICATE---");
		 List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
		 
		 //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		 
		 palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
		 
		 
		 System.out.println();
		 //BINARY OPERATOR
		 System.out.println("---BYNARY OPERATOR---");
		 List<Integer> numerosb = Arrays.asList(1, 2, 3, 4, 5);
		 
		 //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		 
		 int resultado = numerosb.stream().reduce(0, (n1, n2) -> n1 + n2);
		 //method reference
		 //int resultado = numerosb.stream().reduce(0,Integer::sum);
		 
		 System.out.println("A soma dos numeros é: " + resultado);
	 }
}
