package com.plukash.jwtauthbase.utilities.AuthorityAnnotations;


import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@PreAuthorize("hasAuthority(T(com.plukash.jwtauthbase.entities.Role).ADMIN)")
public @interface AdminAuth {
}
