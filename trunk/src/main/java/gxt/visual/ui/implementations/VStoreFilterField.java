package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IStoreFilterField;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.StoreFilterField;

/**
 * @author eugenp
 */
public abstract class VStoreFilterField< M extends ModelData > extends StoreFilterField< M > implements IStoreFilterField< M >{

	//
	public StoreFilterField< M > getComponent(){
		return this;
	}

}
