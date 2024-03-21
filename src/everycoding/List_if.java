package everycoding;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class List_if extends JFrame {
	private Image if_list = new ImageIcon(Main.class.getResource("../images/if_list.png")).getImage();

	private ImageIcon if_button1 = new ImageIcon(Main.class.getResource("../images/if_button1.png"));
	private ImageIcon if_button2 = new ImageIcon(Main.class.getResource("../images/if_button2.png"));
	private ImageIcon if_button3 = new ImageIcon(Main.class.getResource("../images/if_button3.png"));
	private ImageIcon if_button4 = new ImageIcon(Main.class.getResource("../images/if_button4.png"));
	private ImageIcon if_button5 = new ImageIcon(Main.class.getResource("../images/if_button5.png"));
	private ImageIcon if_button6 = new ImageIcon(Main.class.getResource("../images/if_button6.png"));
	private ImageIcon if_button7 = new ImageIcon(Main.class.getResource("../images/if_button7.png"));
	private ImageIcon back_button = new ImageIcon(Main.class.getResource("../images/back_button.png"));

	private JButton ifbutton1 = new JButton(if_button1);
	private JButton ifbutton2 = new JButton(if_button2);
	private JButton ifbutton3 = new JButton(if_button3);
	private JButton ifbutton4 = new JButton(if_button4);
	private JButton ifbutton5 = new JButton(if_button5);
	private JButton ifbutton6 = new JButton(if_button6);
	private JButton ifbutton7 = new JButton(if_button7);
	private JButton backbutton = new JButton(back_button);

	static int num;

	public List_if() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("if문 예문");// 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(ifbutton1);// JFrame에 버튼 추가
		ifbutton1.setBounds(158, 240, 460, 100);// 버튼위치 (x좌표, y좌표, 가로, 세로)
		ifbutton1.setBorderPainted(false); // 버튼의 외곽선을 없애준다
		ifbutton1.setContentAreaFilled(false);// 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		ifbutton1.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		ifbutton1.addMouseListener(new MouseAdapter() { // 마우스의 역사
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton1.setIcon(if_button1);
				ifbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton1.setIcon(if_button1);
				ifbutton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				List_if.num = 1;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(ifbutton2);
		ifbutton2.setBounds(158, 340, 460, 100);
		ifbutton2.setBorderPainted(false);
		ifbutton2.setContentAreaFilled(false);
		ifbutton2.setFocusPainted(false);
		ifbutton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton2.setIcon(if_button2);
				ifbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton2.setIcon(if_button2);
				ifbutton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_if.num = 2;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(ifbutton3);
		ifbutton3.setBounds(158, 440, 460, 100);
		ifbutton3.setBorderPainted(false);
		ifbutton3.setContentAreaFilled(false);
		ifbutton3.setFocusPainted(false);
		ifbutton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton3.setIcon(if_button3);
				ifbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton3.setIcon(if_button3);
				ifbutton3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_if.num = 3;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(ifbutton4);
		ifbutton4.setBounds(158, 540, 460, 108);
		ifbutton4.setBorderPainted(false);
		ifbutton4.setContentAreaFilled(false);
		ifbutton4.setFocusPainted(false);
		ifbutton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton4.setIcon(if_button4);
				ifbutton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton4.setIcon(if_button4);
				ifbutton4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_if.num = 4;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(ifbutton5);
		ifbutton5.setBounds(650, 240, 467, 100);
		ifbutton5.setBorderPainted(false);
		ifbutton5.setContentAreaFilled(false);
		ifbutton5.setFocusPainted(false);
		ifbutton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton5.setIcon(if_button5);
				ifbutton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton5.setIcon(if_button5);
				ifbutton5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_if.num = 5;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(ifbutton6);
		ifbutton6.setBounds(650, 340, 467, 100);
		ifbutton6.setBorderPainted(false);
		ifbutton6.setContentAreaFilled(false);
		ifbutton6.setFocusPainted(false);
		ifbutton6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton6.setIcon(if_button6);
				ifbutton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton6.setIcon(if_button6);
				ifbutton6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_if.num = 6;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(ifbutton7);
		ifbutton7.setBounds(650, 442, 467, 100);
		ifbutton7.setBorderPainted(false);
		ifbutton7.setContentAreaFilled(false);
		ifbutton7.setFocusPainted(false);
		ifbutton7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ifbutton7.setIcon(if_button7);
				ifbutton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ifbutton7.setIcon(if_button7);
				ifbutton7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_if.num = 6;
				new Listbutton_if();
				setVisible(false);
			}
		});

		add(backbutton);
		backbutton.setBounds(1050, 582, 70, 70);
		backbutton.setBorderPainted(false);
		backbutton.setContentAreaFilled(false);
		backbutton.setFocusPainted(false);
		backbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backbutton.setIcon(back_button);
				backbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				backbutton.setIcon(back_button);
				backbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				new List_aframe();
				setVisible(false);
			}
		});

	}

	public void paint(Graphics g) {
		g.drawImage(if_list, 0, 0, null);
	}

}
