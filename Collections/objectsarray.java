import java.util.*;
class Loan{
	private int interest_rate,period,amount;
	public Loan(int interest_rate,int period,int amount){
		this.interest_rate=interest_rate;
		this.period=period;
		this.amount=amount;
	}
	public String toString(){
		return "Rate of interest="+interest_rate+" Time Period="+period+" Amount="+amount;
	}
}
class Date{
	private int day,month,year;
	public Date(int dd,int mm,int yy){
		day=dd;
		month=mm;
		year=yy;
	}
	public String toString(){
		return "Date is "+day+"/"+month+"/"+year;
	}
}
class Circle{
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
}
class Demo{
	public static void main(String[] args) {
		ArrayList<Object> objarr= new ArrayList<Object>();
		objarr.add(new Loan(12,3,12000));
		objarr.add(new Date(1,1,2019));
		objarr.add("Hello");
		objarr.add(new Circle(6));
		for(int i=0;i<objarr.size();i++){
			System.out.println(objarr.get(i).toString());
		}
	}
}