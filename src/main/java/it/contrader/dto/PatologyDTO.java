package it.contrader.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import it.contrader.model.User.Usertype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO della classe User. Ha gli stessi attributi di User
 * 
 * @author Vittorio Valent & Girolamo Murdaca
 * 
 *@see User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class PatologyDTO {
	
	private long id;

    private String pato;
	
	private String carename;

	private String cf;
	
	private String quantity;
	
	private int mp;
	
	private int mpr;
	
	private int mc;
	
	private  int mci;
	
	private int mb;
	
	private int mbr;
	
	private float mt;
	
	private float mte;
	
	private String notes;
	
}
