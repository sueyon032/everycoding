package everycoding;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class List_aframe extends JFrame {
	private Image list_background = new ImageIcon(Main.class.getResource("../images/list_background.png")).getImage();

	private ImageIcon for_button = new ImageIcon(Main.class.getResource("../images/for_button.png"));
	private ImageIcon if_button = new ImageIcon(Main.class.getResource("../images/if_button.png"));
	private ImageIcon array_button = new ImageIcon(Main.class.getResource("../images/array_button.png"));
	private ImageIcon home_button = new ImageIcon(Main.class.getResource("../images/home_button.png"));

	private JButton forbutton = new JButton(for_button);
	private JButton ifbutton = new JButton(if_button);
	private JButton arraybutton = new JButton(array_button);
	private JButton homebutton = new JButton(home_button);

	public List_aframe() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("예문");// 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(forbutton);// JFrame에 버튼 추가
		forbutton.setBounds(350, 230, 620, 190); // 버튼위치 (x좌표, y좌표, 가로, 세로)
		forbutton.setBorderPainted(false); // 버튼의 외곽선을 없애준다
		forbutton.setContentAreaFilled(false);// 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		forbutton.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		forbutton.addMouseListener(new MouseAdapter() { // 마우스의 액션
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton.setIcon(for_button);
				forbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton.setIcon(for_button);
				forbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {

				new List_for();
				setVisible(false);
			}
		});

		add(ifbutton);
		ifbutton.setBounds(325, 360, 660, 195);
		ifbutton.setBorderPainted(false);
		ifbutton.setContentAreaFilled(false);
		ifbutton.setFocusPainted(false);
		ifbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton.setIcon(if_button);
				ifbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton.setIcon(if_button);
				ifbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new List_if();
				setVisible(false);
			}
		});

		add(arraybutton);
		arraybutton.setBounds(300, 535, 700, 100);
		arraybutton.setBorderPainted(false);
		arraybutton.setContentAreaFilled(false);
		arraybutton.setFocusPainted(false);
		arraybutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				arraybutton.setIcon(array_button);
				arraybutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				arraybutton.setIcon(array_button);
				arraybutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseClicked(MouseEvent e) {
				new List_array();
				setVisible(false);
			}
		});

		add(homebutton);
		homebutton.setBounds(1070, 590, 70, 70);
		homebutton.setBorderPainted(false);
		homebutton.setContentAreaFilled(false);
		homebutton.setFocusPainted(false);
		homebutton.addMouseListener(new MouseAdapter() {
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

	}

	public void paint(Graphics g) {
		g.drawImage(list_background, 0, 0, null);
	}

}
