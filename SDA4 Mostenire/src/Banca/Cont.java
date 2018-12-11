package Banca;

public class Cont
{
	private String IBAN;
	private Double balanta;
	
	public Cont(String IBAN)
	{
		setIBAN(IBAN);
		setBalanta(0d);
	}
	
	public Cont(String IBAN, Double balanta)
	{
		setIBAN(IBAN);
		setBalanta(balanta);
	}
	
	public String getIBAN()
	{
		return IBAN;
	}
	
	public void setIBAN(String IBAN)
	{
		this.IBAN = IBAN;
	}
	
	public Double getBalanta()
	{
		return balanta;
	}
	
	private void setBalanta(Double balanta)
	{
		this.balanta = balanta;
	}
	
	public Double modificaBalanta(Double delta)
	{
		if(balanta + delta >= 0)
		{
			this.balanta += delta;
		}
		return this.balanta;
	}
	
	@Override
	public String toString()
	{
		return "{Cont IBAN: "+this.IBAN+" balanta:"+this.balanta+"}";
	}
}
