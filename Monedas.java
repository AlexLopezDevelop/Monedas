import java.io.BufferedReader;
import java.io.InputStreamReader;
public class monedas {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Camvio optimo");
		
			
			System.out.println("Introducir cantidad");
			String cantidad1 = buffer.readLine(); 
			double cantidad = Double.parseDouble(cantidad1);
			
			int cent50=0;
			int cent20=0;		
			int cent10=0;		
			int cent5=0;
			int cent2=0;	
			int cent1=0;
			
			
			while(cantidad>=50){
			cantidad = cantidad-50;
			cent50++;
			}
			
			while(cantidad>=20){
				cantidad = cantidad-20;
				cent20++;
				}
			
			while(cantidad>=10){
				cantidad = 10;
				cent10++;
				}
			
			while(cantidad>=5){
				cantidad = cantidad-5;
				cent5++;
				}
			
			while(cantidad>=2){
				cantidad = cantidad-2;
				cent2++;
				}
			
			while(cantidad>=1){
				cantidad = cantidad-1;
				cent1++;
				}
			
			System.out.println("Monedas de 50 cent: "+ cent50);
			System.out.println("Monedas de 20 cent: "+ cent20);
			System.out.println("Monedas de 10 cent: "+ cent10);
			System.out.println("Monedas de 5 cent: "+ cent5);
			System.out.println("Monedas de 2 cent: "+ cent2);
			System.out.println("Monedas de 1 cent: "+ cent1);
			
			
			
		}
		
		catch (Exception e) {

			System.out.println("Error al introducir Datos");
		}
	}
}
