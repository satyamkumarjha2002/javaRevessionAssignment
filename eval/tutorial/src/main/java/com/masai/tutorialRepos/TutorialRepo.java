package com.masai.tutorialRepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.masai.models.Tutorial;

public interface TutorialRepo extends JpaRepository<Tutorial, Integer> {
    List<Tutorial> findByPublished(String published);
    
    @Query("FROM Tutorial WHERE title LIKE :title")
    List<Tutorial> getAllByTitle(@Param("title") String title);
}
