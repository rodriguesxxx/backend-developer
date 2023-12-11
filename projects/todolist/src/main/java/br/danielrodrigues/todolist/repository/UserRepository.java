package br.danielrodrigues.todolist.repository;

import br.danielrodrigues.todolist.model.User;
import br.danielrodrigues.todolist.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(nativeQuery = true, value = """
           SELECT users.email AS username, users.password, roles.id AS roleId, role.authority 
           FROM users
           INNER JOIN users_roles ON users_id = users_roles.user_id
           INNER JOIN users_roles ON roles_id = users_roles.role_id
           WHERE users.email = :email;
    """)
    List<UserDetailsProjection> searchUserAndRolesByEmail(String email);
}
