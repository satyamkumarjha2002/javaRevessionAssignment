package com.masai.services;

import java.util.List;

import com.masai.Exceptions.NotAnyTutorualExistException;
import com.masai.Exceptions.TutorialAlreadyAddedException;
import com.masai.Exceptions.TutorialWithThisIdNotExistException;
import com.masai.models.Tutorial;

public interface TuttorialServiceIntr {
    public Tutorial createNewTutorial(Tutorial tutorial) throws TutorialAlreadyAddedException;
    public List<Tutorial> getAllTutorial() throws NotAnyTutorualExistException;
    public Tutorial getTutorialById(Integer id) throws TutorialWithThisIdNotExistException;
    public Tutorial updateTutorial(Integer id,  Tutorial tutorial) throws TutorialWithThisIdNotExistException;
    public Tutorial deleteTutorial(Integer id) throws TutorialWithThisIdNotExistException;
    public List<Tutorial> findTutorialByPublished(String published);
    public List<Tutorial> findByTitle(String title) throws NotAnyTutorualExistException;
}
