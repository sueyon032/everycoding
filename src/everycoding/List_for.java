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

public class List_for extends JFrame {
	private Image for_list = new ImageIcon(Main.class.getResource("../images/for_list.png")).getImage();

	private ImageIcon for_button1 = new ImageIcon(Main.class.getResource("../images/for_button1.png"));
	private ImageIcon for_button2 = new ImageIcon(Main.class.getResource("../images/for_button2.png"));
	private ImageIcon for_button3 = new ImageIcon(Main.class.getResource("../images/for_button3.png"));
	private ImageIcon for_button4 = new ImageIcon(Main.class.getResource("../images/for_button4.png"));
	private ImageIcon for_button5 = new ImageIcon(Main.class.getResource("../images/for_button5.png"));
	private ImageIcon for_button6 = new ImageIcon(Main.class.getResource("../images/for_button6.png"));
	private ImageIcon back_button = new ImageIcon(Main.class.getResource("../images/back_button.png"));

	private JButton forbutton1 = new JButton(for_button1);
	private JButton forbutton2 = new JButton(for_button1);
	private JButton forbutton3 = new JButton(for_button1);
	private JButton forbutton4 = new JButton(for_button1);
	private JButton forbutton5 = new JButton(for_button1);
	private JButton forbutton6 = new JButton(for_button1);
	private JButton backbutton = new JButton(back_button);

	static int num;

	public List_for() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("for문 예문");// 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(forbutton1);// JFrame에 버튼 추가
		forbutton1.setBounds(158, 240, 460, 100); // 버튼위치 (x좌표, y좌표, 가로, 세로)
		forbutton1.setBorderPainted(false); // 버튼의 외곽선을 없애준다
		forbutton1.setContentAreaFilled(false); // 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		forbutton1.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		forbutton1.addMouseListener(new MouseAdapter() {// 마우스의 액션
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton1.setIcon(for_button1);
				forbutton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton1.setIcon(for_button1);
				forbutton1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				List_for.num = 1;
				new Listbutton_for();
				setVisible(false);
			}
		});

		add(forbutton2);
		forbutton2.setBounds(158, 340, 460, 108);
		forbutton2.setBorderPainted(false);
		forbutton2.setContentAreaFilled(false);
		forbutton2.setFocusPainted(false);
		forbutton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton2.setIcon(for_button2);
				forbutton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton2.setIcon(for_button2);
				forbutton2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_for.num = 2;
				new Listbutton_for();
				setVisible(false);
			}
		});

		add(forbutton3);
		forbutton3.setBounds(158, 440, 460, 100);
		forbutton3.setBorderPainted(false);
		forbutton3.setContentAreaFilled(false);
		forbutton3.setFocusPainted(false);
		forbutton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton3.setIcon(for_button3);
				forbutton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton3.setIcon(for_button3);
				forbutton3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_for.num = 3;
				new Listbutton_for();
				setVisible(false);
			}
		});

		add(forbutton4);
		forbutton4.setBounds(158, 540, 460, 108);
		forbutton4.setBorderPainted(false);
		forbutton4.setContentAreaFilled(false);
		forbutton4.setFocusPainted(false);
		forbutton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton4.setIcon(for_button4);
				forbutton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton4.setIcon(for_button4);
				forbutton4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_for.num = 4;
				new Listbutton_for();
				setVisible(false);
			}
		});

		add(forbutton5);
		forbutton5.setBounds(654, 240, 460, 100);
		forbutton5.setBorderPainted(false);
		forbutton5.setContentAreaFilled(false);
		forbutton5.setFocusPainted(false);
		forbutton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton5.setIcon(for_button5);
				forbutton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton5.setIcon(for_button5);
				forbutton5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_for.num = 5;
				new Listbutton_for();
				setVisible(false);
			}
		});

		add(forbutton6);
		forbutton6.setBounds(654, 343, 460, 100);
		forbutton6.setBorderPainted(false);
		forbutton6.setContentAreaFilled(false);
		forbutton6.setFocusPainted(false);
		forbutton6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				forbutton6.setIcon(for_button6);
				forbutton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				forbutton6.setIcon(for_button6);
				forbutton6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_for.num = 6;
				new Listbutton_for();
				setVisible(false);
			}
		});

		add(backbutton);
		backbutton.setBounds(1050, 585, 70, 70);
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
		g.drawImage(for_list, 0, 0, null);
	}

}
