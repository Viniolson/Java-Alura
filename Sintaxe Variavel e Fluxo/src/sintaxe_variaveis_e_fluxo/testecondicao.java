package sintaxe_variaveis_e_fluxo;

public class testecondicao {

	public static void main(String[] args) {

		int idade = 20;
		int quantidadeDePessoas = 2;
		boolean acompanhado = true;

		if (idade >= 18 || quantidadeDePessoas >= 2) { // ou = || e = &&

			System.out.println("voce é maior de idade");

		} else {

			System.out.println("voce é menor de idade");

		}

		/* CONDIÇÃO COM IF
		 * if(idade >= 18 && acompanhado) { // usando boolean = true ou false
		 * 
		 * System.out.println("voce é maior de idade");
		 * 
		 * } else { System.out.println("voce é menor de idade"); }
		 */

		/*
		 * CONDIÇÃO COM SWITCH
		 * 
		 * public class TestaMes {
		 * 
		 * public static void main(String[] args) {
		 * 
		 * int mes = 10;
		 * 
		 * switch (mes) { case 1: System.out.println("O mês é Janeiro"); break; case 2:
		 * System.out.println("O mês é Fevereiro"); break; case 3:
		 * System.out.println("O mês é Março"); break; case 4:
		 * System.out.println("O mês é Abril"); break; case 5:
		 * System.out.println("O mês é Maio"); break; case 6:
		 * System.out.println("O mês é Junho"); break; case 7:
		 * System.out.println("O mês é Julho"); break; case 8:
		 * System.out.println("O mês é Agosto"); break; case 9:
		 * System.out.println("O mês é Setembro"); break; case 10:
		 * System.out.println("O mês é Outubro"); break; case 11:
		 * System.out.println("O mês é Novembro"); break; case 12:
		 * System.out.println("O mês é Dezembro"); break; default:
		 * System.out.println("Mês inválido"); break; } } }
		 */

		/* CONDIÇÃO COM WHILE
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

		/* CONDIÇÃO COM FOR
		 * for(contador = 1; contador <= 10; contador++) {
		 * 
		 * System.out.println(contador);
		 * 
		 * }
		 */
	}

}
