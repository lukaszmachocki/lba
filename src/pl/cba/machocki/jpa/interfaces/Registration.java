package pl.cba.machocki.jpa.interfaces;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Registration extends GenericStackPanel{
	
	public Registration(){
		
		setSize(410, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("£ukasz Bank - rejestracja");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		panel1(mainPanel);

		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		
		
		String registr = "<html><FONT SIZE=4>" +                           
		 		  	   "<font color=#073763>Rejestracja</font></html>";
		JLabel registration = new JLabel(registr, JLabel.CENTER);
		addCo(panel2, registration, 0, 0, 1, 1, GridBagConstraints.WEST, 5, 5, 5, 15);
		
		
		JRadioButton male = new JRadioButton("Mê¿czyzna");
		JRadioButton female = new JRadioButton("Kobieta");
		
		ButtonGroup sexSelect = new ButtonGroup();
		sexSelect.add(male);
		sexSelect.add(female);
		
		JPanel sexSelectPanel = new JPanel();
		sexSelectPanel.add(male);
		sexSelectPanel.add(female);
		male.setSelected(true);
		
		Border sexSelectBorder = BorderFactory.createTitledBorder("P³eæ");
		sexSelectPanel.setBorder(sexSelectBorder);
		
		addCo(panel2, sexSelectPanel, 0, 1, 1, 1, GridBagConstraints.WEST);
		
		
		
		JRadioButton classic = new JRadioButton("Classic");
		JRadioButton silver = new JRadioButton("Silver");
		JRadioButton gold = new JRadioButton("Gold");
		
		ButtonGroup accTypeSelect = new ButtonGroup();
		accTypeSelect.add(classic);
		accTypeSelect.add(silver);
		accTypeSelect.add(gold);
		
		JPanel accTypeSelectPanel = new JPanel();
		accTypeSelectPanel.add(classic);
		accTypeSelectPanel.add(silver);
		accTypeSelectPanel.add(gold);
		classic.setSelected(true);
		
		Border accTypeSelectBorder = BorderFactory.createTitledBorder("Typ konta");
		accTypeSelectPanel.setBorder(accTypeSelectBorder);
		
		addCo(panel2, accTypeSelectPanel, 1, 1, 1, 1, GridBagConstraints.EAST);
		
		
		addPanel(mainPanel, panel2, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridBagLayout());
		
	
		JLabel firstName = new JLabel("Imiê *");
		addCo(panel3, firstName, 0, 0, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField firstNameText = new JTextField(12);
		addCo(panel3, firstNameText, 0, 1, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel secondName = new JLabel("Drugie imiê");
		addCo(panel3, secondName, 1, 0, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField secondNameText = new JTextField(12);
		addCo(panel3, secondNameText, 1, 1, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel lastName = new JLabel("Nazwisko *");
		addCo(panel3, lastName, 0, 2, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField lastNameText = new JTextField(12);
		addCo(panel3, lastNameText, 0, 3, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel peselNum = new JLabel("Pesel *");
		addCo(panel3, peselNum, 1, 2, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField peselNumText = new JTextField(12);
		addCo(panel3, peselNumText, 1, 3, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel pass = new JLabel("Has³o *");
		addCo(panel3, pass, 0, 4, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField passText = new JTextField(12);
		addCo(panel3, passText, 0, 5, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel passCheck = new JLabel("Powtórz has³o *");
		addCo(panel3, passCheck, 1, 4, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField passCheckText = new JTextField(12);
		addCo(panel3,passCheckText, 1, 5, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel hint = new JLabel("PodpowiedŸ");
		addCo(panel3, hint, 0, 6, 1, 1, GridBagConstraints.WEST, 30, 5, 5, 2);
		JTextField hintText = new JTextField(12);
		addCo(panel3, hintText, 0, 7, 1, 1, GridBagConstraints.WEST, 30, 5, 0, 5);
		
		JLabel proTip = new JLabel("Pola z * musz¹ byæ wype³nione!");
		addCo(panel3, proTip, 0, 8, 1, 1, GridBagConstraints.WEST, 15, 5, 5, 5);
		
		JButton registrationButton = new JButton("Zarejestruj!");
		registrationButton.setPreferredSize(new Dimension(150, 40));
		addCo(panel3, registrationButton, 1, 8, 1, 1, GridBagConstraints.WEST, 23, 5, 5, 5);

		
		addPanel(mainPanel, panel3, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0, 0, 0, 10);

		//////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		add(mainPanel);
		pack();
		setVisible(true);
	}

}