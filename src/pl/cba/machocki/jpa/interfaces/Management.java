package pl.cba.machocki.jpa.interfaces;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Management extends GenericStackPanel{
	
	public Management(){
		
		setSize(410, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("£ukasz Bank - konto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		panel1(mainPanel);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		
		
		JButton logOutButton = new JButton("Wyloguj");
		addCo(panel2, logOutButton, 0, 0, 1, 1, GridBagConstraints.WEST, 5, -25, 5, 5);
		
		
		JLabel loggedIn = new JLabel("Zalogowany: Jan Kowalski");
		addCo(panel2, loggedIn, 1, 0, 1, 1, GridBagConstraints.WEST, 0, 0, 5, 5);
		

		ZonedDateTime todaysDate = ZonedDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.MM.yyyy");
		
		String todaysDateString = todaysDate.format(dateFormat);		
		JLabel todaysDateLabel = new JLabel(todaysDateString);
		
		addCo(panel2, todaysDateLabel, 2, 0, 1, 1, GridBagConstraints.EAST);
		
		
		addPanel(mainPanel, panel2, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridBagLayout());
		
		
		JLabel accTypeLabel = new JLabel("konto CLASSIC");
		addCo(panel3, accTypeLabel, 1, 0, 1, 1, GridBagConstraints.EAST);
		
		
		JLabel accNumLabel = new JLabel("Rachunek: 10 0000 0000 0000 0000 0000 0000");
		addCo(panel3, accNumLabel, 0, 1, 1, 1, GridBagConstraints.WEST);
		
		
		JLabel balanceLabel = new JLabel("Saldo: 10 0000" + " z³");
		addCo(panel3, balanceLabel, 0, 2, 1, 1, GridBagConstraints.WEST);
				
		
		addPanel(mainPanel, panel3, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridBagLayout());
		
		
		JButton depositButton = new JButton("Wp³ata");
		depositButton.setPreferredSize(new Dimension(80, 25));
		addCo(panel4, depositButton, 0, 0, 1, 1, GridBagConstraints.WEST, 15, 5, 5, 10);
		
		
		JButton withdrawButton = new JButton("Wyp³ata");
		withdrawButton.setPreferredSize(new Dimension(80, 25));
		addCo(panel4, withdrawButton, 1, 0, 1, 1, GridBagConstraints.CENTER, 5, 5, 5, 10);
		
		
		JButton transferButton = new JButton("Przelew");
		transferButton.setPreferredSize(new Dimension(80, 25));
		addCo(panel4, transferButton, 2, 0, 1, 1, GridBagConstraints.EAST, 5, 15, 5, 10);
		
		
		Border panel4Border = BorderFactory.createTitledBorder("Operacje");
		panel4.setBorder(panel4Border);
		
		
		addPanel(mainPanel, panel4, 0, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 7, 7, 15, 0);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridBagLayout());
		
		
		//Panel5A START
		JPanel panel5A = new JPanel();
		panel5A.setLayout(new GridBagLayout());
		
		JLabel monthlyDeposit = new JLabel("Sta³a miesiêczna wp³ata:");
		addCo(panel5A, monthlyDeposit, 0, 1, 1, 1, GridBagConstraints.WEST, 5, 5, 5, 5);
		
		JTextField monthlyDepositField = new JTextField("0", 5);
		addCo(panel5A, monthlyDepositField, 1, 1, 1, 1, GridBagConstraints.WEST, 5, 5, 5, 5);
		
		JLabel pln = new JLabel("PLN");
		addCo(panel5A, pln, 2, 1, 1, 1, GridBagConstraints.WEST, 5, 5, 5, 5);
		
		addPanel(panel5, panel5A, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, 5, 5, 10, 5);
//		Panel5A END
		
		
		
//		Panel5B START
		
		JPanel panel5B = new JPanel();
		panel5B.setLayout(new GridBagLayout());
		
		
		JLabel howManyMonths = new JLabel("Ile miesiêcy:");
		addCo(panel5B, howManyMonths, 0, 2, 1, 1, GridBagConstraints.WEST, 5, 5, 10, 5);
		
		JLabel howManyMonths1 = new JLabel("5");
		addCo(panel5B, howManyMonths1, 1, 2, 1, 1, GridBagConstraints.WEST, 5, 5, 10, 5);
		
		JSlider balanceInFutureSlider = new JSlider(0, 36, 0);
		balanceInFutureSlider.setMinorTickSpacing(1);
		balanceInFutureSlider.setMajorTickSpacing(6);
		balanceInFutureSlider.setPaintTicks(true);
		balanceInFutureSlider.setPaintLabels(true);

		
		addCo(panel5B, balanceInFutureSlider, 2, 2, 1, 1, GridBagConstraints.WEST, 5, 5, 10, 5);
		
		addPanel(panel5, panel5B, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, 5, 5, 0, 5);
//		panel5B END
		
		
		JButton checkAccState = new JButton("SprawdŸ");
		checkAccState.setPreferredSize(new Dimension(85, 25));
		addCo(panel5, checkAccState, 0, 2, 1, 1, GridBagConstraints.CENTER, 5, 5, 10, 10);
		
		
		Border panel5Border = BorderFactory.createTitledBorder("SprawdŸ stan konta w przysz³oœci!");
		panel5.setBorder(panel5Border);
		
		addPanel(mainPanel, panel5, 0, 4, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 7, 7, 15, 0);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(new GridBagLayout());
		
		
		JButton changePassButton = new JButton("Zmieñ has³o");
		changePassButton.setPreferredSize(new Dimension(120, 25));
		addCo(panel6, changePassButton, 0, 0, 1, 1, GridBagConstraints.CENTER, 0, 0, 5, 5);
		

		JButton showAccInfoButton = new JButton("Wyœwietl dane");
		showAccInfoButton.setPreferredSize(new Dimension(120, 25));
		addCo(panel6, showAccInfoButton, 1, 0, 1, 1, GridBagConstraints.CENTER, 0, 0, 5, 5);
		
		
		JButton changePinButton = new JButton("Zmieñ PIN");
		changePinButton.setPreferredSize(new Dimension(120, 25));
		addCo(panel6, changePinButton, 0, 1, 1, 1, GridBagConstraints.CENTER, 0, 0, 5, 10);
		
		
		JButton accDeleteButton = new JButton("Usuñ konto");
		accDeleteButton.setPreferredSize(new Dimension(120, 25));
		addCo(panel6, accDeleteButton, 1, 1, 1, 1, GridBagConstraints.CENTER, 0, 0, 5, 10);
		
		
		Border panel6Border = BorderFactory.createTitledBorder("Ustawienia konta");
		panel6.setBorder(panel6Border);
		
		
		addPanel(mainPanel, panel6, 0, 5, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 7, 7, 15, 7);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		add(mainPanel);
		pack();
		setVisible(true);
		
	}

}
