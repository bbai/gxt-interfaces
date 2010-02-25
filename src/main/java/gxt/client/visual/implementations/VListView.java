package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.IListView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.ListView;

public class VListView< M extends ModelData > extends ListView< M > implements IListView< M >{
	
	public VListView(){
		super();
	}
	
	public ListView< M > getComponent(){
		return this;
	}

}
