package com.masai.services;

import java.lang.invoke.CallSite;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exceptions.NotAnyTutorualExistException;
import com.masai.Exceptions.TutorialAlreadyAddedException;
import com.masai.Exceptions.TutorialWithThisIdNotExistException;
import com.masai.models.Tutorial;
import com.masai.tutorialRepos.TutorialRepo;

@Service
public class TutorialService implements TuttorialServiceIntr {

	@Autowired
	TutorialRepo tRepo;

	@Override
	public Tutorial createNewTutorial(Tutorial tutorial) throws TutorialAlreadyAddedException {
		if (tRepo.findById(tutorial.getId()).isPresent()) {
			throw new TutorialAlreadyAddedException("This tutorial is ALready Added into the list");
		}
		return tRepo.save(tutorial);
	}

	@Override
	public List<Tutorial> getAllTutorial() throws NotAnyTutorualExistException {
		List<Tutorial> tutorials = tRepo.findAll();

		if (tutorials.isEmpty()) {
			throw new NotAnyTutorualExistException("There is not any tutorial present");
		}
		return tutorials;
	}

	@Override
	public Tutorial getTutorialById(Integer id) throws TutorialWithThisIdNotExistException {
		Optional<Tutorial> tutorial = tRepo.findById(id);

		if (tutorial.isEmpty()) {
			throw new TutorialWithThisIdNotExistException("Can't find any tutorial by this id");
		}
		return tutorial.get();
	}

	@Override
	public Tutorial updateTutorial(Integer id, Tutorial tutorial) throws TutorialWithThisIdNotExistException {
		Optional<Tutorial> oldTutorial = tRepo.findById(id);

		if (oldTutorial.isEmpty()) {
			throw new TutorialWithThisIdNotExistException("Can't find any tutorial by this id");
		}

		if (tutorial.getDiscrption() != null) {
			oldTutorial.get().setDiscrption(tutorial.getDiscrption());
		}

		if (tutorial.getPublished() != null) {
			oldTutorial.get().setPublished(tutorial.getPublished());
		}

		if (tutorial.getTitle() != null) {
			oldTutorial.get().setTitle(tutorial.getTitle());
		}
		return tRepo.save(oldTutorial.get());
	}

	@Override
	public Tutorial deleteTutorial(Integer id) throws TutorialWithThisIdNotExistException {
		Optional<Tutorial> oldTutorial = tRepo.findById(id);

		if (oldTutorial.isEmpty()) {
			throw new TutorialWithThisIdNotExistException("Can't find any tutorial by this id");
		}
		
		tRepo.deleteById(id);

		return oldTutorial.get();
	}

	@Override
	public List<Tutorial> findTutorialByPublished(String published) {
		List<Tutorial> tutorials = tRepo.findByPublished(published);

		if (tutorials.isEmpty()) {
			throw new NotAnyTutorualExistException("There is not any tutorial present");
		}
		return tutorials;
	}

	@Override
	public List<Tutorial> findByTitle(String title) throws NotAnyTutorualExistException {
		List<Tutorial> tutorials =  tRepo.getAllByTitle("%"+title+"%");

		if (tutorials.isEmpty()) {
			throw new NotAnyTutorualExistException("There is not any tutorial present");
		}
		return tutorials;
	}

}
