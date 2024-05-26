package com.projectpboteori;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JFrame frame;
    private JTextField namaField;
    private JTextField umurField;
    private JTextField jumlahKelopakField;
    private JTextField tinggiField;
    private JButton submitButton;
    private JTextArea outputArea;

    public GUI() {
        frame = new JFrame("Tumbuhan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        namaField = new JTextField(10);
        umurField = new JTextField(10);
        jumlahKelopakField = new JTextField(10);
        tinggiField = new JTextField(10);

        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(namaField);
        inputPanel.add(new JLabel("Umur:"));
        inputPanel.add(umurField);
        inputPanel.add(new JLabel("Jumlah Kelopak:"));
        inputPanel.add(jumlahKelopakField);
        inputPanel.add(new JLabel("Tinggi:"));
        inputPanel.add(tinggiField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = namaField.getText();
                int umur = Integer.parseInt(umurField.getText());
                int jumlahKelopak = Integer.parseInt(jumlahKelopakField.getText());
                int tinggi = Integer.parseInt(tinggiField.getText());

                Tumbuhan tumbuhan;
                if (jumlahKelopak > 0) {
                    tumbuhan = new Bunga(nama, umur,tinggi,jumlahKelopak);
                } else if(jumlahKelopak == 0){
                    tumbuhan = new Pohon(nama, umur, tinggi);
                } else{
                    tumbuhan = new Bunga(nama, umur, 0, tinggi);
                }

                outputArea.setText(tumbuhan.cetakInfo());
                outputArea.setText(tumbuhan.tumbuh());
                tumbuhan.tumbuh();
            }
        });

        inputPanel.add(submitButton);

        outputArea = new JTextArea(10, 20);
        outputArea.setEditable(true);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}