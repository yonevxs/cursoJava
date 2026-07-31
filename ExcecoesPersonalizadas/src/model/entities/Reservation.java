package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		// É sempre bom tratarmos exceções no começo dos métodos - se chama programação defensiva (Boa Prática)
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		} 
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		// Calculando diferença entre 2 datas
		long diff = checkOut.getTime() - checkIn.getTime(); // Qtd de milisegundos da data
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // TimeUnit é um ENUM com operações - convertendo valor em ms (diff) para dias
	}
	
	// O método volta a ser void, só que agora caso aconteça algum erro, uma exceção será lançada
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		} 
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		} 
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room: " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duration() 
		+ " nights.";
	}
}
