

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class demo extends JFrame{
	private JLabel lblorderid;
	private JLabel lblorderid1;
	
	private JButton btnSearch;
	private JButton btnSearch1;
	private JButton btnSearch2;
	
	demo(){
		setSize(350,200);
		setTitle("Search Option");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
	
		JPanel lblPanel=new JPanel(new GridLayout(6,1));
		lblorderid=new JLabel("        ");
		lblorderid.setFont(new Font("",1,15));
		lblPanel.add(lblorderid);
		lblorderid1=new JLabel("        Please Select the Option ");
		lblorderid1.setFont(new Font("",1,15));
		lblPanel.add(lblorderid1);
		
		add("North",lblPanel);
		
		//----------------------------------------------
		JPanel btnPanel=new JPanel();
		btnSearch=new JButton("Search Customer");
		btnSearch.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnSearch.setFont(new Font("",1,10));
		btnSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new demo().setVisible(true);
			}
		});
		btnPanel.add(btnSearch);
		
		
		
		
		btnSearch1=new JButton("Search Order");
		btnSearch.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnSearch1.setFont(new Font("",1,10));
		btnSearch1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new demo().setVisible(true);
			}
		});
		btnPanel.add(btnSearch1);
		
		
		
		btnSearch2=new JButton("Cancel");
		btnSearch.setLayout(new FlowLayout(FlowLayout.LEFT));
		btnSearch2.setFont(new Font("",1,10));
		btnSearch2.setBackground(Color.RED);
		btnSearch2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new demo().setVisible(true);
			}
		});
		btnPanel.add(btnSearch2);
		
		add("South",btnPanel);
    }

        public static void main(String args[]){


        }
	

		
	


}
