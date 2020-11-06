package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, 
 * which is a TreeMap of String/Integer( the Integer count the occurrences of its String in the file),
 * contain no duplications
 * 
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty TreeMap
	 * 
	 * @return a TreeMap of all Symptoms obtained from a data source and its number of occurrences, duplicates are not possible
	 */
	TreeMap<String,Integer> getSymptoms ();
}
