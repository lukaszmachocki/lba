package pl.cba.machocki.jpa.entity;

import javax.persistence.Entity;

@Entity
public class ClassicAcc extends AccType {

	private String accTypeName = "Classic";
	private double interest = 0.2;
	private double monthlyFee = 0;
	
	
	public String getAccTypeName() {
		return accTypeName;
	}
	public void setAccTypeName(String accTypeName) {
		this.accTypeName = accTypeName;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	
}
