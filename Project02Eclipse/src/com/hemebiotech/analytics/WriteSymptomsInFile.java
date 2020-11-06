package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class WriteSymptomsInFile implements ISymptomWriter {


	private String fileOut;
	/**
	 * 
	 * @param fileOut a full or partial path to file within results will be written
	 */	

	public WriteSymptomsInFile (String fileOut)
	{
		this.fileOut= fileOut;
	}
	@Override
	public void writeInFile (TreeMap<String,Integer> symptoms) //throws IOException
	{

		FileWriter writer;
		try {
			writer = new FileWriter (fileOut);

			while (symptoms.firstEntry() != null)
			{
				writer.write(symptoms.firstEntry() + "\n");
				symptoms.remove(symptoms.firstKey(),symptoms.get(symptoms.firstKey()));
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("Impossible d'écrire des données dans le fichier spécifié");
		}	
	}




}



