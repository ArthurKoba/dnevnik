package ru.tsu.dnevnik.db.utils;

import com.vaadin.data.Container;
import com.vaadin.data.util.sqlcontainer.query.generator.StatementHelper;
import com.vaadin.data.util.sqlcontainer.query.generator.filter.FilterTranslator;
import com.vaadin.data.util.sqlcontainer.query.generator.filter.QueryBuilder;

/**
 * Created by Alexey on 19.01.2015.
 */
public class SqlTranslator
    implements FilterTranslator {

    @Override
    public boolean translatesFilter(Container.Filter filter) {
        return filter instanceof SqlFilter;
    }

    @Override
    public String getWhereStringForFilter(Container.Filter filter, StatementHelper statementHelper) {
        SqlFilter sqlFilter = (SqlFilter)filter;

        for(Object param : sqlFilter.getParameters())
            statementHelper.addParameterValue(param);
        return sqlFilter.getSql();
    }

    /**
     * Добавляет данный транслятор в {@link com.vaadin.data.util.sqlcontainer.query.generator.filter.QueryBuilder},
     * проверяя перед добавлением, есть ли уже транслятор для {@link SqlFilter}.
     */
    public static void addToQueryBuilder() {
        SqlFilter test = new SqlFilter("FALSE");
        StatementHelper h = new StatementHelper();
        if(QueryBuilder.getWhereStringForFilter(test, h).isEmpty())
            QueryBuilder.addFilterTranslator(new SqlTranslator());
    }
}
