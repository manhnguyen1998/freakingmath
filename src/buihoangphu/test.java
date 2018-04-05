package buihoangphu;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
  public static void main(String args[]) {
    Frame frame = new Frame();
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) {
        Frame frame = (Frame) evt.getSource();
        frame.setVisible(false);
        // frame.dispose();
      }
    });
  }
}
