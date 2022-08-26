package app.web.template.account.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface UserDetailsRepository extends JpaRepository<AccountEntity, Long> {
    Optional<AccountEntity> findByUsername(String username);
}
