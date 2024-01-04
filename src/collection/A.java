package collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abcd]");
        Matcher m = p.matcher("a6b#@z9Dcd");
        while(m.find()) {
        	System.out.println(m.start()+"...."+m.group());
        }
	}
}
