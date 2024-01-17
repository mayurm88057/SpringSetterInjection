package com.mayur.corespring.corespring.properties;

import java.util.Properties;

public class CountryAndLanguages {

	private Properties CountriesLang;

	public Properties getCountriesLang() {
		return CountriesLang;
	}

	public void setCountriesLang(Properties countriesLang) {
		CountriesLang = countriesLang;
	}

	@Override
	public String toString() {
		return "CountryAndLanguages [CountriesLang=" + CountriesLang + "]";
	}
	
	
	
}
