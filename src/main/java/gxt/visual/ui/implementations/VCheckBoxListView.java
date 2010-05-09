package gxt.visual.ui.implementations;

import gxt.visual.interfaces.ICheckBoxListView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.CheckBoxListView;

/**
 * @author eugenp
 */
public class VCheckBoxListView< M extends ModelData > extends CheckBoxListView< M > implements ICheckBoxListView< M >{
	
	public VCheckBoxListView(){
		//	
	}
	
	@Override
	public CheckBoxListView< M > getComponent(){
		return this;
	}
}
