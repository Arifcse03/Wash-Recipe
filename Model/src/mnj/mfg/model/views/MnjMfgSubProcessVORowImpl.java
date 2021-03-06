package mnj.mfg.model.views;

import mnj.mfg.model.entities.MnjMfgSubProcessEOImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 17 12:12:22 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgSubProcessVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SubDetailId {
            public Object get(MnjMfgSubProcessVORowImpl obj) {
                return obj.getSubDetailId();
            }

            public void put(MnjMfgSubProcessVORowImpl obj, Object value) {
                obj.setSubDetailId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MnjMfgSubProcessVORowImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgSubProcessVORowImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        SubProcess {
            public Object get(MnjMfgSubProcessVORowImpl obj) {
                return obj.getSubProcess();
            }

            public void put(MnjMfgSubProcessVORowImpl obj, Object value) {
                obj.setSubProcess((String)value);
            }
        }
        ,
        Remarks {
            public Object get(MnjMfgSubProcessVORowImpl obj) {
                return obj.getRemarks();
            }

            public void put(MnjMfgSubProcessVORowImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgSubProcessVORowImpl object);

        public abstract void put(MnjMfgSubProcessVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int SUBDETAILID = AttributesEnum.SubDetailId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int SUBPROCESS = AttributesEnum.SubProcess.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgSubProcessVORowImpl() {
    }

    /**
     * Gets MnjMfgSubProcessEO entity object.
     * @return the MnjMfgSubProcessEO
     */
    public MnjMfgSubProcessEOImpl getMnjMfgSubProcessEO() {
        return (MnjMfgSubProcessEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for SUB_DETAIL_ID using the alias name SubDetailId.
     * @return the SUB_DETAIL_ID
     */
    public Number getSubDetailId() {
        return (Number) getAttributeInternal(SUBDETAILID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_DETAIL_ID using the alias name SubDetailId.
     * @param value value to set the SUB_DETAIL_ID
     */
    public void setSubDetailId(Number value) {
        setAttributeInternal(SUBDETAILID, value);
    }

    /**
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for SUB_PROCESS using the alias name SubProcess.
     * @return the SUB_PROCESS
     */
    public String getSubProcess() {
        return (String) getAttributeInternal(SUBPROCESS);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_PROCESS using the alias name SubProcess.
     * @param value value to set the SUB_PROCESS
     */
    public void setSubProcess(String value) {
        setAttributeInternal(SUBPROCESS, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
