package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblPhone;
    private JTextField txtPhone;
    private JButton btnSave;
    private JButton btnCancel;
    private JPanel buttonPanel;

    public ContactForm(){

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // Pega como parametro o tamanho da tela
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2 ); //Seta o local onde vai iniciar

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Ao fechar a janela, encerra a aplicação

        setListeners();

    }

    private void setListeners(){
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
