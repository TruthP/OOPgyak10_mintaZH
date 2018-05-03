package tartalyos;

public class Tartalyos extends Tarolo{
	
	private double nyomas;

		public Tartalyos(int terfogat, double nyomas){
			super(terfogat);
			this.nyomas=nyomas;
			}
		
		@Override
		public boolean isDangerous(){
			if((terfogat*nyomas)>100){
				return true;
			}
				return false;
			}

		@Override
		public String toString() {
			return "Tartalyos [nyomas=" + nyomas + ", getTerfogat()="
					+ getTerfogat() + "]";
		}
		
		
		public boolean isBiggerThan(Tartalyos tartaly)
		{
			if(this.nyomas>tartaly.getNyomas()){
				return true;
			}
			else return false;
		}
		
		public double getNyomas(){
			return nyomas;
		}

		public void setNyomas(double nyomas) {
			this.nyomas = nyomas;
		}
		
		public static Tartalyos getBiggerTartaly(Tartalyos tartaly1, Tartalyos tartaly2){
			
			if(tartaly1.getTerfogat()>tartaly2.getTerfogat()){
				return tartaly1;
			}
			else
			{
				return tartaly2;
			}
		}
		
		
	

}

