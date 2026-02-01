package com.netsofit.stocknews;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Arrays;

@Controller
public class NewsController {

    @QueryMapping
    public List<News> latestNews() {
        return Arrays.asList(
                new News("1", "Tech Stocks Surge", "Technology sector leads the market rally today."),
                new News("2", "Fed Rate Decision", "Federal Reserve holds interest rates steady."),
                new News("3", "Market Outlook 2026", "Analysts predict steady growth for the coming year."));
    }

    record News(String id, String title, String summary) {
    }
}
