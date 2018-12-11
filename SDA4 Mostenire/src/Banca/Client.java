package Banca;

import java.util.Random;

public class Client extends Persoana
{
	private Cont cont;
	
	public Client(String CNP, String nume)
	{
		super(CNP,nume);
		Random rand = new Random();
		Integer IBANSuffix = rand.nextInt(9000);
		IBANSuffix += 1000;
		this.cont = new Cont(CNP+IBANSuffix);
	}
	
	public Cont getCont()
	{
		return cont;
	}



	public Double alimentareCont(Double suma)
	{
		if(suma > 0)
		{
			this.cont.modificaBalanta(suma);
		}
		return this.cont.getBalanta();
	}
	
	public Double retragere(Double suma)
	{
		if(suma > 0)
		{
			this.cont.modificaBalanta(-suma);
		}
		return this.cont.getBalanta();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Client))
		{
			return false;
		}
		Client concreteObj = (Client) obj;
		if(this.CNP.equals(concreteObj.getCNP()))
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "{Client nume: "+this.nume+
				" CNP: "+this.CNP+
				" cont: "+this.cont+"}";
	}
}
