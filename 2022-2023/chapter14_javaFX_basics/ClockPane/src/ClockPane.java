import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane {
	
	private int hour;
	private int minute;
	private int second;
	
	public ClockPane() {
		setCurrentTime();
	}
	
	private void setCurrentTime() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		paintClock();
	}

	private void paintClock() {
		double radius = Math.min(this.getWidth(), this.getHeight()) * 0.8 * 0.5;
		double centerX = this.getWidth() / 2;
		double centerY = this.getHeight() / 2;
		
		// draw circle
		Circle circle = new Circle(centerX, centerY, radius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - radius + 12, "12");
		Text t2 = new Text(centerX - radius, centerY + 5, "9");
		Text t3 = new Text(centerX + radius, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + radius - 3, "6");
		// draw second hand
		double sLength = radius * 0.8; // a bit shorter than the radius of the clock
		double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength * Math.cos(second) * (2 * Math.PI / 60);
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);
		
		// draw minute hand
		double mLength = radius * 0.65; // a bit shorter than the radius of the clock
		double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, minuteX, minuteY);
		mLine.setStroke(Color.BLUE);
		
		// draw hour hand
		double hLength = radius * 0.5;
		double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		
		this.getChildren().clear(); // delete the previous nodes if any
		this.getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
	}

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paintClock();
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paintClock();
	}

}
