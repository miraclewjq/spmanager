package com.wu.spmanager.dto;

import lombok.Data;

@Data
public class UserSearchDTO {

	private Integer page;

	private Integer limit;

	private String uname;

	private String umobile;

	private String insertTimeStart;

	private String insertTimeEnd;

	private String uemail;
}
