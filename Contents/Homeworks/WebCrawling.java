// GeekNews Parser

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;

class WebCrawling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String url = "https://news.hada.io/";
        System.out.println("[GeekNews]");
        try {
            Document page = Jsoup.connect(url).get();
            Elements topics = page.getElementsByClass("topic_row");
            for (Element topic : topics) {
            	Elements topictitle = topic.getElementsByClass("topictitle");
            	String title = topic.getElementsByTag("h1").text();
            	String topicUrl = topictitle.get(0).getElementsByTag("a").attr("href");
            	System.out.println("- " + title);
            	System.out.println("  " + topicUrl + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        scanner.close();
    }
}

      