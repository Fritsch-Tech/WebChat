package at.htld.module.webchat.repositorys;

import at.htld.module.webchat.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message,String> {

}
