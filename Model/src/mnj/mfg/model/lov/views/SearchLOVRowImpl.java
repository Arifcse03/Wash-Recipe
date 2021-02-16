package mnj.mfg.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 06 15:11:57 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SearchLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        StnNo {
            public Object get(SearchLOVRowImpl obj) {
                return obj.getStnNo();
            }

            public void put(SearchLOVRowImpl obj, Object value) {
                obj.setStnNo((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(SearchLOVRowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(SearchLOVRowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SearchLOVRowImpl object);

        public abstract void put(SearchLOVRowImpl object, Object value);

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


    public static final int STNNO = AttributesEnum.StnNo.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SearchLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute StnNo.
     * @return the StnNo
     */
    public String getStnNo() {
        return (String) getAttributeInternal(STNNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StnNo.
     * @param value value to set the  StnNo
     */
    public void setStnNo(String value) {
        setAttributeInternal(STNNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
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