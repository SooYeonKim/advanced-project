package com.example.demo.api.search.controller;

import com.example.demo.api.search.dto.SearchKeywordDto;
import com.example.demo.api.search.service.SearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/search")
    public SearchKeywordDto search(@RequestParam(value = "keyword") String keyword) {
        return searchService.save(keyword);
    }
}
