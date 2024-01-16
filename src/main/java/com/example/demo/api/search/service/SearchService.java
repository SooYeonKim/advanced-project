package com.example.demo.api.search.service;

import com.example.demo.api.search.dto.SearchKeywordDto;
import com.example.demo.api.search.entity.SearchKeyword;
import com.example.demo.api.search.repository.SearchKeywordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SearchService {

    private final SearchKeywordRepository searchKeywordRepository;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public SearchService(SearchKeywordRepository searchKeywordRepository) {
        this.searchKeywordRepository = searchKeywordRepository;
    }

    @Transactional
    public SearchKeywordDto save(String keyword) {
        if (keyword.equals("test")) {
            logger.error("ERROR Level 테스트");
        }
        SearchKeyword searchKeyword = searchKeywordRepository.findById(keyword).orElse(new SearchKeyword(keyword, 0L));
        searchKeyword.increaseSearchCnt();
        return new SearchKeywordDto(searchKeywordRepository.save(searchKeyword));
    }
}
