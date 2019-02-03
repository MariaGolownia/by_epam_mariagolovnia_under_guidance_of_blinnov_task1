package by_epam_under_guidance_of_blinnov_task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exc.ValidationException;



public class FileReading  {
	
	@SuppressWarnings("resource")
	public List<Double> readFileDigitIntoString (String nameOfFile) throws ValidationException, IOException {
		//work
		List <Double> listDouble = new ArrayList<>(); //Основной массив
		List <Double> listDoubleTemp;                 //Вспомогательный массив, который будем использовать для записи всех чисел в одной строке
		final String CONSTANT_SPASE = " "; 
		File file = new File (nameOfFile);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			
			ValidationFile validationFile = new ValidationFile ();
			fileReader = new FileReader(nameOfFile);
			bufferedReader = new BufferedReader (fileReader);
			
			if (validationFile.checkFile(file))
			{
			    
				String str;			
				while ((str = bufferedReader.readLine()) != null)
				{
				listDoubleTemp = new ArrayList<>();
				   for (String valueToParse  : str.split(CONSTANT_SPASE)) 
				   {
					   try 
					   {
						listDoubleTemp.add(Double.parseDouble(valueToParse)); 
				        } catch (NumberFormatException exc) {
				        listDoubleTemp.clear();
				        break;
				        }	
				   }  
				   if (!listDoubleTemp.isEmpty()) {
					   listDouble.addAll(listDoubleTemp);
				   }
				}
			}
			
			else throw new ValidationException ("Error accessing file! Check the file!");
		}
		catch (IOException ex) {
			System.out.println("File read error!" + ex.getMessage());
		}
		finally {
			fileReader.close();
			bufferedReader.close();
			
		}
		
		return listDouble;
	}

}
