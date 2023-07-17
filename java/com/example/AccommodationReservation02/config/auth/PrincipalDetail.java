package com.example.AccommodationReservation02.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.AccommodationReservation02.dto.MemberDTO;
import com.example.AccommodationReservation02.mapper.MemberMapper;


@Service
public class PrincipalDetail  
       implements UserDetailsService{
	@Autowired
	private MemberMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername");
		MemberDTO user  =userMapper.read(username);
		if(user ==null) 	return null;
		//회원이라면 시큐리티가 적용된 user 리턴
		PrincipalUser puser = new PrincipalUser(user);
		return puser;
	}

}
