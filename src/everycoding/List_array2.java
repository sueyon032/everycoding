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

public class List_array2 extends JFrame {
	private Image array2_list = new ImageIcon(Main.class.getResource("../images/array2_list.png")).getImage();

	private ImageIcon array2_button1 = new ImageIcon(Main.class.getResource("../images/array2_button1.png"));
	private ImageIcon array2_button2 = new ImageIcon(Main.class.getResource("../images/array2_button2.png"));
	private ImageIcon array2_button3 = new ImageIcon(Main.class.getResource("../images/array2_button3.png"));
	private ImageIcon array2_button4 = new ImageIcon(Main.class.getResource("../images/array2_button4.png"));
	private ImageIcon array2_button5 = new ImageIcon(Main.class.getResource("../images/array2_button5.png"));
	private ImageIcon back_button = new ImageIcon(Main.class.getResource("../images/back_button.png"));

	private JButton array2button1 = new JButton(array2_button1);
	private JButton array2button2 = new JButton(array2_button2);
	private JButton array2button3 = new JButton(array2_button3);
	private JButton array2button4 = new JButton(array2_button4);
	private JButton array2button5 = new JButton(array2_button5);
	private JButton backbutton = new JButton(back_button);

	static int num;// 다른 클래스에서 사용가능(static변수는 전역변수이기 때문에)

	public List_array2() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("2차원배열 예문");// 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(array2button1);// JFrame에 버튼 추가
		array2button1.setBounds(158, 240, 470, 100); // 버튼위치 (x좌표, y좌표, 가로, 세로)
		array2button1.setBorderPainted(false);// 버튼의 외곽선을 없애준다
		array2button1.setContentAreaFilled(false);// 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		array2button1.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		array2button1.addMouseListener(new MouseAdapter() { // 마우스의 액션
			@Override
			public void mouseEntered(MouseEvent e) {
				array2button1.setIcon(array2_button1);
				array2button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array2button1.setIcon(array2_button1);
				array2button1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				List_array2.num = 1;
				new Listbutton_array2();
				setVisible(false);
			}
		});

		add(array2button2);
		array2button2.setBounds(158, 342, 470, 100);
		array2button2.setBorderPainted(false);
		array2button2.setContentAreaFilled(false);
		array2button2.setFocusPainted(false);
		array2button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array2button2.setIcon(array2_button2);
				array2button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array2button2.setIcon(array2_button2);
				array2button2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array2.num = 2;
				new Listbutton_array2();
				setVisible(false);
			}
		});

		add(array2button3);
		array2button3.setBounds(158, 444, 470, 100);
		array2button3.setBorderPainted(false);
		array2button3.setContentAreaFilled(false);
		array2button3.setFocusPainted(false);
		array2button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array2button3.setIcon(array2_button3);
				array2button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array2button3.setIcon(array2_button3);
				array2button3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array2.num = 3;
				new Listbutton_array2();
				setVisible(false);
			}
		});

		add(array2button4);
		array2button4.setBounds(158, 545, 470, 100);
		array2button4.setBorderPainted(false);
		array2button4.setContentAreaFilled(false);
		array2button4.setFocusPainted(false);
		array2button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array2button4.setIcon(array2_button4);
				array2button4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array2button4.setIcon(array2_button4);
				array2button4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array2.num = 4;
				new Listbutton_array2();
				setVisible(false);
			}
		});

		add(array2button5);
		array2button5.setBounds(656, 250, 470, 100);
		array2button5.setBorderPainted(false);
		array2button5.setContentAreaFilled(false);
		array2button5.setFocusPainted(false);
		array2button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				array2button5.setIcon(array2_button5);
				array2button5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				array2button5.setIcon(array2_button5);
				array2button5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mousePressed(MouseEvent e) {
				List_array2.num = 5;
				new Listbutton_array2();
				setVisible(false);
			}
		});

		add(backbutton);
		backbutton.setBounds(1055, 585, 70, 70);
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
				new List_array();
				setVisible(false);
			}
		});

	}

	public void paint(Graphics g) {
		g.drawImage(array2_list, 0, 0, null);

	}

}
