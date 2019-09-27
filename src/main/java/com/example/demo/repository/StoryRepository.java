package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {

}
