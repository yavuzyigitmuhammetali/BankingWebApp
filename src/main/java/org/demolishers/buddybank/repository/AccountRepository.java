package org.demolishers.buddybank.repository;

import org.demolishers.buddybank.model.Account;
import org.demolishers.buddybank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUser(User user);

    Optional<Account> findById(Long id);
}
