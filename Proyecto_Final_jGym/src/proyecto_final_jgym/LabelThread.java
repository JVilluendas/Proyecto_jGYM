package proyecto_final_jgym;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class LabelThread extends Thread {

    JLabel label;

    public LabelThread() {
    }

    public LabelThread(JLabel label) {
        this.label = label;
    }

    @Override
    public synchronized void run() {
        boolean a = true;
        while (a) {
            try {
                if (label.getX() > 1000) {
                    label.setLocation(-290, label.getY());
                } else {
                    label.setLocation(label.getX() + 2, label.getY());
                }
                Thread.currentThread().sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(LabelThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
