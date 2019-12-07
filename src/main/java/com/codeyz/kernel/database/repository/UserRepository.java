package com.codeyz.kernel.database.repository;

import com.codeyz.kernel.database.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public Boolean existsUserBytIdAndFirstName(Integer tId, String firstName);
}
