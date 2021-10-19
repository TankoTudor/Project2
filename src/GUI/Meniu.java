package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Meniu {
    private JButton StartShoping;
    public JPanel Mypanel;
    private JButton adaugareCosButton;
    private JButton verificareSumaButton;
    private JButton verificareStockButton;
    private JButton stergereElementButton;
    private JButton finalizareComandaButton;
    private JButton listaProduseButton;
    private JTextField textField1;
    private JTextField cant;
    private JButton adaugaInCosButton;
    private JTextField cod;
    private JLabel numeprodus;
    private JLabel cantitate;
    private JLabel codprodus;
    private JLabel adaugatlabel;
    private JTextField textField2;
    private JLabel pret;
    private JLabel verifsumlabel;
    private JButton sumverifButton;
    private JButton backMeniuButton;
    private JLabel listaprod1;
    private JLabel listaprod2;
    private JLabel listaprod3;
    private JButton backmeniu2Button;
    private JButton backMeniuButton1;
    private JButton verificareButton;
    private JLabel verificarestocklabel;
    private JTextField codeverif;
    private JLabel codelabelverif;
    private JButton backMeniuButton2;
    private JTextField stergereprodus;
    private JLabel stergerelabel;
    private JButton stergereprodusButton;
    private JLabel stergereprodus2;
    private JButton backmeniu4Button;
    private JButton nuButton;
    private JButton daButton;
    private JLabel sumafinalalabel;
    private JLabel labelulfinal;

    public Meniu(){
        int suma=0;

        StartShoping.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StartShoping.setVisible(false);
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
            }
        });

        adaugareCosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(false);
                verificareSumaButton.setVisible(false);
                verificareStockButton.setVisible(false);
                stergereElementButton.setVisible(false);
                finalizareComandaButton.setVisible(false);
                listaProduseButton.setVisible(false);
                textField1.setVisible(true);
                cant.setVisible(true);
                cod.setVisible(true);
                adaugaInCosButton.setVisible(true);
                numeprodus.setVisible(true);
                cantitate.setVisible(true);
                codprodus.setVisible(true);
                pret.setVisible(true);
                textField2.setVisible(true);
                backmeniu2Button.setVisible(true);

            }
        });

        backmeniu2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
                textField1.setVisible(false);//
                cant.setVisible(false);
                cod.setVisible(false);
                adaugaInCosButton.setVisible(false);
                numeprodus.setVisible(false);
                cantitate.setVisible(false);
                codprodus.setVisible(false);
                pret.setVisible(false);
                textField2.setVisible(false);
                backmeniu2Button.setVisible(false);
                adaugatlabel.setVisible(false);
            }
        });
        adaugaInCosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adaugatlabel.setVisible(true);
                int suma=Integer.parseInt(cant.getText())*Integer.parseInt(textField2.getText());

            }
        });

        verificareSumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(false);
                verificareSumaButton.setVisible(false);
                verificareStockButton.setVisible(false);
                stergereElementButton.setVisible(false);
                finalizareComandaButton.setVisible(false);
                listaProduseButton.setVisible(false);
                sumverifButton.setVisible(true);
                backMeniuButton1.setVisible(true);
            }
        });

        backMeniuButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
                sumverifButton.setVisible(false);
                backMeniuButton1.setVisible(false);
                verifsumlabel.setVisible(false);
            }
        });


        sumverifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verifsumlabel.setText("Suma " + suma);
                verifsumlabel.setVisible(true);
            }
        });

        listaProduseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(false);
                verificareSumaButton.setVisible(false);
                verificareStockButton.setVisible(false);
                stergereElementButton.setVisible(false);
                finalizareComandaButton.setVisible(false);
                listaProduseButton.setVisible(false);
                backMeniuButton.setVisible(true);
                listaprod1.setVisible(true);
                listaprod2.setVisible(true);
                listaprod3.setVisible(true);
            }
        });

        backMeniuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
                backMeniuButton.setVisible(false);
                listaprod1.setVisible(false);
                listaprod2.setVisible(false);
                listaprod3.setVisible(false);

            }
        });

        verificareStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(false);
                verificareSumaButton.setVisible(false);
                verificareStockButton.setVisible(false);
                stergereElementButton.setVisible(false);
                finalizareComandaButton.setVisible(false);
                listaProduseButton.setVisible(false);
                verificarestocklabel.setVisible(true);
                verificareButton.setVisible(true);
                codelabelverif.setVisible(true);
                codeverif.setVisible(true);
                backMeniuButton2.setVisible(true);

            }
        });

        verificareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(codeverif.getText().equals("i7") || codeverif.getText().equals("i5") || codeverif.getText().equals("Pentium")){
                    codelabelverif.setText("Produsl este in stock");
                }
                else {
                    codelabelverif.setText("Produsl nu este in stock");
                }
            }
        });

        backMeniuButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
                verificarestocklabel.setVisible(false);
                verificareButton.setVisible(false);
                codelabelverif.setVisible(false);
                codeverif.setVisible(false);
                backMeniuButton2.setVisible(false);
            }
        });

        verificareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        stergereElementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(false);
                verificareSumaButton.setVisible(false);
                verificareStockButton.setVisible(false);
                stergereElementButton.setVisible(false);
                finalizareComandaButton.setVisible(false);
                listaProduseButton.setVisible(false);
                stergerelabel.setVisible(true);
                stergereprodus.setVisible(true);
                stergereprodusButton.setVisible(true);
                backmeniu4Button.setVisible(true);
            }
        });

        stergereprodusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(stergereprodus.getText().equals("i7")){
                    stergereprodus2.setVisible(true);
                }
            }
        });

        backmeniu4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
                stergerelabel.setVisible(false);
                stergereprodus.setVisible(false);
                stergereprodusButton.setVisible(false);
                backmeniu4Button.setVisible(false);
                stergereprodus2.setVisible(false);
            }
        });

        finalizareComandaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(false);
                verificareSumaButton.setVisible(false);
                verificareStockButton.setVisible(false);
                stergereElementButton.setVisible(false);
                finalizareComandaButton.setVisible(false);
                listaProduseButton.setVisible(false);
                nuButton.setVisible(true);
                daButton.setVisible(true);
                labelulfinal.setVisible(true);


            }
        });

        daButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelulfinal.setText("Comanda a fost finalizata contra sumei:" + suma);
            }
        });

        nuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adaugareCosButton.setVisible(true);
                verificareSumaButton.setVisible(true);
                verificareStockButton.setVisible(true);
                stergereElementButton.setVisible(true);
                finalizareComandaButton.setVisible(true);
                listaProduseButton.setVisible(true);
                nuButton.setVisible(false);
                daButton.setVisible(false);
                labelulfinal.setVisible(false);
            }
        });
    }
}
