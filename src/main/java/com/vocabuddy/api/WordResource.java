package com.vocabuddy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vocabuddy.api.service.IWordService;
import com.vocabuddy.domain.entity.Word;

@RestController
@RequestMapping("/words")
public class WordResource {

	@Autowired
	private IWordService wordService;
	
	@PostMapping("/add")
	public Word addWord(@RequestBody Word word) {
		return wordService.addWord(word);
	}

	@GetMapping("/all")
	public List<Word> getAllWords(){
		return wordService.getAllWords();
	}
	
	@GetMapping("/test")
	public void test() {
		
	}
}