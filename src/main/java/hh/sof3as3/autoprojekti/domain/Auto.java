package hh.sof3as3.autoprojekti.domain;

public class Auto {
	
	// ATTRIBUUTIT AUTOLLE
	private String automalli;
	private Integer valmistusvuosi;
	
	
	// KONSTRUKTORIT
	// PARAMETRILLINEN KONSTRUKTORI
	public Auto(String automalli, Integer valmistusvuosi) {
		super();
		this.automalli = automalli;
		this.valmistusvuosi = valmistusvuosi;
	}
	// PARATMETRITON KONSTRUKTORI
	public Auto() {
		super();
		this.automalli = null;
		this.valmistusvuosi = null;
	}

	
	
	// SETTERIT
	public void setAutomalli(String automalli) {
		this.automalli = automalli;
	}

	public void setValmistusvuosi(Integer valmistusvuosi) {
		this.valmistusvuosi = valmistusvuosi;
	}
	// GETTERIT
	public String getAutomalli() {
		return automalli;
	}

	public Integer getValmistusvuosi() {
		return valmistusvuosi;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return "automalli=" + automalli + ", valmistusvuosi=" + valmistusvuosi;
	}
	
}
