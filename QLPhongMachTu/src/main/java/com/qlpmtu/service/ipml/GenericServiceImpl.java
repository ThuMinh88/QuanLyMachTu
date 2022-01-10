/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.service.ipml;

import com.qlpmtu.repository.GenericRepository;
import com.qlpmtu.service.GenericService;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 * @param <Item>
 */
@Service
public abstract class GenericServiceImpl<Item extends Serializable> implements GenericService<Item>{
    private final GenericRepository<Item> genericRepository;

    public GenericServiceImpl(GenericRepository<Item> genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public Item saveNew(Item s) {
        return this.genericRepository.saveNew(s);
    }

    @Override
    public Item getById(Class<Item> type, Object id) {
        return this.genericRepository.getById(type, id);
    }

    @Override
    public List<Item> getAll(Class<Item> type) {
        return this.genericRepository.getAll(type);
    }
    
}
