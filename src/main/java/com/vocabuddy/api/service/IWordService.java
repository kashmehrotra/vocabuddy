package com.vocabuddy.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vocabuddy.domain.entity.Word;
public interface IWordService {
	
	Word addWord(Word word);

	List<Word> getAllWords();

	String test();
}
