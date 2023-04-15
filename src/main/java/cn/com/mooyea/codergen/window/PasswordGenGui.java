package cn.com.mooyea.codergen.window;



import cn.com.mooyea.codergen.handler.listener.EncodeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * <h1>PasswordGenGui<h1>
 * <p>Copyright (C), 星期五,14,4月,2023</p>
 * <br/>
 * <hr>
 * <h3>File Info:</h3>
 * <p>FileName: PasswordGenGui</p>
 * <p>Author:   mooye</p>
 * <p>Work_Email： lidy@skyvis.com.cn</p>
 * <p>E-mail： mooyeali@yeah.net</p>
 * <p>Date:     2023/4/14</p>
 * <p>Description: </p>
 * <hr>
 * <h3>History:</h3>
 * <hr>
 * <table>
 *  <thead>
 *  <tr><td style='width:100px;' center>Author</td><td style='width:200px;' center>Time</td><td style='width:100px;' center>Version_Number</td><td style='width:100px;' center>Description</td></tr>
 *  </thead>
 *  <tbody>
 *    <tr><td style='width:100px;' center>mooye</td><td style='width:200px;' center>10:37 2023/4/14</td><td style='width:100px;' center>v_</td><td style='width:100px;' center></td></tr>
 *  </tbody>
 * </table>
 * <hr>
 * <br/>
 *
 * @author mooye
 */

public class PasswordGenGui {
    private JPanel mianWindow;
    private JButton close;
    private JButton encode;
    private JButton decode;
    private JTextField password;
    private JComboBox<String> algorithm ;
    private JTextArea context;
    private JTextPane decodeText;
    private JButton resetting;



    public PasswordGenGui() {
        encode.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                EncodeListener.encode(password, context, decodeText, algorithm);
            }
        });
        decode.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                EncodeListener.decode(password, context, decodeText, algorithm);
            }
        });
        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                EncodeListener.close(e);
            }
        });
        resetting.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                EncodeListener.reset(password, context, decodeText);
            }
        });
    }


    public void createUiComponents() {
        // TODO: place custom component creation code here
        PasswordGenGui passwordGenGui = new PasswordGenGui();
        JFrame frame = new JFrame("Jasypt Password Generator/Decoder");
        frame.setContentPane(passwordGenGui.mianWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setVisible(true);
        ImageIcon imageIcon = new ImageIcon("src/main/resources/icon/jasypt.ico");
        frame.setIconImage(imageIcon.getImage());
    }

    public static void main(String[] args) {
        PasswordGenGui passwordGenGui = new PasswordGenGui();
        passwordGenGui.createUiComponents();
    }
}
