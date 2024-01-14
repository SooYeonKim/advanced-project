package com.example.demo.api.search.dto;

import com.example.demo.api.search.entity.SearchKeyword;
import lombok.Getter;

@Getter
public class SearchKeywordDto {

    private final String keyword;
    private final Long searchCnt;

    public SearchKeywordDto(SearchKeyword searchKeyword) {
        keyword = searchKeyword.getKeyword();
        searchCnt = searchKeyword.getSearchCnt();
    }
}
