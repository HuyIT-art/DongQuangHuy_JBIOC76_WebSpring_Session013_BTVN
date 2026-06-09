package hellospringboot.session13.security;


import hellospringboot.session13.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;
import java.util.List;


@AllArgsConstructor
public class UserPrincipal implements UserDetails {


    private User user;


    private Collection<? extends GrantedAuthority> authorities;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }



    @Override
    public String getPassword() {

        return user.getPassword();

    }



    @Override
    public String getUsername() {

        return user.getUsername();

    }



    @Override
    public boolean isEnabled() {

        return user.isEnabled();

    }
}