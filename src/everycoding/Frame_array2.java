package everycoding;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame_array2 extends JFrame {
	private ImageIcon check_button = new ImageIcon(Main.class.getResource("../images/check_button.png"));

	private Image array2_ex1 = new ImageIcon(Main.class.getResource("../images/array2_ex1.png")).getImage();
	private Image array2_ex2 = new ImageIcon(Main.class.getResource("../images/array2_ex2.png")).getImage();
	private Image array2_ex3 = new ImageIcon(Main.class.getResource("../images/array2_ex3.png")).getImage();
	private Image array2_ex4 = new ImageIcon(Main.class.getResource("../images/array2_ex4.png")).getImage();
	private Image array2_ex5 = new ImageIcon(Main.class.getResource("../images/array2_ex5.png")).getImage();

	private JButton checkbutton = new JButton(check_button);

	public Frame_array2() {

		new stopwatch();
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 메인에서 크기 고정시킴
		setTitle("2차원배열"); // 창의 제목
		setResizable(false);// 창의 크기를 변경하지 못하게 하는것
		setLocationRelativeTo(null);// 창이 가운데 오도록 하는 것
		setLayout(null);// 레이아웃을 내맘대로 설정가능하게 해줌
		setVisible(true);// 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(checkbutton);// JFrame에 버튼 추가
		checkbutton.setBounds(1124, 585, 50, 50);// 버튼위치 (x좌표, y좌표, 가로, 세로)
		checkbutton.setBorderPainted(false); // 버튼의 외곽선을 없애준다
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
		JTextField answer = new JTextField();// 사용자로부터 값을 입력받는 것
		answer.setBounds(200, 580, 850, 63); // JTextField의 위치
		Font font = new Font("굴림", Font.BOLD, 50); // font설정: (글씨체, 글자두껍게, 글자크기)
		answer.setFont(font);// JTextField에 font설정한 것을 대입
		add(answer);

		Random r = new Random();// Random 객체를 생성(0 ~ 1까지의 실수를 랜덤으로 표시해줍니다)
		int num = r.nextInt(4); // nextInt: 0~3 미만의 정수형 난수(규칙이 없는 숫자) 반환, num에 0~2까지 난수가 입력된다.
		switch (num) { // num에 대입된 난수가 맞는 case로 가서 배경을 바꿔서 랜덤 문제가 출제됨
		case 0:
			g.drawImage(array2_ex1, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("{1,2,3,4},{5,6,7,8},{9,10,11,12}")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
			break;

		case 1:
			g.drawImage(array2_ex2, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("[2][3]")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
			break;

		case 2:
			g.drawImage(array2_ex3, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("a[i][j]=1;")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
			break;

		case 3:
			g.drawImage(array2_ex4, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("++num")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
			break;

		case 4:
			g.drawImage(array2_ex5, 0, 0, null);
			checkbutton.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					if (answer.getText().equals("ary[i][j]")) {
						new Answer_correct();
						setVisible(false);
					} else {
						new Answer_wrong();
						setVisible(false);
					}
				}
			});
			break;
		}
	}
}
