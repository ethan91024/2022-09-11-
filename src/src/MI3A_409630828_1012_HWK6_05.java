
import java.awt.*;

interface AlarmTimer {

    void alarm();
}

class TimerTool {

    public static void startTimer(AlarmTimer timer, int duration, int step) {
        for (int i = 0; i < duration; i += step) {
            timer.alarm();
            try {
                Thread.sleep(step * 1000);
            } catch (Exception e) {

            }
        }
    }
}

class BeepWatch implements AlarmTimer {

    public void alarm() {
        Toolkit.getDefaultToolkit().beep();
    }
}

class EchoWatch implements AlarmTimer {

    public void alarm() {
        System.out.print("Wake Up!!!");
        Toolkit.getDefaultToolkit().beep();
    }
}

public class MI3A_409630828_1012_HWK6_05 {

    public static void main(String[] args) {
        AlarmTimer bw = new BeepWatch();
        TimerTool.startTimer(bw, 20, 2);  // 啟動BeepWatch的鬧鈴，間隔2秒, 持續20秒
        AlarmTimer ew = new EchoWatch();
        TimerTool.startTimer(ew, 10, 1); //啟動EchoWatch的鬧鈴，間隔1秒, 持續10秒
    }
}
