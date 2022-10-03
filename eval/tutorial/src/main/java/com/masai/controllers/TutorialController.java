package com.masai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Tutorial;
import com.masai.services.TuttorialServiceIntr;

@RestController
@RequestMapping("/api")
public class TutorialController {
	
	@Autowired
	TuttorialServiceIntr tutorialService;
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> createeNewTutorial(@RequestBody Tutorial tutorial){
		
		Tutorial createdTutorial = tutorialService.createNewTutorial(tutorial);
		
		return new ResponseEntity(createdTutorial,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorial(){
		return new ResponseEntity(tutorialService.getAllTutorial(), HttpStatus.OK);
	}
	
	@GetMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable Integer id){
		return new ResponseEntity(tutorialService.getTutorialById(id),HttpStatus.FOUND);
	}
	
	@PutMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> updateTutorial(@PathVariable Integer id, @RequestBody Tutorial tutorial){
		return new ResponseEntity(tutorialService.updateTutorial(id, tutorial),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> delteTutorial(@PathVariable Integer id){
		return new ResponseEntity(tutorialService.deleteTutorial(id),HttpStatus.OK);
	}
	
	@GetMapping("/tutorials/published/{status}")
	public ResponseEntity<List<Tutorial>> getAllTutorialByPublished(@PathVariable String status){
		return new ResponseEntity(tutorialService.findTutorialByPublished(status),HttpStatus.OK);
	}
	
	@GetMapping("api/tutorials")
	public ResponseEntity<List<Tutorial>> getAllbyTitle(@RequestParam(name = "title") String title){
		return new ResponseEntity(tutorialService.findByTitle(title),HttpStatus.OK);
	}
       
}
