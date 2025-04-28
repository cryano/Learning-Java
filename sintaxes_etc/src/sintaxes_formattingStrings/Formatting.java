package sintaxes_formattingStrings;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Formatting {

	public static void main(String[] args) {
		String abc = " EU ryan DaVid dE OlIVeirA SilvA   ";

		System.out.println(abc); System.out.println(); // String original.
		System.out.println(abc.toLowerCase()); // String com letras minúsculas.
		System.out.println(abc.toUpperCase()); // String com letras maiúsculas.
		System.out.println(abc.trim());        // String sem espaços em branco das extremidades.
		System.out.println(abc.substring(8));  // Recorte de string (x = idex inicial, y = index final).
		System.out.println(abc.substring(8, 13));  // Recorte de string (x = idex inicial, y = index final).
		System.out.println(abc.replace("ryan", "david")); // Substituição de uma str/char por outra (se existir).
		System.out.println(abc.replace(' ', '.')); // Substituição de uma str/char por outra (se existir).
		System.out.println(abc.indexOf('a')); // Encontrar a posição a 1st ocorrência de uma str/char;
		System.out.println(abc.lastIndexOf('a')); // Encontrar a posição a última ocorrência de uma str/char;
		
		// Recortando uma string:
		
		String fruits = "Limão Laranja Lima";
		
		String[] vectFruits = fruits.split(" "); // Separando as palavras em um vetor.
		String word1 = vectFruits[0];
		String word2 = vectFruits[1];
		String word3 = vectFruits[2];
		
		System.out.println("------------------------------------");
		System.out.println(fruits); System.out.println(); // String original.
		System.out.println(word1); // 1st Substring da string original.
		System.out.println(word2); // 2nd Substring da string original.
		System.out.println(word3); // 3rd Substring da string original.
		
	}

}
