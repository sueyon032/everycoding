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
import javax.swing.JFrame;

public class Listbutton_for extends JFrame {
	private Image for_list = new ImageIcon(Main.class.getResource("../images/for_list.png")).getImage();
	private Image for_ex1 = new ImageIcon(Main.class.getResource("../images/for_ex1.png")).getImage();
	private Image for_ex3 = new ImageIcon(Main.class.getResource("../images/for_ex3.png")).getImage();
	private Image for_ex4 = new ImageIcon(Main.class.getResource("../images/for_ex4.png")).getImage();
	private Image for_ex5 = new ImageIcon(Main.class.getResource("../images/for_ex5.png")).getImage();
	private Image for_ex6 = new ImageIcon(Main.class.getResource("../images/for_ex6.png")).getImage();
	private Image for_ex7 = new ImageIcon(Main.class.getResource("../images/for_ex7.png")).getImage();

	private ImageIcon check_button = new ImageIcon(Main.class.getResource("../images/check_button.png"));

	private JButton checkbutton = new JButton();

	public Listbutton_for() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("for문");// 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(checkbutton);// JFrame에 버튼 추가
		checkbutton.setBounds(1070, 583, 120, 58);// 버튼위치 (x좌표, y좌표, 가로, 세로)
		checkbutton.setBorderPainted(false);// 버튼의 외곽선을 없애준다
		checkbutton.setContentAreaFilled(false);// 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		checkbutton.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		checkbutton.addMouseListener(new MouseAdapter() { // 마우스의 액션
			@Override
			public void mouseEntered(MouseEvent e) {
				checkbutton.setIcon(check_button);
				checkbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				checkbutton.setIcon(check_button);
				checkbutton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});

	}

	public void paint(Graphics g) {
		JTextField answer = new JTextField();
		answer.setBounds(200, 580, 850, 63);
		Font font = new Font("굴림", Font.BOLD, 50);
		answer.setFont(font);
		add(answer);

		if (List_for.num == 1) {
			g.drawImage(for_ex1, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals(";;")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_for.num == 2) {
			g.drawImage(for_ex3, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("*")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_for.num == 3) {
			g.drawImage(for_ex4, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("20")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_for.num == 4) {
			g.drawImage(for_ex5, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("sum+num")) {
						new Answer_correct();
						setVisible(false);
					} else if (answer.getText().equals("num+sum")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_for.num == 5) {
			g.drawImage(for_ex6, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("i--")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		} else if (List_for.num == 6) {
			g.drawImage(for_ex7, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("for")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
		}

	}
}
