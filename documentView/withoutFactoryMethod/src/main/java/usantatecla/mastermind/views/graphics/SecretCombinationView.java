package usantatecla.mastermind.views.graphics;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import usantatecla.mastermind.models.SecretCombination;
import usantatecla.mastermind.views.Message;

@SuppressWarnings("serial")
class SecretCombinationView extends JPanel {

    private static final String TITLE = "SECRET COMBINATION:";
    private JLabel title;
    private JLabel secretCombination;

    SecretCombinationView() {
        super();
        this.setLayout(new GridBagLayout());
        this.title = new JLabel(SecretCombinationView.TITLE);
        this.add(this.title, new Constraints(0, 0, 3, 1));
        String text = "";
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            text += Message.SECRET.getMessage();
        }
        this.secretCombination = new JLabel(text);
        this.add(this.secretCombination, new Constraints(0, 1, 3, 1));
        this.setVisible(true);
    }
}
