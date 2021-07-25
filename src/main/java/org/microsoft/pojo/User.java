package org.microsoft.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * author @Santosh
 */

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

	private String userName;
	@Id
	private Integer userId;
	private String userMobileNumber;
	private String userGender;

}
