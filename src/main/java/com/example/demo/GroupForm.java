package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class GroupForm {

	@NotEmpty(message = "グループNoを入れてください")
	@Pattern(regexp = "\\d{5}", message = "半角英数字5桁で入力してください")
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}