package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public interface ISymptomWriter {
	
	void writeInFile(TreeMap<String,Integer> x) throws IOException;

}
