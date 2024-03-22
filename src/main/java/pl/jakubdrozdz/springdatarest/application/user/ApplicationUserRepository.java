package pl.jakubdrozdz.springdatarest.application.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
}
