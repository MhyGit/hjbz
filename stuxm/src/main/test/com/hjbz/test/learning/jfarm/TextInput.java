package com.hjbz.test.learning.jfarm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextInput extends JFrame {


	private static final int DEFAULT_ROWS = 8;
	private static final int DEFAULT_COLUMNS = 20;


	public TextInput(){
		JTextField textField = new JTextField();
		JPasswordField passWord = new JPasswordField();
		JPanel northpanel = new JPanel();
		northpanel.setLayout(new GridLayout(2,2));

		JLabel useName=new JLabel("UseName: ",SwingConstants.RIGHT);
		northpanel.add(useName);
		northpanel.add(textField);
		northpanel.add(new JLabel("UsePassword: ",SwingConstants.RIGHT));
		northpanel.add(passWord);

		add(northpanel,BorderLayout.NORTH);

		JTextArea text=new JTextArea(DEFAULT_ROWS,DEFAULT_COLUMNS);
		JScrollPane scroll=new JScrollPane(text);

		add(scroll,BorderLayout.CENTER);

		JPanel south=new JPanel();
		JButton insert=new JButton("Insert");
		insert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("UseName : "+textField.getText()+"\n"+
						"UsePossWord : "+ new String(passWord.getPassword())+"\n");
			}
		});
		south.add(insert);
		add(south,BorderLayout.SOUTH);


		pack();
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			TextInput frame=new TextInput();
			frame.setTitle("This is a test.");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(80,100,300,200);
			frame.setVisible(true);
		});
	}


}
