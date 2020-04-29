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
				+ "\nQual é o nome dado ao estado da água em forma de gelo?\n"
				+ "A) Líquido\n"
				+ "B) Sólido\n"
				+ "C) Gasoso\n"
				+ "D) Vaporoso");
		if("B".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuais os países que têm a maior e a menor expectativa de vida do mundo?\n"
				+ "A) Japão e Serra Leoa\n"
				+ "B) Austrália e Afeganistão\n"
				+ "C) Itália e Chade\n"
				+ "D) Brasil e Congo");
		if("A".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQual o número mínimo de jogadores numa partida de futebol?\n"
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuanto tempo a luz do Sol demora para chegar à Terra?\n"
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase1 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuais os planetas do sistema solar?\n"
				+ "A) Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Terra, Urano, Vênus\n"
				+ "B) Júpiter, Marte, Mercúrio, Netuno, Plutão, Saturno, Sol, Terra, Urano, Vênus\n"
				+ "C) Terra, Vênus, Saturno, Urano, Júpiter, Marte, Netuno, Mercúrio\n"
				+ "D) Terra, Vênus, Saturno, Júpiter, Marte, Netuno, Mercúrio");
		if("C".equals(fase1)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+10;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		/*Inicia a fase 2 com novas perguntas, e dobra o número de pontos*/
		JOptionPane.showMessageDialog(null, "Parabéns, você chegou a segunda fase!");
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nLeandro tem 40 balas chupou 12 e deu 10 para sua irmã. Com quantas balas ele ficou?\n"
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nQuantos números 1 eu tenho de 1 até 191?\n"
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nPedro tem 30 anos e tem mais três irmãos: Bianca de 27, Victor de 23 e Alex de 18. Qual a diferença de idade entre Pedro e irmão caçula?\n"
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		fase2 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nJoão tem 50 balas, ele deu 8 balas para a Maria, 7 balas ao Marcio e 9 balas ao Cleber, com quantas balas ele ficou?\n"
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
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
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
		/*Inicia a fase 3 com novas perguntas, e dobra o número de pontos*/
		JOptionPane.showMessageDialog(null, "Parabéns, você chegou a terceira fase!");
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nConsidere que Sara, Mara e Lara pratiquem ou alpinismo, ou judô ou ciclismo, não necessariamente nessa ordem. Uma delas é brasileira,"
				+ "\noutra é espanhola e a outra é portuguesa. Sabe-se que Mara é a alpinista, Lara não é ciclista, que a ciclista é portuguesa e que"
				+ "\na judoca não é brasileira. Nessa situação, a única alternativa que não é verdadeira é?\n"
				+ "A) Sara é Brasileira\n"
				+ "B) Sara é ciclista\n"
				+ "C) Mara é alpinista\n"
				+ "D) Lara é judoca");
			if("A".equals(fase3)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+30;
		}
		else{
			JOptionPane.showMessageDialog(null, "Resposta incorreta!");
			JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
			System.exit(0);
		}
	   fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nEntre os membros de uma família existem o seguinte arranjo: Se Marcio vai ao shopping, Marta fica em casa. Se Marta fica em casa,"
				+ "\nMartinho vai ao shopping. Se Martinho vai ao shopping , Mario fica em casa. Dessa maneira, se Mário foi ao shopping, pode-se afirmar que:\n"
				+ "A) Marta ficou em casa\n"
				+ "B) Marcio não foi ao shopping e Marta não ficou em casa\n"
				+ "C) Marcio não foi ao shopping e Martinho foi ao shopping\n"
				+ "D) Marcio e Martinho foram ao shopping");
			if("B".equals(fase3)) {
			JOptionPane.showMessageDialog(null, "Resposta correta!");
			Pontos=Pontos+30;
			}
			else{
				JOptionPane.showMessageDialog(null, "Resposta incorreta!");
				JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
				System.exit(0);
			}
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nAna, Lúcio, Márcia e João estão sentados ao redor de uma mesa circular. Sabe-se que João está de frente para Márcia que,"
				+ " \npor sua vez , está à esquerda de Lúcio. É correto afirmar que:\n"
				+ "A) Ana está de frente para Lúcio\n"
				+ "B) Lúcio está à esquerda de Ana\n"
				+ "C) João está á esquerda de Lúcio\n"
				+ "D) Ana está de frente para Márcia");
			if("A".equals(fase3)) {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
				Pontos=Pontos+30;
				}
				else{
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
					System.exit(0);
				}
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nCarlos está doente e o seu médico mandou que ele tomasse 2 remédios diferentes. Um deles deve ser tomado de 5 em 5 horas e o outro,"
				+ "\nde 8 em 8 horas. As 6 horas da manhã de segunda feira, Carlos tomou 2 remédios ao mesmo tempo. Seguindo corretamente a prescrição do médico, em"
				+ "\nque dia e em que horário ele tomará, de novo os dois remédios juntos?\n" 
				+ "A) 2° feira, às 23 horas\n"
				+ "B) 4° feira, às 11 horas\n"
				+ "C) 3° feira, às 22 horas\n"
				+ "D) 3° feira, às 6 horas");
			if("C".equals(fase3)) {
				JOptionPane.showMessageDialog(null, "Resposta correta!");
				Pontos=Pontos+30;
				}
				else{
					JOptionPane.showMessageDialog(null, "Resposta incorreta!");
					JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
					System.exit(0);
				}
		fase3 = JOptionPane.showInputDialog("\n Usuario: " + usuario + " Pontos: " + Pontos + "\n"
				+ "\nImagine que em sua frente vão caminhando duas mães, duas filhas, uma avó e uma neta. Quantas pessoas são?\n" 
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
					JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + Pontos);
					System.exit(0);
				}
			   JOptionPane.showMessageDialog(null, "Parabéns " + usuario + "," + " sua pontuação total foi: " + Pontos + " pontos," + " estamos felizes!"
			   		+ "\nEm breve você terá novos desafios!");
		}
}
