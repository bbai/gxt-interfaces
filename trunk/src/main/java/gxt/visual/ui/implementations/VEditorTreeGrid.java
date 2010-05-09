package gxt.visual.ui.implementations;

import gxt.visual.interfaces.IEditorTreeGrid;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.treegrid.EditorTreeGrid;

/**
 * @author eugenp
 */
public class VEditorTreeGrid< M extends ModelData > extends EditorTreeGrid< M > implements IEditorTreeGrid< M >{

	public VEditorTreeGrid( final TreeStore storeToSet, final ColumnModel cmToSet ){
		super( storeToSet, cmToSet );
	}

	//
	public EditorTreeGrid< M > getComponent(){
		return this;
	}
	
}
