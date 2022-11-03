package com.project.RepoInterface;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.POJO.OrigTable;


@Repository("repoInterface")
@EnableJpaRepositories
public interface RepoInterface extends CrudRepository<OrigTable,String> {
	
	public List<OrigTable> findByLMSDATELike(Date date);
	public List<OrigTable> findByAGREEMENTNO(String aggNo);
	public List<OrigTable> findByLMSDATEBetween(Date sDate , Date endDate);
	

}
