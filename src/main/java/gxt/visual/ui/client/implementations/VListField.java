package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IListField;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.ListField;

/**
 * @author eugenp
 */
public class VListField< D extends ModelData > extends ListField< D > implements IListField< D >{
	
	public VListField(){
		super();
	}
	
	public ListField< D > getComponent(){
		return this;
	}
	
}
