package mnj.mfg.model.lov.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 27 16:13:16 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StnNewVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public StnNewVOImpl() {
    }

    /**
     * Returns the bind variable value for P_BPO.
     * @return bind variable value for P_BPO
     */
    public String getP_BPO() {
        return (String)getNamedWhereClauseParam("P_BPO");
    }

    /**
     * Sets <code>value</code> for bind variable P_BPO.
     * @param value value to bind as P_BPO
     */
    public void setP_BPO(String value) {
        setNamedWhereClauseParam("P_BPO", value);
    }
}
