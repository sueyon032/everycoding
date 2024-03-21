package everycoding;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Answer_wrong extends JFrame {
	private Image wronganswer1 = new ImageIcon(Main.class.getResource("../images/wronganswer1.png")).getImage(); // 배경그림경로
	private Image wronganswer2 = new ImageIcon(Main.class.getResource("../images/wronganswer2.png")).getImage();
	private Image wronganswer3 = new ImageIcon(Main.class.getResource("../images/wronganswer3.png")).getImage();

	private ImageIcon home_button = new ImageIcon(Main.class.getResource("../images/home_button.png"));

	private JButton homebutton = new JButton(home_button);

	public Answer_wrong() {

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 메인에서 크기 고정시킴
		setTitle("오답"); // 창의 제목
		setResizable(false); // 창의 크기를 변경하지 못하도록 함
		setLocationRelativeTo(null); // 창이 가운데로 오게 함
		setLayout(null); // 레이아웃을 내맘대로 설정 가능하게 해둠
		setVisible(true); // 창이 화면에 보이도록 하는 것
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x버튼 클릭시 종료, JFrame이 정상적으로 종료되게 하는것

		add(homebutton);// JFrame에 버튼 추가
		homebutton.setBounds(1100, 550, 100, 70);// 버튼위치 (x좌표, y좌표, 가로, 세로)
		homebutton.setBorderPainted(false);// 버튼의 외곽선을 없애준다
		homebutton.setContentAreaFilled(false);// 버튼 영역 배경 표시 설정(이것을 해주지 않으면 버튼 주변이 제거가 되지 않음)
		homebutton.setFocusPainted(false);// 버튼이 선택되었을 때 생기는 테두리를 사용하지 않는다
		homebutton.addMouseListener(new MouseAdapter() { // 마우스의 액션
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

	public void paint(Graphics g) { // Random 객체를 생성(0 ~ 1까지의 실수를 랜덤으로 표시해줍니다)
		Random r = new Random();// nextInt: 0~3 미만의 정수형 난수(규칙이 없는 숫자) 반환, num에 0~2까지 난수가 입력된다.
		int num = r.nextInt(3); // num에 대입된 난수가 맞는 case로 가서 배경을 바꿔서 랜덤 문제가 출제됨
		switch (num) {
		case 0:
			g.drawImage(wronganswer1, 0, 0, null);
			break;
		case 1:
			g.drawImage(wronganswer2, 0, 0, null);
			break;
		case 2:
			g.drawImage(wronganswer3, 0, 0, null);
			break;
		}
	}

}
