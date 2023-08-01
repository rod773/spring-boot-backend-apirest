package com.springbootrest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootrest.models.dao.IClienteDao;
import com.springbootrest.models.entity.Cliente;

public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {

		return (List<Cliente>) clienteDao.findAll();

	}

}
