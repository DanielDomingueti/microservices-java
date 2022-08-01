package com.domingueti.hroauth.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String roleName;
	
}
