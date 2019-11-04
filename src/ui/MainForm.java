package ui;

import bussiness.ContactBussiness;
import entity.ContactEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {

    private JPanel rootPanel;
    private JButton btnNewContact;
    private JButton btnRemove;
    private JTable tableContacts;

    private ContactBussiness mContactBussiness = new ContactBussiness();

    public MainForm(){

        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // Pega como parametro o tamanho da tela
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2 ); //Seta o local onde vai iniciar

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Ao fechar a janela, encerra a aplicação

        setListeners();
        loadContacts();

    }

    private void setListeners(){

        btnNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ContactForm();
                dispose();
            }
        });

        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void loadContacts(){
        List<ContactEntity> contactList = mContactBussiness.getList();

        DefaultTableModel model = new DefaultTableModel(); //terminar
    }
}
