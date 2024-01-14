package com.example.demo.api.search.repository;

import com.example.demo.api.search.entity.SearchKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchKeywordRepository extends JpaRepository<SearchKeyword, String> {
}
