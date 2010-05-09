package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IEditorGrid;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;

/**
 * @author eugenp
 */
public class VEditorGrid< M extends ModelData > extends EditorGrid< M > implements IEditorGrid< M >{

	public VEditorGrid( final ListStore storeToSet, final ColumnModel cmToSet ){
		super( storeToSet, cmToSet );
	}

	//
	public EditorGrid< M > getComponent(){
		return this;
	}
	
}
