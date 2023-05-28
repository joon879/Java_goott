package com.tech.tab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame{

	JTextField jtf1 = null;
	
	public LoginScreen() {
	      
	      setTitle("제품관리 시스템");
	      
	      JPanel title = new JPanel();
	      JLabel login = new JLabel("로그인 화면");
	      login.setForeground(new Color(5, 0, 153));
	      login.setFont(new Font("휴먼편지체", Font.BOLD, 25));
	      title.add(login);

	      JPanel jp1 = new JPanel();
	      jp1.setLayout(new GridLayout(3, 2));
	      
	      JPanel idPanel = 
	         new JPanel(new FlowLayout(FlowLayout.RIGHT));
	      JLabel jlb1 = new JLabel("아이디 : ", JLabel.CENTER);
	      
	      idPanel.add(jlb1);
	      
	      JPanel idPanel2 = 
	            new JPanel(new FlowLayout(FlowLayout.LEFT));
	      jtf1 = new JTextField(10);
	         
	      idPanel2.add(jtf1);
	      
	      jp1.add(idPanel); jp1.add(idPanel2);
	      
	      JPanel pwdPanel = 
	         new JPanel(new FlowLayout(FlowLayout.RIGHT));
	      JLabel jlb2 = new JLabel("비밀번호 : ", JLabel.CENTER);
	      JPanel pwdPanel2 = 
	            new JPanel(new FlowLayout(FlowLayout.LEFT));
	      JPasswordField jtf2 = new JPasswordField(10);
	      
	      pwdPanel.add(jlb2); pwdPanel2.add(jtf2);
	      
	      jp1.add(pwdPanel); jp1.add(pwdPanel2);
	      
	      
	      JPanel loginPanel = 
	            new JPanel(new FlowLayout(FlowLayout.RIGHT));
	      JButton jLogin = new JButton("로그인");
	      
	      JPanel joinPanel = 
	            new JPanel(new FlowLayout(FlowLayout.LEFT));
	      JButton join = new JButton("회원가입");
	      loginPanel.add(jLogin); joinPanel.add(join);
	      jp1.add(loginPanel); jp1.add(joinPanel);
	      
	      
	      JPanel jp2 = new JPanel();
	      jp2.setLayout(new FlowLayout());
	      jp2.add(jp1);
	      
	      setLayout(new BorderLayout());
	      
	      add(title, BorderLayout.NORTH);
	      add(jp2, BorderLayout.CENTER);
	      
	      setBounds(200, 200, 300, 250);
	      
	      setResizable(false);
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      setVisible(true);
	      
	      jLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("loginnnnnn");
				String myId = jtf1.getText();
				String myPwd = new String(jtf2.getPassword());
//				System.out.println(myId+":"+myPwd);
				if (myId.equals("blue1") && myPwd.equals("111")) {
					
					//화면전환
					new MainClass();
					dispose(); //자신의 화면 제거.
				}
				else { //비번 틀렸을 때 나오게 하는 화면(틀린 비번을 출력)
					JOptionPane.showMessageDialog(null, "아이디: "+myId+", 비밀번호: "+myPwd);
				}
				
			}
		});
	      join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("joinnnnnnn");
				
				new JoinScreen();
				dispose();
				
				
			}
		});
	      
	}
	
}
