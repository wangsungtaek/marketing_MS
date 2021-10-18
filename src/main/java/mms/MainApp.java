package mms;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainApp {

    private static String URL = "https://www.jobkorea.co.kr/Search/?";

    public static void main(String[] args) throws IOException {
        String KEY_WORD = "jquery";

        System.out.println("param : " + getParameter(KEY_WORD, 2));
        // 1. Document를 가져온다.
        Document doc = Jsoup.connect(URL + getParameter(KEY_WORD, 2)).get();

        // 2. 목록을 가져온다.
        //System.out.println("" + doc.toString());
//        Elements elements = doc.select(".list-default .list-post");

        // 3. 목록(배열)에서 정보를 가져온다.
//        int idx = 0;
//        for(Element e : elements) {
//
//            System.out.println(++idx + " : " + e.toString());
//            System.out.println("============================");
//        }
    }


    public static String getParameter(String KEY_WORD, int PAGE) {
        String parmas = "stext=" + KEY_WORD + ""
                        + "&tabType=recruit"
                        + "&Page_No=" + PAGE + "";
        return parmas;
    }
}
