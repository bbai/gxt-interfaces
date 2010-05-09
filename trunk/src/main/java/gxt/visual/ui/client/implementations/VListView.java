package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IListView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.ListView;

/**
 * @author eugenp
 */
public class VListView< M extends ModelData > extends ListView< M > implements IListView< M >{
	
	public VListView(){
		super();
	}
	
	public ListView< M > getComponent(){
		return this;
	}
	
}
