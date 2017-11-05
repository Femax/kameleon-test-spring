package ru.fedosov.kameleon.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.fedosov.kameleon.test.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User save(User user);

}
