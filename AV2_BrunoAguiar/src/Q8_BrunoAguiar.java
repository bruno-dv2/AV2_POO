import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q8_BrunoAguiar implements ActionListener {
	private int randomNumber;
	private int palpiteCont;
	private JFrame frame;
	private JTextField palpiteText;
	private JButton[] numerosBotao;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			Q8_BrunoAguiar window = new Q8_BrunoAguiar();
			window.frame.setVisible(true);
		});
	}

	public Q8_BrunoAguiar() {
		inicializacao();
		inicioJogo();
	}

	private void inicializacao() {
		frame = new JFrame("Jogo do adivinha");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JLabel guessLabel = new JLabel("Adivinhe um número entre 1 e 20:");
		guessLabel.setBounds(10, 10, 250, 20);
		frame.add(guessLabel);

		palpiteText = new JTextField();
		palpiteText.setBounds(260, 10, 50, 20);
		palpiteText.setEditable(false);
		frame.add(palpiteText);

		JPanel numberPanel = new JPanel();
		numberPanel.setBounds(10, 50, 364, 200);
		numberPanel.setLayout(new GridLayout(4, 5));

		numerosBotao = new JButton[20];
		for (int i = 0; i < 20; i++) {
			numerosBotao[i] = new JButton(Integer.toString(i + 1));
			numerosBotao[i].addActionListener(this);
			numberPanel.add(numerosBotao[i]);
		}
		frame.add(numberPanel);
	}

	private void inicioJogo() {
		Random random = new Random();
		randomNumber = random.nextInt(20) + 1;
		palpiteCont = 0;
		palpiteText.setText(Integer.toString(palpiteCont + 1));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		int usuario = Integer.parseInt(clickedButton.getText());
		palpiteCont++;
		palpiteText.setText(Integer.toString(palpiteCont + 1));
		if (usuario == randomNumber) {
			System.out.println("Escolheu " + usuario + " e o programa escolheu " + randomNumber + ".");
			System.out.println("Parabéns! Você adivinhou o número correto!");
			disableButtons();
		} else if (palpiteCont == 5) {
			System.out.println("Escolheu " + usuario + " e o programa escolheu " + randomNumber + ".");
			System.out.println("Você não adivinhou o número correto.");
			disableButtons();
		} else {
			System.out.println("Escolheu " + usuario + " e o programa escolheu " + randomNumber + ".");
		}
	}

	private void disableButtons() {
		for (JButton button : numerosBotao) {
			button.setEnabled(false);
		}
	}
}
