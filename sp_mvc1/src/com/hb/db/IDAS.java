package com.hb.db;

import java.io.Serializable;
import java.util.List;

public interface IDAS<T> {

    public T save(T newEntity);
    public void delete(T entity);
    public T find(Serializable id);
    public T findNow(Serializable id);
    public List<T> findAll();
	
}
