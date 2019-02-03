package act;

import java.util.List;

public class Action {

	public Double defineSum (List <Double> list) {
		Double sum = 0.0;
		for (Double value : list) {
			sum+=value;
		}
		return sum;
	}


	public Double defineAverage (List <Double> list) {
		Double average = 0.0;
		for (Double value : list) {
			average+=value;
		}
		return average/list.size();
	}

	public double defineMin(List <Double> list){
		Double tempMin =  list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < tempMin)
				tempMin = list.get(i);
		}
		return tempMin;
	}


	public double defineMax(List <Double> list){
		double tempMax = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > tempMax)
				tempMax = list.get(i);
		}
		return tempMax;
	}

	// Сортировка пузырьком
	public static void bubbleSortDecreasingOrder(List <Double> list){
		if (list == null || list.size() == 0 || list.size() == 1) return;
		else{
			for(int i = 0;  i < list.size(); i++){
				for(int j = 0; j < list.size()-i-1; j++){
					if(list.get(j) < list.get(j + 1) ){
						swapDouble(list, j, j + 1);
					}
				
				}
			}
		}
	}
	
	public static void bubbleSortIncreasingOrder(List <Double> list){
		if (list == null || list.size() == 0 || list.size() == 1) return;
		else{
			for(int i = 0;  i < list.size(); i++){
				for(int j = 0; j < list.size()-i-1; j++){
					if(list.get(j) > list.get(j + 1) ){
						swapDouble(list, j, j + 1);
					}
				
				}
			}
		}
	}

	public static void swapDouble (List <Double> list, int a, int b){
		double tmp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, tmp);
	}

	// Сортировка выбором
	public static void selectionSortinDecreasingOrder(List <Double> list){
		double maxValue;
		int indexOfMaxValue;   
		if (list == null || list.size() == 0 || list.size() == 1) return;
		else {
			for (int i = 0; i < list.size(); i++) {
				maxValue = list.get(i);
				indexOfMaxValue = i; 
				for (int j = i+1; j < list.size(); j++) {
					if (list.get(j) > maxValue) {
						maxValue= list.get(j);
						indexOfMaxValue= j;
					}
				}
				if (i != indexOfMaxValue) {
					double tmp = list.get(i);
					list.set(i, list.get(indexOfMaxValue));
					list.set(indexOfMaxValue, tmp);

				}
			}
		}
	}


	public static void selectionSortinIncreasingOrder(List <Double> list){
		double minValue;
		int indexOfMinValue;   
		if (list == null || list.size() == 0 || list.size() == 1) return;
		else {
			for (int i = 0; i < list.size(); i++) {
				//Предполагаем, что первый элемент в каждом подмножестве элементов является минимальным 
				minValue = list.get(i);
				indexOfMinValue = i; 
				//В оставшейся части подмножества ищем элемент,который меньше предположенного минимума*/
				for (int j = i+1; j < list.size(); j++) {
					//Если находим, запоминаем его индекс
					if (list.get(j) <minValue) {
						minValue= list.get(j);
						indexOfMinValue= j;
					}
				}
				/*Если нашелся элемент, меньший, чем на текущей позиции,меняем их местами*/
				if (i != indexOfMinValue) {
					double tmp = list.get(i);
					list.set(i, list.get(indexOfMinValue));
					list.set(indexOfMinValue, tmp);

				}
			}
		}
	}





}
