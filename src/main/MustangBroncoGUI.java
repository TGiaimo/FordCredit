package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MustangBroncoGUI {
  private JButton calculateButton;
  private JTextField enterNumberTextField;
  private JTextField textField2;
  private JPanel panel;
  private MustangBronco mustangBronco;

  public MustangBroncoGUI() {
    mustangBronco = new MustangBronco();
    calculateButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mustangBronco.setNum(Integer.parseInt(enterNumberTextField.getText()));
        textField2.setText(mustangBronco.calculateMustangBronco());
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("MustangBroncoGUI");
    frame.setContentPane(new MustangBroncoGUI().panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
