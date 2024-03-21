package everycoding;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame_array extends JFrame {
	private Image array_background = new ImageIcon(Main.class.getResource("../images/array1_background.png")).getImage(); // 배경그림경로

	private ImageIcon home_button = new ImageIcon(Main.class.getResource("../images/home_button.png")); // icon화
	private ImageIcon array1_button = new ImageIcon(Main.class.getResource("../images/array1_button.png"));
	private ImageIcon array2_button = new ImageIcon(Main.class.getResource("../images/array2_button.png"));

	private JButton homebutton = new JButton(home_button); // home 버튼 생성
	private JButton array1button = new JButton(array1_button);
	private JButton array2button = new JButton(array2_button);

	public Frame_array() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("배열"); // 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(homebutton);// JFrame에 버튼 추가
		homebutton.setBounds(1059, 577, 60, 70);// 버튼위치 (x좌표, y좌표, 가로, 세로)
		homebutton.setBorderPainted(false);// 버튼의 외곽선을 없애준다
		homebutton.setContentAreaFilled(false);// 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		homebutton.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		homebutton.addMouseListener(new MouseAdapter() {// 마우스의 액션
			@Override
			public void mouseEntered(MouseEvent e) {
				homebutton.setIcon(home_button);
				homebutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				homebutton.setIcon(home_button);
				homebutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				new Start();
				setVisible(false);
			}
		});

		add(array1button);
		array1button.setBounds(340, 250, 620, 190);
		array1button.setBorderPainted(false);
		array1button.setContentAreaFilled(false);
		array1button.setFocusPainted(false);
		array1button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array1button.setIcon(array1_button);
				array1button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array1button.setIcon(array1_button);
				array1button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				new Frame_array1();
				setVisible(false);
			}
		});

		add(array2button);
		array2button.setBounds(320, 420, 660, 195);
		array2button.setBorderPainted(false);
		array2button.setContentAreaFilled(false);
		array2button.setFocusPainted(false);
		array2button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array2button.setIcon(array2_button);
				array2button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array2button.setIcon(array2_button);
				array2button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				new Frame_array2();
				setVisible(false);
			}
		});

	}

	public void paint(Graphics g) {
		g.drawImage(array_background, 0, 0, null);
	}
	
	public static void main(String args[]) {
		new Frame_array();
	}

}
