package LowCool;

import javax.swing.*;

public class panel extends JPanel {
    public panel (){
        setLayout(null);

        JButton b1 = new JButton("123");
        b1.setBounds(100, 100, 50, 50);
        add(b1);
    }
}
