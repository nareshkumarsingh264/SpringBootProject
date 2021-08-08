package com.naresh.repository;
import org.springframework.data.repository.CrudRepository;  
import com.naresh.model.UserRecord;   
public interface UserRepository  extends CrudRepository<UserRecord, String> {

}
