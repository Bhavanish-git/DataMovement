package com.project.RepoInterface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.POJO.OrigTable;


@Repository("repoInterface")
public interface RepoInterface extends CrudRepository<OrigTable,String> {
	
	

}
