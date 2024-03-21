package everycoding;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class stopwatch implements ActionListener{
	JFrame frame = new JFrame();
	JButton startButton = new JButton("시작");
	JButton resetButton = new JButton("다시");
	JLabel timeLabel = new JLabel();
	int elapsedTime=0;
	int seconds=0;
	int minutes=0;
	int hours=0;
	boolean started=false;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	Timer timer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			elapsedTime=elapsedTime+1000;
			hours=(elapsedTime/3600000);
			minutes=(elapsedTime/60000)%60;
			seconds=(elapsedTime/1000)%60;
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		}
		
	});
	
	stopwatch(){
		timeLabel.setText(hours_string + ":" + minutes_string+ ":" + seconds_string);
		timeLabel.setBounds(10,10,100,64);
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,15));
		timeLabel.setForeground(Color.white);
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		timeLabel.setBackground(Color.black);

		startButton.setBounds(10,76,50,35);
		startButton.setFont(new Font("굴림",Font.PLAIN,8));
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		startButton.setBackground(Color.LIGHT_GRAY);
		
		resetButton.setBounds(61,76,50,35);
		resetButton.setFont(new Font("굴림",Font.PLAIN,8));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		resetButton.setBackground(Color.LIGHT_GRAY);
		
		frame.add(startButton);
		frame.add(resetButton);
		frame.add(timeLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(130,160);
		frame.setLocation(00, 47);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startButton) {
			if(started==false) {
				started=true;
				startButton.setText("그만");
				start();
			}
			else {
				started=false;
				startButton.setText("시작");
				stop();
			}
		}
		if(e.getSource()==resetButton) {
			started=false;
			startButton.setText("시작");
			reset();
		}
	}
	
	void start() {
		timer.start();
	}
	
	void stop() {
		timer.stop();
	}
	
	void reset() {
		timer.stop();
		elapsedTime=0;
		seconds=0;
		minutes=0;
		hours=0;
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
	}
	
	public static void main(String[]args) {
		new stopwatch();
	}

}