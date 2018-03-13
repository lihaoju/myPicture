package test;

/**
 * Created by lhj on 2017/10/29.
 */

import org.mybatis.generator.api.ShellRunner;

public class MybatisMake {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "F:\\dev\\object\\myPicture\\picture_service\\src\\test\\resources\\mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
