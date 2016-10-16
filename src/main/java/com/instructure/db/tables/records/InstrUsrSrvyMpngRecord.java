/**
 * This class is generated by jOOQ
 */
package com.instructure.db.tables.records;


import com.instructure.db.tables.InstrUsrSrvyMpng;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InstrUsrSrvyMpngRecord extends UpdatableRecordImpl<InstrUsrSrvyMpngRecord> implements Record7<Integer, Integer, Integer, String, String, Date, Date> {

    private static final long serialVersionUID = -110241782;

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.usr_srvy_mpng_id</code>.
     */
    public void setUsrSrvyMpngId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.usr_srvy_mpng_id</code>.
     */
    public Integer getUsrSrvyMpngId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.usr_id</code>.
     */
    public void setUsrId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.usr_id</code>.
     */
    public Integer getUsrId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.srvy_id</code>.
     */
    public void setSrvyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.srvy_id</code>.
     */
    public Integer getSrvyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.crtd_usr</code>.
     */
    public void setCrtdUsr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.crtd_usr</code>.
     */
    public String getCrtdUsr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.lst_updtd_usr</code>.
     */
    public void setLstUpdtdUsr(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.lst_updtd_usr</code>.
     */
    public String getLstUpdtdUsr() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.crtd_time</code>.
     */
    public void setCrtdTime(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.crtd_time</code>.
     */
    public Date getCrtdTime() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>public.instr_usr_srvy_mpng.lst_updtd_time</code>.
     */
    public void setLstUpdtdTime(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.instr_usr_srvy_mpng.lst_updtd_time</code>.
     */
    public Date getLstUpdtdTime() {
        return (Date) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, String, String, Date, Date> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, String, String, Date, Date> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.USR_SRVY_MPNG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.USR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.SRVY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.CRTD_USR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.LST_UPDTD_USR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.CRTD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG.LST_UPDTD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUsrSrvyMpngId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUsrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSrvyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCrtdUsr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLstUpdtdUsr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getCrtdTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getLstUpdtdTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value1(Integer value) {
        setUsrSrvyMpngId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value2(Integer value) {
        setUsrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value3(Integer value) {
        setSrvyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value4(String value) {
        setCrtdUsr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value5(String value) {
        setLstUpdtdUsr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value6(Date value) {
        setCrtdTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord value7(Date value) {
        setLstUpdtdTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstrUsrSrvyMpngRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, Date value6, Date value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InstrUsrSrvyMpngRecord
     */
    public InstrUsrSrvyMpngRecord() {
        super(InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG);
    }

    /**
     * Create a detached, initialised InstrUsrSrvyMpngRecord
     */
    public InstrUsrSrvyMpngRecord(Integer usrSrvyMpngId, Integer usrId, Integer srvyId, String crtdUsr, String lstUpdtdUsr, Date crtdTime, Date lstUpdtdTime) {
        super(InstrUsrSrvyMpng.INSTR_USR_SRVY_MPNG);

        set(0, usrSrvyMpngId);
        set(1, usrId);
        set(2, srvyId);
        set(3, crtdUsr);
        set(4, lstUpdtdUsr);
        set(5, crtdTime);
        set(6, lstUpdtdTime);
    }
}