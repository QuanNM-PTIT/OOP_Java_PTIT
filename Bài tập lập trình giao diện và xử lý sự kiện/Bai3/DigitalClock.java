// Created by Nguyễn Mạnh Quân

package Bai3;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JPanel implements Runnable
{
    JLabel digitalClock;
    Thread clockThread;

    public DigitalClock()
    {
        digitalClock = new JLabel();
        digitalClock.setFont(new Font("Arial", Font.BOLD, 30));
        digitalClock.setForeground(new Color(0, 71, 113));
        add(digitalClock);
        startRun();
    }

    private void startRun()
    {
        clockThread = new Thread(this);
        clockThread.start();
    }

    @Override
    public void run()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while(true)
        {
            Date now = new Date();
            String time = sdf.format(now);
            digitalClock.setText(time);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
