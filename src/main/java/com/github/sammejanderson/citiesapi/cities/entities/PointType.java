package com.github.sammejanderson.citiesapi.cities.entities;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;
import org.postgresql.geometric.PGpoint;
import org.springframework.data.geo.Point;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class PointType implements UserType {
    @Override
    public int[] sqlTypes() {
        return new int[]{Types.OTHER};
    }

    @Override
    public Class returnedClass() {
        return Point.class;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        return false;
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return 0;
    }

    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session,
                              Object owner) throws HibernateException, SQLException {

        PGpoint value = (PGpoint) rs.getObject(names[0]);
        return new Point(value.x, value.y);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index,
                            SharedSessionContractImplementor session)
            throws HibernateException, SQLException {

    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return null;
    }

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return null;
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return null;
    }
}
