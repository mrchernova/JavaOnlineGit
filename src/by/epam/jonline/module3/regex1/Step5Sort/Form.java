package by.epam.jonline.module3.regex1.Step5Sort;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Form extends JFrame {
    JRadioButton sortParagraph;
    JRadioButton sortSentences;
    JRadioButton sortLexems;
    JLabel outputLabel;

    JTextArea inputArea, outputArea;

    JButton btnRead;
    JButton btnSave;

    JPanel content1;


    public Form() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 500, 600, 400);

        content1 = new JPanel();

        inputArea = new JTextArea(13, 50);
        outputArea = new JTextArea(3, 50);

        content1.add(new JScrollPane(inputArea));   //add inputArea

        setContentPane(content1);

        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);


        btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveToFile.saveToFile(inputArea.getText());
            }
        });
        content1.add(btnSave);
        //btnSave.setEnabled(false);


        btnRead = new JButton("Read");
        btnRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = ReadFromFile.readFromFile();
                inputArea.setText(s);
            }
        });
        content1.add(btnRead);


        /* RadioButton */

        sortParagraph = new JRadioButton("sortParagraph");
        sortSentences = new JRadioButton("sortSentences");
        sortLexems = new JRadioButton("sortLexems");


        ButtonGroup group = new ButtonGroup();
        group.add(sortParagraph);
        group.add(sortSentences);
        group.add(sortLexems);

        content1.add(sortParagraph);
        content1.add(sortSentences);
        content1.add(sortLexems);

        sortParagraph.addActionListener(this::actionPerformed);
        sortSentences.addActionListener(this::actionPerformed);
        sortLexems.addActionListener(this::actionPerformed);




    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sortParagraph) {
            String s = ReadFromFile.readFromFile();
            outputArea.setText(SortParagraph.sortParagraph(s));

        } else if (e.getSource() == sortSentences) {
            String s = ReadFromFile.readFromFile();
            SortSentences.sortSentences(s);

        } else if (e.getSource() == sortLexems) {
            String s = ReadFromFile.readFromFile();
            SortLexems.sortLexems(s);
        }

    }



}