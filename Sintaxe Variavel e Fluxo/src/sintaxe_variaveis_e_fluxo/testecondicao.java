package sintaxe_variaveis_e_fluxo;

public class testecondicao {

	public static void main(String[] args) {

		int idade = 20;
		int quantidadeDePessoas = 2;
		boolean acompanhado = true;

		if (idade >= 18 || quantidadeDePessoas >= 2) { // ou = || e = &&

			System.out.println("voce � maior de idade");

		} else {

			System.out.println("voce � menor de idade");

		}

		/* CONDI��O COM IF
		 * if(idade >= 18 && acompanhado) { // usando boolean = true ou false
		 * 
		 * System.out.println("voce � maior de idade");
		 * 
		 * } else { System.out.println("voce � menor de idade"); }
		 */

		/*
		 * CONDI��O COM SWITCH
		 * 
		 * public class TestaMes {
		 * 
		 * public static void main(String[] args) {
		 * 
		 * int mes = 10;
		 * 
		 * switch (mes) { case 1: System.out.println("O m�s � Janeiro"); break; case 2:
		 * System.out.println("O m�s � Fevereiro"); break; case 3:
		 * System.out.println("O m�s � Mar�o"); break; case 4:
		 * System.out.println("O m�s � Abril"); break; case 5:
		 * System.out.println("O m�s � Maio"); break; case 6:
		 * System.out.println("O m�s � Junho"); break; case 7:
		 * System.out.println("O m�s � Julho"); break; case 8:
		 * System.out.println("O m�s � Agosto"); break; case 9:
		 * System.out.println("O m�s � Setembro"); break; case 10:
		 * System.out.println("O m�s � Outubro"); break; case 11:
		 * System.out.println("O m�s � Novembro"); break; case 12:
		 * System.out.println("O m�s � Dezembro"); break; default:
		 * System.out.println("M�s inv�lido"); break; } } }
		 */

		/* CONDI��O COM WHILE
		 * int contador = 1;
		 * 
		 * while (contador <= 10) {
		 * 
		 * System.out.println(contador);
		 * 
		 * ++contador;
		 * 
		 * } }
		 * 
		 */

		/* CONDI��O COM FOR
		 * for(contador = 1; contador <= 10; contador++) {
		 * 
		 * System.out.println(contador);
		 * 
		 * }
		 */
	}

}
