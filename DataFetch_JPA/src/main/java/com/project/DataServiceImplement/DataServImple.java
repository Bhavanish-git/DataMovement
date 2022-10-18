package com.project.DataServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.DataServiceInterface.DataService;
import com.project.POJO.OrigTable;
import com.project.RepoInterface.RepoInterface;


@Transactional
@Service("dataServImple")
public class DataServImple implements DataService {
	
	@Autowired(required = false)
	RepoInterface repoInterface;

	@Override
	public List<OrigTable> findAll() {
		return (List<OrigTable>) repoInterface.findAll();
	}

}
