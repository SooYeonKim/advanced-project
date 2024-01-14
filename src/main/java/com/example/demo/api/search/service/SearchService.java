package com.example.demo.api.search.service;

import com.example.demo.api.search.dto.SearchKeywordDto;
import com.example.demo.api.search.entity.SearchKeyword;
import com.example.demo.api.search.repository.SearchKeywordRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SearchService {

    private final SearchKeywordRepository searchKeywordRepository;

    public SearchService(SearchKeywordRepository searchKeywordRepository) {
        this.searchKeywordRepository = searchKeywordRepository;
    }

    @Transactional
    public SearchKeywordDto save(String keyword) {
        SearchKeyword searchKeyword = searchKeywordRepository.findById(keyword).orElse(new SearchKeyword(keyword, 0L));
        searchKeyword.increaseSearchCnt();
        return new SearchKeywordDto(searchKeywordRepository.save(searchKeyword));
    }
}
