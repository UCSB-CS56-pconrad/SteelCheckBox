package edu.ucsb.cs56.pconrad.checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.DefaultCaret;

import eu.hansolo.custom.*;
import eu.hansolo.tools.*;

public class Demo {
	public static void main (String[] args){
		JFrame frame = new JFrame ();
		
		SteelCheckBox checkBox1 = new SteelCheckBox();
		checkBox1.setText("");
		checkBox1.setSelected(true);
		frame.getContentPane().add(checkBox1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.pack();
		frame.setSize(300, 300);
		frame.setVisible(true);
		

	}
}