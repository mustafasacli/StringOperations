/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations4j_test;

import com.tr.stringoperations.*;

/**
 *
 * @author Krkt
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Throwable
     */
    public static void main(String[] args) throws Throwable {
        System.out.println(String.valueOf(Long.MAX_VALUE));
        String snc = StringUtil.multiplyTwoString(
                String.valueOf(Long.MAX_VALUE),
                String.valueOf(Long.MAX_VALUE));
        //"546532132132132", "546874321321321");

        System.out.println(snc);

        boolean x = StringUtil.Matches("ali", "ali");
        System.out.println(x ? "Uyuştu." : "Uyuşmadı.");
    }

}
