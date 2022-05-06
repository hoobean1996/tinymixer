package com.example.tinymixer.dao;

import com.example.tinymixer.model.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends CrudRepository<Feed, String> {
}
