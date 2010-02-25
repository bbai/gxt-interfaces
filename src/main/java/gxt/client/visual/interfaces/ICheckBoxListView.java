package gxt.client.visual.interfaces;

import java.util.List;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.ListStore;

/**
 * 
 */
public interface ICheckBoxListView< M extends ModelData > extends IListView< M >{
	
	void setStore( final ListStore< M > store );
	
	void setDisplayProperty( final String string );
	
	ListStore< M > getStore();
	
	List< M > getChecked();
	
	void setChecked( final M m, final boolean checked );
	
}
