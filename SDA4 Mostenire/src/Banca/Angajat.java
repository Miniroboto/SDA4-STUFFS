package Banca;

public class Angajat extends Persoana
{
	public enum RolAngajat {DIRECTOR, CASIER, AGENT_VANZARI};
	private RolAngajat rolAngajat;
	private String codAngajat;
	private Banca banca;
	
	public Angajat(String CNP, String nume, Banca banca,
			RolAngajat rolAngajat, String codAngajat)
	{
		super(CNP, nume);
		setRolAngajat(rolAngajat);
		setCodAngajat(codAngajat);
		this.banca = banca;
	}
	
	public RolAngajat getRolAngajat()
	{
		return rolAngajat;
	}
	
	public void setRolAngajat(RolAngajat rolAngajat)
	{ 
		this.rolAngajat = rolAngajat; 
	}
	
	public String getCodAngajat()
	{
		return codAngajat;
	}
	
	public void setCodAngajat(String codAngajat)
	{
		this.codAngajat = codAngajat;
	}
	
	public String deschidereCont(Client client)
	{
		if(getRolAngajat() != RolAngajat.AGENT_VANZARI)
		{
			return null;
		}
		banca.getClienti().add(client);
		return client.getCont().getIBAN();
	}
	
	public Boolean inchidereCont(Client client)
	{
		if(getRolAngajat() != RolAngajat.AGENT_VANZARI ||
				getRolAngajat() != RolAngajat.DIRECTOR)
		{
			return null;
		}
		return banca.getClienti().remove(client);
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Angajat))
		{
			return false;
		}
		Angajat concreteObj = (Angajat) obj;
		if(this.CNP.equals(concreteObj.getCNP()))
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "{Angajat nume: "+this.nume+
				" rol: "+this.rolAngajat+
				" cod: "+this.codAngajat+"}";
	}
}
