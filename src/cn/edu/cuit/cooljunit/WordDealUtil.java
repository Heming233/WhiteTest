package cn.edu.cuit.cooljunit;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Heming233
 * @version 1.0
 */

public class WordDealUtil {
    public static String wordFormat4DB(String name){
        if(name==null){
            return null;
        }

        Pattern p=Pattern.compile("[A-Z]");
        Matcher m=p.matcher(name);
        StringBuffer sb=new StringBuffer();
        while(m.find()){
            if (m.start() != 0) {
                m.appendReplacement(sb,"_"+m.group());
            }
        }
        return m.appendTail(sb).toString().toLowerCase();
    }
}
