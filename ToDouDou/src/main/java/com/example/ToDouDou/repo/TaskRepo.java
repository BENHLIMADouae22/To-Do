package com.example.ToDouDou.repo;

import com.example.ToDouDou.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends MongoRepository<Task,String> {
}
