package tartalyos.fut;

import tartalyos.Tartalyos;

public class Proba {

	
	public static void main(String[] args) {
		Tartalyos[] tartalyArray= new Tartalyos[5];
		
		for(int i=0; i<tartalyArray.length; i++){
			tartalyArray[i]=new Tartalyos(3,6);
		}
		
		for(Tartalyos tartaly : tartalyArray){
			System.out.println(tartaly);
		}
		
		int maxNyomas=0;
		for(int i=1; i<tartalyArray.length; i++)
		{
			if(tartalyArray[i].isBiggerThan(tartalyArray[maxNyomas])){
				maxNyomas=i;
			}
			
		}
		
		System.out.println(tartalyArray[maxNyomas]+ " " +maxNyomas);
		Tartalyos maxTartaly=tartalyArray[0];
		for(int i=1; i<tartalyArray.length; i++){
			if(maxTartaly.getTerfogat()<tartalyArray[i].getTerfogat()){
				maxTartaly=tartalyArray[i];
			}
		}
		System.out.println(maxTartaly);
		

	}

}
