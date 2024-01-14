package com.example.demo.api.search.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "`search_keyword`")
public class SearchKeyword {

    @Id
    private String keyword;

    private Long searchCnt;

    @Version
    private Long version;

    public SearchKeyword(String keyword, Long searchCnt) {
        this.keyword = keyword;
        this.searchCnt = searchCnt;
    }

    public void increaseSearchCnt() {
        searchCnt += 1;
    }
}
