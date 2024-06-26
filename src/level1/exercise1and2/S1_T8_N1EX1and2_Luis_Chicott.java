package level1.exercise1and2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S1_T8_N1EX1and2_Luis_Chicott {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>();
		words.add("Orlando");
		words.add("Carlos");
		words.add("Ana");
		words.add("Tony");
		words.add("Gabriela");
		words.add("Julio");
		words.add("Lalo");
		words.add("Carolina");
		words.add("Ramiro");
		words.add("Federico");
		
		
		//Ejercicio 1
		System.out.println("Nombres que tienen la letra 'O' : " + wordsWithO(words)); 
		
		System.out.print("\n"); 
		
		//Ejercicio 2
		System.out.println("Nombres que tienen la letra 'O' y tienen más de 5 letras : " + bigWordsWithO(words)); 

	}
	
	public static List<String> wordsWithO(List<String> words){
		List<String> wordsWithO = words.stream()
								.filter(w -> w.toLowerCase().contains("o")) 
					            .collect(Collectors.toList());		
		return wordsWithO; 		
	}
	
	public static List<String> bigWordsWithO(List<String> words){
		List<String>  bigWordsWithO = words.stream()
				.filter(w -> w.toLowerCase().contains("o")) 
				.filter(w -> w.length() > 5)
	            .collect(Collectors.toList());		
	
		return bigWordsWithO; 		
	}
}
