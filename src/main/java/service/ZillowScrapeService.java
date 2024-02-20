package service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ZillowScrapeService {

    public void scrapeZipcode(String zipcode) {
        String url = "";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements headlines = doc.select("h1");

            for(Element headline : headlines) {
                System.out.println(headline.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
