package de.hdm.shared.bo;

import java.io.Serializable;

public abstract class BusinessObject implements Serializable {
	
	  private static final long serialVersionUID = 1L;

	 private  int id = 0;
	 
	 public BusinessObject() {
		 
	 }
	 
	 
	 public int getId() {
		    return this.id;
		  }

		 
	 
		  public void setId(int id) {
		    this.id = id;
		  }

		
}
