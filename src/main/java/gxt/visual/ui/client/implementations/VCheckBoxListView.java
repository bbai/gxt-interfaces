package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.ICheckBoxListView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.CheckBoxListView;

/**
 * @author eugenp
 */
public class VCheckBoxListView< M extends ModelData > extends CheckBoxListView< M > implements ICheckBoxListView< M >{
	
	public VCheckBoxListView(){
		super();
	}
	
	@Override
	public CheckBoxListView< M > getComponent(){
		return this;
	}

}
