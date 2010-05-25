package gxt.visual.ui.client.implementations;

import gxt.visual.ui.client.interfaces.IListView;

import com.extjs.gxt.ui.client.core.XTemplate;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ListView;

/**
 * @author eugenp
 */
public class VListView< M extends ModelData > extends ListView< M > implements IListView< M >{
	
	public VListView(){
		super();
	}
	public VListView( final ListStore< M > store ){
		super( store );
	}
	public VListView( final ListStore< M > store, final XTemplate template ){
		super( store, template );
	}

	//
	public ListView< M > getComponent(){
		return this;
	}
	
}
