package com.example.AccommodationReservation02.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.AccommodationReservation02.dto.MemberDTO;
import com.example.AccommodationReservation02.dto.User;

@Mapper
public interface MemberMapper {
	public MemberDTO read(String userid);

}
