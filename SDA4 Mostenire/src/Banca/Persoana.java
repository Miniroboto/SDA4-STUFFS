package Banca;

public class Persoana
{
	protected String CNP;
	protected String nume;
	
	public Persoana(String CNP, String nume)
	{
		setCNP(CNP);
		setNume(nume);
	}
	
	public String getCNP()
	{
		return CNP;
	}
	
	public void setCNP(String CNP)
	{
		this.CNP = CNP;
	}
	
	public String getNume()
	{
		return nume;
	}
	
	public void setNume(String nume)
	{
		this.nume = nume;
	}
}
