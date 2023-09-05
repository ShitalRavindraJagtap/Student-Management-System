
// Java program to implement a GUI
// application for the student
// management system
import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.*;
import java.io.*;
import java.io.IOException;

// Creating the fee class
public class fee extends Frame {
    JLabel l1, l2, l3, l4,
            l5, l6, l7, l8,
            l9, l10, l12, l13,
            l14, l11, l15;
    JTextField tf1, tf2, tf3,
            tf4, tf5, tf6,
            tf7, tf8, tf9,
            tf10;
    JTextArea area2, area1;
    JRadioButton rb1, rb2, rb3,
            rb4, rb5, rb6,
            rb7;
    JFileChooser f1;

    // Default constructor to
    // initialize the parameters
    fee() {
        this.l1 = new JLabel("Fee Report");
        this.l1.setBounds(550, 100, 250, 20);
        this.l2 = new JLabel(
                "Name of the Student:");
        this.l2.setBounds(50, 150, 250, 20);
        this.tf1 = new JTextField();
        this.tf1.setBounds(250, 150, 250, 20);
        this.l3 = new JLabel(
                "Name of the Father:");
        this.l3.setBounds(50, 200, 250, 20);
        this.tf2 = new JTextField();
        this.tf2.setBounds(250, 200, 250, 20);
        this.l4 = new JLabel("Roll Number:");
        this.l4.setBounds(50, 250, 250, 20);
        this.tf3 = new JTextField();
        this.tf3.setBounds(250, 250, 250, 20);
        this.l5 = new JLabel("Email ID:");
        this.l5.setBounds(50, 300, 250, 20);
        this.tf4 = new JTextField();
        this.tf4.setBounds(250, 300, 250, 20);
        this.l6 = new JLabel("Contact Number:");
        this.l6.setBounds(50, 350, 250, 20);
        this.tf5 = new JTextField();
        this.tf5.setBounds(250, 350, 250, 20);
        this.l7 = new JLabel("Address:");
        this.l7.setBounds(50, 400, 250, 20);
        this.area1 = new JTextArea();
        this.area1.setBounds(250, 400, 250, 90);
        this.l9 = new JLabel("Gender:");
        this.l9.setBounds(50, 500, 250, 20);
        JRadioButton r5 = new JRadioButton(" Male");
        JRadioButton r6 = new JRadioButton(" Female");
        r5.setBounds(250, 500, 100, 30);
        r6.setBounds(350, 500, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r5);
        bg.add(r6);
        this.l10 = new JLabel("Nationality:");
        this.l10.setBounds(50, 550, 250, 20);
        this.tf6 = new JTextField();
        this.tf6.setBounds(250, 550, 250, 20);
        this.l11 = new JLabel(
                "Year of passing 10th");
        this.l11.setBounds(50, 600, 250, 20);
        String language[] = { "2016", "2015", "2014" };
        final JComboBox cb1 = new JComboBox(language);
        cb1.setBounds(250, 600, 90, 20);
        this.l12 = new JLabel(
                "Year of passing 12th");
        this.l12.setBounds(50, 650, 250, 20);
        String languagess[] = { "2019", "2018", "2017" };
        this.l13 = new JLabel(
                "Points Secured in 10th:");
        this.l13.setBounds(50, 700, 250, 20);
        this.tf7 = new JTextField();
        this.tf7.setBounds(250, 700, 250, 20);
        this.l14 = new JLabel("Percentage in 12th:");
        this.l14.setBounds(50, 750, 250, 20);
        this.tf8 = new JTextField();
        this.tf8.setBounds(250, 750, 250, 20);
        ImageIcon i2 = new ImageIcon("2.png");
        JLabel l15 = new JLabel("", i2, JLabel.CENTER);
        l15.setBounds(900, 50, 600, 200);
        final JComboBox cb2 = new JComboBox(languagess);
        cb2.setBounds(250, 650, 90, 20);
        this.l8 = new JLabel(
                "Groups Offered here are:");
        this.l8.setBounds(800, 150, 250, 20);
        this.rb1 = new JRadioButton("SEAS");
        this.rb1.setBounds(550, 150, 100, 30);
        this.rb2 = new JRadioButton("SLABS");
        this.rb2.setBounds(650, 150, 100, 30);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(this.rb1);
        bg1.add(this.rb2);
        this.rb3 = new JRadioButton("HOSTELLER");
        this.rb3.setBounds(550, 200, 100, 30);
        this.rb4 = new JRadioButton("DAY SCHOLAR");
        this.rb4.setBounds(650, 200, 120, 30);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(this.rb3);
        bg2.add(this.rb4);
        String languages[] = { "CSE", "ECE", "EEE",
                "CIVIL", "MECH" };
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(800, 200, 90, 20);
        final JLabel label = new JLabel();
        label.setBounds(600, 430, 500, 30);
        JButton b = new JButton("Show");
        b.setBounds(1000, 300, 80, 30);
        final DefaultListModel<String> li1 = new DefaultListModel<>();
        li1.addElement("CSE(2, 50, 000)");
        li1.addElement("ECE(2, 50, 000)");
        li1.addElement("EEE(2, 50, 000)");
        li1.addElement("MECH(2, 50, 000)");
        li1.addElement("CIVIL(2, 50, 000)");
        final JList<String> list1 = new JList<>(li1);
        list1.setBounds(600, 300, 125, 125);
        DefaultListModel<String> li2 = new DefaultListModel<>();
        li2.addElement(
                "2 SHARE(1, 50, 000)");
        li2.addElement(
                "3 SHARE(1, 40, 000)");
        li2.addElement(
                "5 SHARE(1, 20, 000)");
        li2.addElement(
                "8 SHARE(1, 10, 000)");
        li2.addElement(
                "bus(40, 000)");
        final JList<String> list2 = new JList<>(li2);
        list2.setBounds(
                800, 300, 125, 125);
        JButton Receipt = new JButton("Generate Receipt");
        Receipt.setBounds(600, 490, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(750, 490, 150, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(900, 490, 150, 30);
        this.area2 = new JTextArea();
        this.area2.setBounds(600, 540, 450, 240);
        this.add(this.l1);
        this.add(this.l2);
        this.add(this.l3);
        this.add(this.l4);
        this.add(this.l5);
        this.add(this.l6);
        this.add(this.l7);
        this.add(this.l8);
        this.add(this.l9);
        this.add(this.l10);
        this.add(this.l11);
        this.add(this.l12);
        this.add(this.l13);
        this.add(this.l14);
        this.add(this.tf1);
        this.add(this.tf2);
        this.add(this.tf3);
        this.add(this.tf4);
        this.add(this.tf5);
        this.add(this.tf6);
        this.add(this.tf7);
        this.add(this.tf8);
        this.add(this.area1);
        this.add(this.area2);
        this.add(l15);
        this.add(this.rb1);
        this.add(this.rb2);
        this.add(this.rb3);
        this.add(this.rb4);
        this.add(r5);
        this.add(r6);
        this.add(cb);
        this.add(cb1);
        this.add(cb2);
        this.add(list1);
        this.add(list2);
        this.add(b);
        this.add(label);
        this.add(Receipt);
        this.add(b2);
        this.add(Print);
        b.addActionListener(new ActionListener() {
            // Method to display the data
            // entered in the text fields
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (list1.getSelectedIndex() != -1) {
                    data = "You had selected the Group:"
                            + list1.getSelectedValue();
                    label.setText(data);
                }
                if (list2.getSelectedIndex() != -1) {
                    data += " and Hostel with the "
                            + "facility of: ";
                    for (Object frame : list2.getSelectedValues()) {
                        data += frame + " ";
                    }
                }
                label.setText(data);
            }
        });
        // Reset the text fields
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e) {
                        fee.this.area2.setText("");
                        fee.this.area1.setText(" ");
                        fee.this.tf1.setText("");
                        fee.this.tf2.setText("");
                        fee.this.tf3.setText("");
                        fee.this.tf4.setText("");
                        fee.this.tf5.setText("");
                        fee.this.tf6.setText(" ");
                    }
                });
        // Implementing the Print action
        Print.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e) {
                        try {
                            fee.this.area2.print();
                        } catch (java.awt.print.PrinterException a) {
                            System.err.format(
                                    "NoPrinter Found",
                                    a.getMessage());
                        }
                    }
                });
        // Generating the receipt
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fee.this.area2.setText(
                        "--------------------------------"
                                + "-----------FEE RECEIPT----"
                                + "--------------------------"
                                + "--------------------------"
                                + "-------------------\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Student Name: "
                        + fee.this.tf1.getText()
                        + "\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Father's Name: "
                        + fee.this.tf2.getText()
                        + "\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "RollNumber: "
                        + fee.this.tf3.getText()
                        + "\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Email ID: "
                        + fee.this.tf4.getText()
                        + "\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Contact Number: "
                        + fee.this.tf5.getText()
                        + "\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Wants to take: "
                        + cb.getSelectedItem()
                                .toString()
                        + "\n");
                if (fee.this.rb1.isSelected()) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + "Wants to Join in "
                            + "School of Engineering "
                            + "and Applied Sciences\n");
                }
                if (fee.this.rb2.isSelected()) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + "Wants to Join in "
                            + "School of Liberal "
                            + "Arts and Sciences\n");
                }
                if (fee.this.rb3.isSelected()) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + "Wants to be a "
                            + "Hosteller \n");
                }
                if (fee.this.rb4.isSelected()) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + "Wants to be a "
                            + "Day Scholar \n");
                }
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Had chosen: "
                        + list1.getSelectedValue()
                                .toString()
                        + "\n");
                fee.this.area2.setText(fee.this.area2.getText()
                        + "Had chosen: "
                        + list2.getSelectedValue()
                                .toString()
                        + "\n");
                int index2 = list2.getSelectedIndex();
                if (index2 == 0) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + " "
                            + "Total amount to be "
                            + "paid is 4 Lakhs \n");
                }
                if (index2 == 1) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + " "
                            + "Total amount to be paid "
                            + "is 3.9 Lakhs \n");
                }
                if (index2 == 2) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + " "
                            + "Total amount to be paid "
                            + "is 3.8 Lakhs \n");
                }
                if (index2 == 3) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + " "
                            + "Total amount to be paid "
                            + "is 3.7 Lakhs \n");
                }
                if (index2 == 4) {
                    fee.this.area2.setText(fee.this.area2.getText()
                            + " "
                            + "Total amount to be paid "
                            + "is 2.9 Lakhs \n");
                }
                if (e.getSource() == Receipt) {
                    try {
                        FileWriter fw = new FileWriter(
                                "java.txt", true);
                        fw.write(fee.this.area2.getText());
                        fw.close();
                    } catch (Exception ae) {
                        System.out.println(ae);
                    }
                }
                JOptionPane.showMessageDialog(
                        fee.this.area2, "DATA SAVED SUCCESSFULLY");
            };
        });
        this.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(
                            WindowEvent we) {
                        System.exit(0);
                    }
                });
        this.setSize(800, 800);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        new fee();
    }
}