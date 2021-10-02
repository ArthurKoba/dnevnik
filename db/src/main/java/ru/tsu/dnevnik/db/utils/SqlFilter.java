package ru.tsu.dnevnik.db.utils;

import com.vaadin.data.Container;
import com.vaadin.data.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by Alexey on 19.01.2015.
 */
public class SqlFilter
    implements Container.Filter {

    private String sql;
    private List parameters;

    public SqlFilter(String sql, Object... parameters) {
        this.sql = sql;
        this.parameters = Arrays.asList(parameters);
    }

    @Override
    public boolean passesFilter(Object o, Item item) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Override
    public boolean appliesToProperty(Object o) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public String getSql() {
        return sql;
    }

    public List getParameters() {
        return Collections.unmodifiableList(parameters);
    }
}
