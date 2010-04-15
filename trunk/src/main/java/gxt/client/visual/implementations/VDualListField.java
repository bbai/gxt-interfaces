package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IDualListField;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.DualListField;

/**
 * @author eugenp
 */
public class VDualListField< D extends ModelData > extends DualListField< D > implements IDualListField< D >{
	
	public VDualListField(){
		super();
	}

	//
	public DualListField< D > getComponent(){
		return this;
	}
	
}
