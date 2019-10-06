package de.hdm.server.db;

import java.util.Vector;


public class Mapper {
	
	private static Mapper mapper = null;
	
	protected Mapper(){
		
	}
	
	
	 public static Mapper mapper() {
		    if (mapper == null) {
		      mapper = new Mapper();
		    }

		    return mapper;
		  }
	 
	
	 public Mapper findByKey(int id) {       //findById
		return null;
		 
	 }
	 
	 public Vector <Mapper> findAll(){       //findAll
		return null;
		 
	 }
	 
	 public Mapper insert (Mapper m) {       // insert
		return null;
		 
	 }
	 
	 public Mapper update (Mapper m) {       //update
		return null;
		 
	 }
	 
	 public Mapper delete (Mapper m) {       //delete
		return null;
		 
	 }
	 
	 
	 
	 
	
	 
	
	

}
