package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ICheckBoxListView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.CheckBoxListView;

public class VCheckBoxListView< M extends ModelData > extends CheckBoxListView< M > implements ICheckBoxListView< M >{
	public VCheckBoxListView(){
		//	
	}
	
	@Override
	public CheckBoxListView< M > getComponent(){
		return this;
	}
}
