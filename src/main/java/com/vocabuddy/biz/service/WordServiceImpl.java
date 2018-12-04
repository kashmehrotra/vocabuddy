package com.vocabuddy.biz.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vocabuddy.api.service.ITestService;
import com.vocabuddy.api.service.IWordService;
import com.vocabuddy.domain.entity.Word;
import com.vocabuddy.domain.repository.WordRepository;

@Service
public class WordServiceImpl implements IWordService{

	@Autowired
	private WordRepository wordRepository;
	@Autowired
	private ITestService testService;

	@Override
	public Word addWord(Word word) {
		word.setId(UUID.randomUUID().toString());
		wordRepository.save(word);
		return word;
	}

	@Override
	public List<Word> getAllWords() {
		return wordRepository.findAll();
	}

	@Override
	public String test() {
		return testService.test();
	}

	
}
