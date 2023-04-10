package com.spark.billgenerationapi.dto;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public enum Roles {
    ROLE_CUSTOMER(Set.of(Authority.READ_ORDER)),
    ROLE_POS(Set.of(Authority.READ_ORDER,Authority.WRITE_ORDER)),
    ROLE_MANAGER(Set.of(Authority.WRITE_ORDER,Authority.READ_ORDER)),
    ROLE_ADMIN(Set.of(Authority.GET_EARN,Authority.WRITE_EARN,Authority.WRITE_USER));
    private final Set<Authority> authorities;

    Roles(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Set<SimpleGrantedAuthority> getAllAuthorities()
    {
        System.out.println(getAuthorities().stream().map(auth->new SimpleGrantedAuthority(auth.getPermission())).collect(Collectors.toSet()));
        return getAuthorities().stream().map(auth->new SimpleGrantedAuthority(auth.getPermission())).collect(Collectors.toSet());
    }
}
