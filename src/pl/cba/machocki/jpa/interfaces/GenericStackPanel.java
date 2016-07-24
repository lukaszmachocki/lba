package pl.cba.machocki.jpa.interfaces;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GenericStackPanel extends JFrame {

	public void addCo(JPanel panel, JComponent component, int xPosition,
			int yPosition, int componentWidth, int componentHeight, int anch) {

		GridBagConstraints gConstraints = new GridBagConstraints();

		gConstraints.gridx = xPosition;
		gConstraints.gridy = yPosition;
		gConstraints.gridwidth = componentWidth;
		gConstraints.gridheight = componentHeight;
		gConstraints.weightx = 100;
		gConstraints.weighty = 100;
		gConstraints.insets = new Insets(5, 5, 5, 5);
		gConstraints.anchor = anch;
		gConstraints.fill = GridBagConstraints.NONE;

		panel.add(component, gConstraints);
	}

	public void addCo(JPanel panel, JComponent component, int xPosition,
			int yPosition, int componentWidth, int componentHeight, int anch,
			int leftPadding, int rightPadding, int topPadding, int bottomPadding) {

		GridBagConstraints gConstraints = new GridBagConstraints();

		gConstraints.gridx = xPosition;
		gConstraints.gridy = yPosition;
		gConstraints.gridwidth = componentWidth;
		gConstraints.gridheight = componentHeight;
		gConstraints.weightx = 100;
		gConstraints.weighty = 100;
		gConstraints.insets = new Insets(topPadding, leftPadding,
				bottomPadding, rightPadding);
		gConstraints.anchor = anch;
		gConstraints.fill = GridBagConstraints.NONE;

		panel.add(component, gConstraints);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void addPanel(JPanel panel, JComponent component, int xPosition,
			int yPosition, int componentWidth, int componentHeight, int anch,
			int fill) {

		GridBagConstraints gConstraints = new GridBagConstraints();

		gConstraints.gridx = xPosition;
		gConstraints.gridy = yPosition;
		gConstraints.gridwidth = componentWidth;
		gConstraints.gridheight = componentHeight;
		gConstraints.weightx = 100;
		gConstraints.weighty = 100;
		gConstraints.insets = new Insets(0, 0, 5, 0); // top, left, bottom,
														// right
		gConstraints.anchor = anch;
		gConstraints.fill = fill;

		panel.add(component, gConstraints);
	}

	public void addPanel(JPanel panel, JComponent component, int xPosition,
			int yPosition, int componentWidth, int componentHeight, int anch,
			int fill, int leftPadding, int rightPadding, int topPadding,
			int bottomPadding) {

		GridBagConstraints gConstraints = new GridBagConstraints();

		gConstraints.gridx = xPosition;
		gConstraints.gridy = yPosition;
		gConstraints.gridwidth = componentWidth;
		gConstraints.gridheight = componentHeight;
		gConstraints.weightx = 100;
		gConstraints.weighty = 100;
		gConstraints.insets = new Insets(topPadding, leftPadding,
				bottomPadding, rightPadding);
		gConstraints.anchor = anch;
		gConstraints.fill = fill;

		panel.add(component, gConstraints);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////

	protected void panel1(JPanel mainPanel) {

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());

		String bankName = "<html><FONT SIZE=5>"
				+ "<font color=#073763>£ukasz Bank<br>Polska</b></font></html>";
		JLabel bankNameLabel = new JLabel(bankName, JLabel.CENTER);

		addCo(panel1, bankNameLabel, 0, 0, 1, 1, GridBagConstraints.WEST);

		ImageIcon logo = new ImageIcon("Logo2.png");
		JLabel logoLabel = new JLabel(logo);

		addCo(panel1, logoLabel, 1, 0, 1, 1, GridBagConstraints.EAST);

		addPanel(mainPanel, panel1, 0, 0, 1, 1, GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);
	}

}
