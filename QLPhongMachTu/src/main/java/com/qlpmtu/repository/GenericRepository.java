/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpmtu.repository;

import java.util.List;

/**
 *
 * @author ACER
 */
public interface GenericRepository<Item> {
    Item saveNew(Item s);
    Item getById(Class<Item> type, Object id);
    List<Item> getAll(Class<Item> type);
}
