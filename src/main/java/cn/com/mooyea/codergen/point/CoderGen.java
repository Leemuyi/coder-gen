package cn.com.mooyea.codergen.point;

import cn.com.mooyea.codergen.window.PasswordGenGui;

/**
 * <h1>CoderGen<h1>
 * <p>Copyright (C), 星期五,14,4月,2023</p>
 * <br/>
 * <hr>
 * <h3>File Info:</h3>
 * <p>FileName: CoderGen</p>
 * <p>Author:   mooye</p>
 * <p>Work_Email： lidy@skyvis.com.cn</p>
 * <p>E-mail： mooyeali@yeah.net</p>
 * <p>Date:     2023/4/14</p>
 * <p>Description: 程序入口</p>
 * <hr>
 * <h3>History:</h3>
 * <hr>
 * <table>
 *  <thead>
 *  <tr><td style='width:100px;' center>Author</td><td style='width:200px;' center>Time</td><td style='width:100px;' center>Version_Number</td><td style='width:100px;' center>Description</td></tr>
 *  </thead>
 *  <tbody>
 *    <tr><td style='width:100px;' center>mooye</td><td style='width:200px;' center>16:38 2023/4/14</td><td style='width:100px;' center>v_1.0.0</td><td style='width:100px;' center>创建</td></tr>
 *  </tbody>
 * </table>
 * <hr>
 * <br/>
 *
 * @author mooye
 */


public class CoderGen {

    public static void main(String[] args) {
        // 启动程序
        PasswordGenGui passwordGenGui = new PasswordGenGui();
        passwordGenGui.createUiComponents();
    }
}
