package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    
    static String n1;
    static String op1;

    public static void main(String[] args) {

        Frame f = new Frame();

        f.setTitle("Calculator");
        f.setSize(250, 350);
        f.setLocation(400, 250);

        f.setLayout(null);

        Panel p1 = new Panel();
        p1.setSize(220, 50);
        p1.setLocation(15, 35);
        p1.setLayout(null);

        Color c1 = new Color(85, 239, 196);
        p1.setBackground(c1);
        f.add(p1);
        f.setResizable(false);

        //----------text field-----------//
        TextField tf = new TextField("0");
        tf.setSize(210, 40);
        tf.setLocation(5, 5);
        Font font = new Font("Arial", 2, 25);
        tf.setFont(font);
//        tf.setEditable(false);
        tf.setFocusable(false);
        p1.add(tf);
        //----------text field-----------//

        Panel p2 = new Panel();
        p2.setSize(220, 250);
        p2.setLocation(15, 90);

        Color c2 = new Color(85, 200, 210);
        p2.setBackground(c2);

//        GridLayout gl = new GridLayout(5, 4);
        GridLayout gl = new GridLayout(5, 4, 3, 3);
        p2.setLayout(gl);

        f.add(p2);

        //---------Buttons----------//
        Font font2 = new Font("Arial", 1, 22);
        Color bcolor1 = new Color(100, 200, 255);
        Color bcolor2 = new Color(135, 170, 80);
        //******************************
        Button b1 = new Button();
        b1.setLabel("CE");
        b1.setFont(font2);
        b1.setForeground(bcolor1);
        p2.add(b1);

        Button b2 = new Button();
        b2.setLabel("C");
        b2.setFont(font2);
        b2.setForeground(bcolor1);
        p2.add(b2);

        Button b3 = new Button();
        b3.setLabel("x");
        b3.setFont(font2);
        b3.setForeground(bcolor1);
        p2.add(b3);

        Button b4 = new Button();
        b4.setLabel("÷");
        b4.setFont(font2);
        b4.setForeground(bcolor2);
        p2.add(b4);
        //******************************

        //******************************
        Button b5 = new Button();
        b5.setLabel("7");
        b5.setFont(font2);
        p2.add(b5);

        Button b6 = new Button();
        b6.setLabel("8");
        b6.setFont(font2);
        p2.add(b6);

        Button b7 = new Button();
        b7.setLabel("9");
        b7.setFont(font2);
        p2.add(b7);

        Button b8 = new Button();
        b8.setLabel("x");
        b8.setFont(font2);
        b8.setForeground(bcolor2);
        p2.add(b8);
        //******************************

        //******************************
        Button b9 = new Button();
        b9.setLabel("4");
        b9.setFont(font2);
        p2.add(b9);

        Button b10 = new Button();
        b10.setLabel("5");
        b10.setFont(font2);
        p2.add(b10);

        Button b11 = new Button();
        b11.setLabel("6");
        b11.setFont(font2);
        p2.add(b11);

        Button b12 = new Button();
        b12.setLabel("-");
        b12.setFont(font2);
        b12.setForeground(bcolor2);
        p2.add(b12);
        //******************************

        //******************************
        Button b13 = new Button();
        b13.setLabel("1");
        b13.setFont(font2);
        p2.add(b13);

        Button b14 = new Button();
        b14.setLabel("2");
        b14.setFont(font2);
        p2.add(b14);

        Button b15 = new Button();
        b15.setLabel("3");
        b15.setFont(font2);
        p2.add(b15);

        Button b16 = new Button();
        b16.setLabel("+");
        b16.setFont(font2);
        b16.setForeground(bcolor2);
        p2.add(b16);
        //******************************

        //******************************
        Button b17 = new Button();
        b17.setLabel("±");
        b17.setFont(font2);
        b17.setForeground(bcolor1);
        p2.add(b17);

        Button b18 = new Button();
        b18.setLabel("0");
        b18.setFont(font2);
        p2.add(b18);

        Button b19 = new Button();
        b19.setLabel(".");
        b19.setFont(font2);
        b19.setForeground(bcolor1);
        p2.add(b19);

        Button b20 = new Button();
        b20.setLabel("=");
        b20.setFont(font2);
        b20.setForeground(bcolor2);
        p2.add(b20);
        //******************************

        //---------Buttons----------//
        ActionListener a1 = new ActionListener() {   //CE

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                tf.setText("0");
            }
        };
        b1.addActionListener(a1);

        ActionListener a2 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                tf.setText("0");

            }
        };
        b2.addActionListener(a2);

        ActionListener a3 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                t = t.substring(0, t.length() - 1);
                if(t.length()>2){   
                tf.setText(t);
                }
                else{
                    tf.setText("0");
                }
            }
        };
        b3.addActionListener(a3);

        ActionListener a4 = new ActionListener() {        //÷

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = tf.getText();
                op1 = "÷";
                tf.setText("");                 
            }
        };
        b4.addActionListener(a4);

        ActionListener a5 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                if(t.equals("0")){
                    tf.setText("7");
                }
                else{
                    tf.setText(t + "7");
                }
            }
        };
        b5.addActionListener(a5);

        ActionListener a6 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("8");
                }
                else{
                    tf.setText(t + "8");
                }
                
            }
        };
        b6.addActionListener(a6);

        ActionListener a7 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("9");
                }
                else{
                    tf.setText(t + "9");
                }
                
            }
        };
        b7.addActionListener(a7);

        ActionListener a8 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = tf.getText();
                op1 = "*";
                tf.setText("");    
            }
        };
        b8.addActionListener(a8);

        ActionListener a9 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("4");
                }
                else{
                    tf.setText(t + "4");
                }
                
            }
        };
        b9.addActionListener(a9);

        ActionListener a10 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("5");
                }
                else{
                    tf.setText(t + "5");
                }
                
            }
        };
        b10.addActionListener(a10);

        ActionListener a11 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("6");
                }
                else{
                    tf.setText(t + "6");
                }
                
            }
        };
        b11.addActionListener(a11);

        
        ActionListener a12 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = tf.getText();
                op1 = "-";
                tf.setText(""); 
            }
        };
        b12.addActionListener(a12);

        
        ActionListener a13 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("1");
                }
                else{
                    tf.setText(t + "1");
                }
                
            }
        };
        b13.addActionListener(a13);

        
        ActionListener a14 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("2");
                }
                else{
                    tf.setText(t + "2");
                }
                
            }
        };
        b14.addActionListener(a14);

        
        ActionListener a15 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
                if(t.equals("0")){
                    tf.setText("3");
                }
                else{
                    tf.setText(t + "3");
                }
                
            }
        };
        b15.addActionListener(a15);

        
        ActionListener a16 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = tf.getText();
                op1 = "+";
                tf.setText("");     
            }
        };
        b16.addActionListener(a16);

        
        ActionListener a17 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t =tf.getText();
                
                if(t.isEmpty() || t.equals("0")){
                }
                else{
                char c = t.charAt(0);
                
                 String sub = t.substring(1);
                if(c=='-'){
                    tf.setText(sub);
                }
                else{
                    tf.setText("-"+ t);
                }
                
                }
            }
        };
        b17.addActionListener(a17);

        
        ActionListener a18 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String t = tf.getText();
                
//                if(t.isEmpty()){
//                    tf.setText("0");
//                }
                
                if(!t.equals("0")){
                 tf.setText(t + "0");
                }
            }
        };
        b18.addActionListener(a18);

        
        ActionListener a19 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 String t = tf.getText();
                 tf.setText(t + ".");
            }
        };
        b19.addActionListener(a19);

        
        ActionListener a20 = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String n2 = tf.getText();
                 double d1 = Double.parseDouble(n1);
                 double d2 = Double.parseDouble(n2);
                 double ans=0;
                if(op1.equals("+")){
                   ans = d1 + d2;
                   
                }
                else if(op1.equals("-")){
                    ans = d1 - d2;
                }
                else if(op1.equals("÷")){
                    ans = d1 / d2;
                }
                else if(op1.equals("*")){
                    ans = d1 * d2;
                }
                
                tf.setText(String.valueOf(ans));
            }
        };
        b20.addActionListener(a20);

        f.setVisible(true);
    }
}
