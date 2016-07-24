package pl.cba.machocki.jpa.interfaces;

import java.awt.*;

import javax.swing.*;

public class Welcome extends GenericStackPanel {

	JButton loginButton, regisButton;

	public Welcome() {

		setSize(400, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("ㄆkasz Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());

		///////////////////////////////////////////////////////////////////////////////////////////////////////

		panel1(mainPanel);

		///////////////////////////////////////////////////////////////////////////////////////////////////////

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());

		JLabel logowanie = new JLabel("Logowanie");
		addCo(panel2, logowanie, 1, 0, 1, 1, GridBagConstraints.CENTER);

		JLabel login = new JLabel("Login:");
		addCo(panel2, login, 0, 1, 1, 1, GridBagConstraints.WEST);
		JTextField loginText = new JTextField(15);
		addCo(panel2, loginText, 1, 1, 1, 1, GridBagConstraints.WEST);

		JLabel has這 = new JLabel("Has這:");
		addCo(panel2, has這, 0, 2, 1, 1, GridBagConstraints.WEST);
		JTextField has這Text = new JTextField(15);
		addCo(panel2, has這Text, 1, 2, 1, 1, GridBagConstraints.WEST);

		loginButton = new JButton("Zaloguj");
		loginButton.setPreferredSize(new Dimension(110, 25));
		addCo(panel2, loginButton, 1, 3, 1, 1, GridBagConstraints.CENTER);

		addPanel(mainPanel, panel2, 0, 1, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, 0, 0, 5, 10);

		///////////////////////////////////////////////////////////////////////////////////////////////////////

		JLabel registrInfo = new JLabel("<html>Nie masz u nas konta?</html>");
		addCo(panel2, registrInfo, 2, 2, 1, 1, GridBagConstraints.CENTER, 20, 5, 5, 5);

		regisButton = new JButton("Rejestracja");
		regisButton.setPreferredSize(new Dimension(110, 25));
		addCo(panel2, regisButton, 2, 3, 1, 1, GridBagConstraints.CENTER, 20, 5, 5, 5);

		///////////////////////////////////////////////////////////////////////////////////////////////////////

		add(mainPanel);
		pack();
		setVisible(true);
	}

}
