package com.example.AccommodationReservation02.dto;

import java.util.List;

import lombok.Data;

@Data
public class MemberDTO {
	private String userid;
	private String userpw;
	private String username;
	private String regdate;
	private String updateDate;
	private boolean enabled;
	private List<AuthDTO> authList;
	private String role;
}
