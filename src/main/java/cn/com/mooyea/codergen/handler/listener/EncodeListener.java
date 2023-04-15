package cn.com.mooyea.codergen.handler.listener;

import cn.com.mooyea.codergen.handler.EncodeHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Objects;

/**
 * <h1>EncodeListener<h1>
 * <p>Copyright (C), 星期五,14,4月,2023</p>
 * <br/>
 * <hr>
 * <h3>File Info:</h3>
 * <p>FileName: EncodeListener</p>
 * <p>Author:   mooye</p>
 * <p>Work_Email： lidy@skyvis.com.cn</p>
 * <p>E-mail： mooyeali@yeah.net</p>
 * <p>Date:     2023/4/14</p>
 * <p>Description: 加密按钮监听事件</p>
 * <hr>
 * <h3>History:</h3>
 * <hr>
 * <table>
 *  <thead>
 *  <tr><td style='width:100px;' center>Author</td><td style='width:200px;' center>Time</td><td style='width:100px;' center>Version_Number</td><td style='width:100px;' center>Description</td></tr>
 *  </thead>
 *  <tbody>
 *    <tr><td style='width:100px;' center>mooye</td><td style='width:200px;' center>12:08 2023/4/14</td><td style='width:100px;' center>v_1.0.0</td><td style='width:100px;' center>创建</td></tr>
 *  </tbody>
 * </table>
 * <hr>
 * <br/>
 *
 * @author mooye
 */


public class EncodeListener {
    /**
     * 重置按钮监听事件
     * @param password
     * @param context
     * @param decodeText
     */
    public static void reset(JTextField password, JTextArea context, JTextPane decodeText){
        // 清空 swing 的文本框和文本域
         password.setText("");
         context.setText("");
         decodeText.setText("");
    }

    /**
     * 加密按钮监听事件
     * @param password
     * @param context
     * @param decodeText
     * @param algorithm
     */
    public static void encode(JTextField password, JTextArea context, JTextPane decodeText, JComboBox<String> algorithm){
        // 获取盐值
        String passwordText = password.getText();
        // 获取明文内容
        String contextText = context.getText();
        // 获取加密算法
        String algorithmText = Objects.requireNonNull(algorithm.getSelectedItem()).toString();
        // 加密
        String encodeText = EncodeHandler.encode(contextText, passwordText, algorithmText);
        // 显示加密后的内容
        decodeText.setText(encodeText);
    }

    public static void decode(JTextField password, JTextArea context, JTextPane decodeText, JComboBox<String> algorithm){
        // 获取盐值
        String passwordText = password.getText();
        // 获取密文内容
        String encodeText = decodeText.getText();
        // 获取加密算法
        String algorithmText = Objects.requireNonNull(algorithm.getSelectedItem()).toString();
        // 解密
        String decodeString = EncodeHandler.decode(encodeText, passwordText, algorithmText);
        // 显示解密后的内容
        context.setText(decodeString);
    }

    public static void close(MouseEvent e){
        Component cmp = e.getComponent();
        while (!(cmp instanceof JFrame) || cmp.getParent() != null) {
            cmp = cmp.getParent();
        }
        ((JFrame) cmp).dispose();
    }
}
