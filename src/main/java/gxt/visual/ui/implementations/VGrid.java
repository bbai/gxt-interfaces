package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IGrid;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;

/**
 * @author eugenp
 */
public class VGrid< M extends ModelData > extends Grid< M > implements IGrid< M >{
	
	public VGrid(){
		super();
	}
	public VGrid( final ListStore< M > storeToSet, final ColumnModel cmToSet ){
		super( storeToSet, cmToSet );
	}
	
	//
	public Grid< M > getComponent(){
		return this;
	}
	
}
