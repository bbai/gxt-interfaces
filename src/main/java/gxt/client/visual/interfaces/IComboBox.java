package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.SelectionProvider;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ListView;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;

/**
 * @author eugenp
 */
public interface IComboBox< D extends ModelData > extends ITriggerField< D >, SelectionProvider< D >{
	
	void setDisplayField( final String displayField );
	
	void setLoadingText( final String loadingText );
	
	void setStore( final ListStore< D > store );
	ListStore< D > getStore();
	
	ListView< D > getView();
	
	void setTriggerAction( final TriggerAction triggerAction );
	
	void setPageSize( final int pageSize );
	void setQueryDelay( final int queryDelay );

}
