package net.fahridsrzl.bankapp.repository;

import net.fahridsrzl.bankapp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
