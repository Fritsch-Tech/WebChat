package at.htld.module.webchat.repositorys;

import at.htld.module.webchat.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
