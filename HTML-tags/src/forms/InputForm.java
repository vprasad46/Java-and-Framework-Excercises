package forms;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

public class InputForm extends ActionForm {
	private String country;
	private String state;
	private ArrayList countryList;
	private ArrayList stateList;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public ArrayList getCountryList() {
		return countryList;
	}
	public void setCountryList(ArrayList countryList) {
		this.countryList = countryList;
	}
	public ArrayList getStateList() {
		return stateList;
	}
	public void setStateList(ArrayList stateList) {
		this.stateList = stateList;
	}
}
