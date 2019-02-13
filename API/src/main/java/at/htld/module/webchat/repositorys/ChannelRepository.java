package at.htld.module.webchat.repositorys;

import at.htld.module.webchat.entity.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ChannelRepository extends MongoRepository<Channel,String> {
    Optional findByUserId(String id);
}
