package com.mambu.number2words.internal.english;

import com.mambu.number2words.internal.english.mapping.EnglishNumberMapping;
import com.mambu.number2words.parsing.interfaces.TranscriptionContext;
import com.mambu.number2words.parsing.interfaces.WordValue.WordForm;
import com.mambu.number2words.parsing.interfaces.WordValue.GrammaticalNumber;

/**
 * Evaluation context when visiting tokens that were parsed using English semantics.
 * <p>
 * This class is thread safe as it stores no state and it deals with immutable data.
 * </p>
 * 
 * @author aatasiei
 *
 */
public class EnglishNumberTranscriptionContext implements TranscriptionContext {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String asWord(Long value, GrammaticalNumber number, WordForm form) {
		return EnglishNumberMapping.fromNumber(value).getWordValue().getWord(number, form);
	}

}
