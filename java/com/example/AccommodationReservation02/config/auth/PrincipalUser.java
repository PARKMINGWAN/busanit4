package com.example.AccommodationReservation02.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.AccommodationReservation02.dto.MemberDTO;

import lombok.Getter;

@Getter
public class PrincipalUser  implements UserDetails     {
 	private MemberDTO user;
	public PrincipalUser(MemberDTO user) {
		this.user = user;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collect = new ArrayList<>();
		collect.add(()-> {
			return user.getRole();
		});
		return collect;
	}

	@Override
	public String getPassword() {
			return user.getUserpw();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
			return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	  	return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}

}
