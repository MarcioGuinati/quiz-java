package quizJogo;

import javax.swing.JOptionPane;

public class quiz {
	public static void main (String[] args){
		int Pontos = 0;
		String usuario;
		usuario = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Seja bem vindo (a)! " + usuario);
		String fase1, fase2, fase3;
		
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQual � o nome dado ao estado da �gua em forma de gelo?\n"
				+ "A) L�quido\n"
				+ "B) S�lido\n"
				+ "C) Gasoso\n"
				+ "D) Vaporoso");
		if("B".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuais os pa�ses que t�m a maior e a menor expectativa de vida do mundo?\n"
				+ "A) Jap�o e Serra Leoa\n"
				+ "B) Austr�lia e Afeganist�o\n"
				+ "C) It�lia e Chade\n"
				+ "D) Brasil e Congo");
		if("A".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQual o n�mero m�nimo de jogadores numa partida de futebol?\n"
				+ "A) 8\n"
				+ "B) 10\n"
				+ "C) 9\n"
				+ "D) 7");
		if("D".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuanto tempo a luz do Sol demora para chegar � Terra?\n"
				+ "A) 12 minutos\n"
				+ "B) 1 dia\n"
				+ "C) 12 horas\n"
				+ "D) 8 minutos");
		if("D".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuais os planetas do sistema solar?\n"
				+ "A) J�piter, Marte, Merc�rio, Netuno, Plut�o, Saturno, Terra, Urano, V�nus\n"
				+ "B) J�piter, Marte, Merc�rio, Netuno, Plut�o, Saturno, Sol, Terra, Urano, V�nus\n"
				+ "C) Terra, V�nus, Saturno, Urano, J�piter, Marte, Netuno, Merc�rio\n"
				+ "D) Terra, V�nus, Saturno, J�piter, Marte, Netuno, Merc�rio");
		if("C".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		/*Inicia a fase 2 com novas perguntas, e dobra o n�mero de pontos*/
		JOptionPane.showMessageDialog(null, "Parab�ns, voc� chegou a segunda fase!");
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nLeandro tem 40 balas chupou 12 e deu 10 para sua irm�. Com quantas balas ele ficou?\n"
				+ "A) 15\n"
				+ "B) 18\n"
				+ "C) 14\n"
				+ "D) 16");
			if("B".equals(fase2)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+20;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuantos n�meros 1 eu tenho de 1 at� 191?\n"
				+ "A) 140\n"
				+ "B) 136\n"
				+ "C) 132\n"
				+ "D) 150");
		if("C".equals(fase2)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+20;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nPedro tem 30 anos e tem mais tr�s irm�os: Bianca de 27, Victor de 23 e Alex de 18. Qual a diferen�a de idade entre Pedro e irm�o ca�ula?\n"
				+ "A) 13\n"
				+ "B) 11\n"
				+ "C) 12\n"
				+ "D) 14");
		if("C".equals(fase2)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+20;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nJo�o tem 50 balas, ele deu 8 balas para a Maria, 7 balas ao Marcio e 9 balas ao Cleber, com quantas balas ele ficou?\n"
				+ "A) 24\n"
				+ "B) 27\n"
				+ "C) 22\n"
				+ "D) 26");
		if("D".equals(fase2)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+20;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nCalcule 7x7?\n"
				+ "A) 47\n"
				+ "B) 50\n"
				+ "C) 46\n"
				+ "D) 49");
		if("D".equals(fase2)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+20;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
		/*Inicia a fase 3 com novas perguntas, e dobra o n�mero de pontos*/
		JOptionPane.showMessageDialog(null, "Parab�ns, voc� chegou a terceira fase!");
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nConsidere que Sara, Mara e Lara pratiquem ou alpinismo, ou jud� ou ciclismo, n�o necessariamente nessa ordem. Uma delas � brasileira,"
				+ "\noutra � espanhola e a outra � portuguesa. Sabe-se que Mara � a alpinista, Lara n�o � ciclista, que a ciclista � portuguesa e que"
				+ "\na judoca n�o � brasileira. Nessa situa��o, a �nica alternativa que n�o � verdadeira �?\n"
				+ "A) Sara � Brasileira\n"
				+ "B) Sara � ciclista\n"
				+ "C) Mara � alpinista\n"
				+ "D) Lara � judoca");
			if("A".equals(fase3)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+30;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
			System.exit(0);
		}
	   fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nEntre os membros de uma fam�lia existem o seguinte arranjo: Se Marcio vai ao shopping, Marta fica em casa. Se Marta fica em casa,"
				+ "\nMartinho vai ao shopping. Se Martinho vai ao shopping , Mario fica em casa. Dessa maneira, se M�rio foi ao shopping, pode-se afirmar que:\n"
				+ "A) Marta ficou em casa\n"
				+ "B) Marcio n�o foi ao shopping e Marta n�o ficou em casa\n"
				+ "C) Marcio n�o foi ao shopping e Martinho foi ao shopping\n"
				+ "D) Marcio e Martinho foram ao shopping");
			if("B".equals(fase3)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+30;
			}
			else{
				JOptionPane.showMessageDialog(null, "Resposta incorreta!");
				JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
				System.exit(0);
			}
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nAna, L�cio, M�rcia e Jo�o est�o sentados ao redor de uma mesa circular. Sabe-se que Jo�o est� de frente para M�rcia que,"
				+ " \npor sua vez , est� � esquerda de L�cio. � correto afirmar que:\n"
				+ "A) Ana est� de frente para L�cio\n"
				+ "B) L�cio est� � esquerda de Ana\n"
				+ "C) Jo�o est� � esquerda de L�cio\n"
				+ "D) Ana est� de frente para M�rcia");
			if("A".equals(fase3)) {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
				Pontos=Pontos+30;
				}
				else{
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
					System.exit(0);
				}
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nCarlos est� doente e o seu m�dico mandou que ele tomasse 2 rem�dios diferentes. Um deles deve ser tomado de 5 em 5 horas e o outro,"
				+ "\nde 8 em 8 horas. As 6 horas da manh� de segunda feira, Carlos tomou 2 rem�dios ao mesmo tempo. Seguindo corretamente a prescri��o do m�dico, em"
				+ "\nque dia e em que hor�rio ele tomar�, de novo os dois rem�dios juntos?\n" 
				+ "A) 2� feira, �s 23 horas\n"
				+ "B) 4� feira, �s 11 horas\n"
				+ "C) 3� feira, �s 22 horas\n"
				+ "D) 3� feira, �s 6 horas");
			if("C".equals(fase3)) {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
				Pontos=Pontos+30;
				}
				else{
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
					System.exit(0);
				}
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nImagine que em sua frente v�o caminhando duas m�es, duas filhas, uma av� e uma neta. Quantas pessoas s�o?\n" 
				+ "A) 3\n"
				+ "B) 4\n"
				+ "C) 5\n"
				+ "D) 6");
			if("A".equals(fase3)) {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
				Pontos=Pontos+30;
				}
				else{
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					JOptionPane.showMessageDialog(null, "Sua pontua��o foi: " + Pontos);
					System.exit(0);
				}
			   JOptionPane.showMessageDialog(null, "Parab�ns " + usuario + "," + " sua pontua��o total foi: " + Pontos + " pontos," + " estamos felizes!"
			   		+ "\nEm breve voc� ter� novos desafios!");
		}
}
