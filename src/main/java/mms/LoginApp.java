package mms;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

public class LoginApp {

    private static final String LOGIN_URL = "https://www.instagram.com/accounts/login/";
    private static String ID = "91_taek2";
    private static String PW = "see010811!!";
    private static Map<String, String> cookies;

    public static void main(String[] args) throws IOException {

        // 1. login
        HttpConnection.Response loginResponse = (HttpConnection.Response) Jsoup.connect(LOGIN_URL)
                                                    .cookies(loginResponse.cookies())

                                                    .execute();

        Document doc = loginResponse.parse();
        System.out.println(" PAGE STATUS CODE : " + loginResponse.statusCode());
        System.out.println("" + doc.toString());


        // 2. Session 정보 담는다.

        //
    }
}
