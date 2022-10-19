package BT3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/kinh-doanh.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content.replaceAll("\\n+","");
            content.replaceAll("\\&quot[\\:]?+","");
            content.replaceAll("\\<\\/a\\>","");
            Pattern pattern=Pattern.compile("article-title\">(.*?)</h3>");
            Matcher matcher= pattern.matcher(content);
            while (matcher.find()){
                String str= matcher.group(1);
                str.replaceAll("\\&quot\\:","");
                String[] arrStr=str.split("htm\">");
                System.out.println(arrStr[1]);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
