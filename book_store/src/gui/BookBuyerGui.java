/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Wodo
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import agents.BookBuyerAgent;
import javax.swing.JTextArea;

public class BookBuyerGui extends JFrame {
    private BookBuyerAgent myAgent;
    private JTextField titleField;
    //private JTextArea textConsole;
    
    public BookBuyerGui (BookBuyerAgent a) {
        super(a.getLocalName());
		
		myAgent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("Book title:"));
		titleField = new JTextField(15);
                //textConsole = new JTextArea();
		p.add(titleField);
                //p.add(textConsole);
		
		getContentPane().add(p, BorderLayout.CENTER);
                
                JButton addButton = new JButton("Buy");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					//String title = "";
                                        //if ( !titleField.getText().trim().isEmpty() ) {
                                            String title = titleField.getText().trim(); //get title
                                            JOptionPane.showMessageDialog(BookBuyerGui.this, title);
                                            myAgent.setTitle(title);
                                            myAgent.setGuiContinue();
                                            titleField.setText(""); //borrar
                                        //}					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(BookBuyerGui.this, "Invalid value","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
                
                p = new JPanel();
		p.add(addButton);
		getContentPane().add(p, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {
		    myAgent.doDelete();
		  }
		});
		
		setResizable(false);
    }
    
    public void showGui() {
	  pack();
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  int centerX = (int)screenSize.getWidth() / 2;
	  int centerY = (int)screenSize.getHeight() / 2;
	  
	  setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
	  super.setVisible(true);
	}
        
}
