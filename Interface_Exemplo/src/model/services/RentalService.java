	package model.services;
	
	import java.time.Duration;
	
	import model.entities.CarRental;
	import model.entities.Invoice;
	
	public class RentalService {
		private Double pricePerDay;
		private Double pricePerHour;
		
		private TaxService taxService; // Agora terá uma dependência da nossa INTERFACE
	
		public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
			this.pricePerDay = pricePerDay;
			this.pricePerHour = pricePerHour;
			this.taxService = taxService;
		}
		
		public void processInvoice(CarRental carRental) {
			// Pegando duração em minutos
			double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
			
			// Transformando em horas
			double hours = minutes / 60.0;
			
			double basicPayment;
			
			if(hours <= 12) {
				basicPayment = pricePerHour * Math.ceil(hours); // Arredonda pra cima
			}
			else {
				basicPayment = pricePerDay * Math.ceil(hours / 24.0); // Transforma em dias
			}
			
			double tax = taxService.tax(basicPayment);
			
			
			carRental.setInvoice(new Invoice(basicPayment, tax));
		}
		
		
		
	}
