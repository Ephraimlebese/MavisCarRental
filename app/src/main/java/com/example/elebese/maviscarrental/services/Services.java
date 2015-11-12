package com.example.elebese.maviscarrental.services;

import java.util.List;

/**
 * Created by elebese on 2015/09/25.
 */
public interface Services<S, ID> {
    public S findById(ID id);

    public String save(S entity);

    public String update(S entity);

    public String delete(S entity);

    public List<S> findAll();
}
