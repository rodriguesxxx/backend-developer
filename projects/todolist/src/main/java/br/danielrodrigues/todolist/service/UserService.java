package br.danielrodrigues.todolist.service;

import br.danielrodrigues.todolist.model.Role;
import br.danielrodrigues.todolist.model.User;
import br.danielrodrigues.todolist.projections.UserDetailsProjection;
import br.danielrodrigues.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        List<UserDetailsProjection> results = userRepository.searchUserAndRolesByEmail(email);
        if(results.size() == 0){
            throw new UsernameNotFoundException("User not Found");
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(results.get(0).getPassword());
        for(UserDetailsProjection projection : results){
            user.addRole(new Role(projection.getRoleId(), projection.getAuthority()));
        }
        return user;
    }
}
