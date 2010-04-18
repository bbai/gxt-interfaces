package gxt.client.visual.implementations;

import gxt.client.visual.interfaces.ITreeGrid;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGrid;

/**
 * @author eugenp
 */
public class VTreeGrid< M extends ModelData > extends TreeGrid< M > implements ITreeGrid< M >{
	
	public VTreeGrid( final TreeStore store, final ColumnModel cm ){
		super( store, cm );
	}

	//
	@Override
	public TreeGrid< M > getComponent(){
		return this;
	}
	
}
