package cn.com.mooyea.codergen.handler;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

/**
 * <h1>EncodeHandler<h1>
 * <p>Copyright (C), 星期五,14,4月,2023</p>
 * <br/>
 * <hr>
 * <h3>File Info:</h3>
 * <p>FileName: EncodeHandler</p>
 * <p>Author:   mooye</p>
 * <p>Work_Email： lidy@skyvis.com.cn</p>
 * <p>E-mail： mooyeali@yeah.net</p>
 * <p>Date:     2023/4/14</p>
 * <p>Description: 加解密逻辑</p>
 * <hr>
 * <h3>History:</h3>
 * <hr>
 * <table>
 *  <thead>
 *  <tr><td style='width:100px;' center>Author</td><td style='width:200px;' center>Time</td><td style='width:100px;' center>Version_Number</td><td style='width:100px;' center>Description</td></tr>
 *  </thead>
 *  <tbody>
 *    <tr><td style='width:100px;' center>mooye</td><td style='width:200px;' center>16:19 2023/4/14</td><td style='width:100px;' center>v_1.0.0</td><td style='width:100px;' center>创建</td></tr>
 *  </tbody>
 * </table>
 * <hr>
 * <br/>
 *
 * @author mooye
 */


public class EncodeHandler {

    private static StringEncryptor initEncryptor(String password,String algorithm) {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm(algorithm);
        config.setKeyObtentionIterations(1000);
        config.setPoolSize(1);
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setIvGeneratorClassName("org.jasypt.iv.RandomIvGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        return encryptor;
    }

    public static String encode(String context,String password,String algorithm){
        StringEncryptor encryptor = initEncryptor(password, algorithm);
        return encryptor.encrypt(context);
    }

    public static String decode(String context,String password,String algorithm){
        StringEncryptor encryptor = initEncryptor(password, algorithm);
        return encryptor.decrypt(context);
    }
}
