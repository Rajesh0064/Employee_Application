package com.sathya;

public class Employee {
	private int eno;
	private String ename;
	private double salary;
	private int ta;
	private int da;
	private int hra;
	private int pf;
	private int grosssalry;
	private int netsalary;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getGrosssalry() {
		return grosssalry;
	}
	public void setGrosssalry(int grosssalry) {
		this.grosssalry = grosssalry;
	}
	public int getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(int netsalary) {
		this.netsalary = netsalary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", ta=" + ta + ", da=" + da
				+ ", hra=" + hra + ", pf=" + pf + ", grosssalry=" + grosssalry + ", netsalary=" + netsalary + "]";
	}
	public Employee(int eno, String ename, double salary, int ta, int da, int hra, int pf, int grosssalry,
			int netsalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.grosssalry = grosssalry;
		this.netsalary = netsalary;
	}
	public Employee() {
		super();
	}
	
	

}
