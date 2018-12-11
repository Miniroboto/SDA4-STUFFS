package Banca;

import java.util.LinkedList;

public class Banca
{
	private LinkedList<Client> clienti;
	private LinkedList<Angajat> angajati;
	
	public Banca()
	{
		clienti = new LinkedList<>();
		angajati = new LinkedList<>();
	}
	
	
	
	public LinkedList<Client> getClienti()
	{
		return clienti;
	}



	public void adaugaAngajat(Angajat a)
	{
		this.angajati.add(a);
	}
	
	public void stergeAngajat(Angajat a)
	{
		this.angajati.remove(a);
	}
	
	public void stergeAngajat(String  CNP)
	{
		for(int i=0;i<this.angajati.size();++i)
		{
			if(this.angajati.get(i).CNP.equals(CNP))
			{
				this.angajati.remove(i);
				break;
			}
		}
	}
	
	public void adaugaClient(Client client)
	{
		this.clienti.add(client);
	}
	
	public void stergeClient(Client client)
	{
		this.clienti.remove(client);
	}

    public Client cautareClientDupaIBAN (String iban)
    {
	    int i=0;
	    while (i<this.clienti.size()) {
	        Client aux = this.clienti.get(i);

	        if(aux.getCont().getIBAN().equals(iban)) {
	            return aux;
            }
	        i++;
        }
        return null;
    }
    public Client cautareDupaCNP (String CNP){

    }
	
	@Override
	public String toString()
	{
		return "{Banca angajati: "+angajati+" clienti:"+clienti+"}";
	}
}
