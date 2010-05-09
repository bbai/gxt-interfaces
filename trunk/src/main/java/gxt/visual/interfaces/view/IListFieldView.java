package gxt.visual.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.core.XTemplate;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.ListView;
import com.extjs.gxt.ui.client.widget.form.ListModelPropertyEditor;
import com.extjs.gxt.ui.client.widget.form.PropertyEditor;

/**
 * @author eugenp
 */
public interface IListFieldView< D extends ModelData > extends IFieldView< D >{
	
	void addSelectionChangedListener( SelectionChangedListener< D > listener );
	
	void disable();
	
	void enable();
	
	/**
	 * Returns the display field.
	 * @return the display field
	 */
	String getDisplayField();
	
	/**
	 * Returns the item selector.
	 * @return the item selector
	 */
	String getItemSelector();
	
	/**
	 * Returns the field's list view.
	 * @return the list view
	 */
	ListView< D > getListView();
	
	ListModelPropertyEditor< D > getPropertyEditor();
	
	String getRawValue();
	
	List< D > getSelection();
	
	/**
	 * Returns the field's store.
	 * @return the store
	 */
	ListStore< D > getStore();
	
	/**
	 * Returns the custom template.
	 * @return the template
	 */
	XTemplate getTemplate();
	
	D getValue();
	
	String getValueField();
	
	void removeSelectionListener( SelectionChangedListener< D > listener );
	
	/**
	 * Sets the display field.
	 * @param displayField the display field
	 */
	void setDisplayField( String displayField );
	
	/**
	 * This setting is required if a custom XTemplate has been specified.
	 * @param itemSelector the item selector
	 */
	void setItemSelector( String itemSelector );
	
	void setPropertyEditor( PropertyEditor< D > propertyEditor );
	
	void setSelection( List< D > selection );
	
	/**
	 * Sets the list field's list store.
	 * @param store the store
	 */
	void setStore( ListStore< D > store );
	
	/**
	 * Sets the field's template used to render the list.
	 * @param html the html frament
	 */
	void setTemplate( String html );
	
	/**
	 * Sets the field's template used to render the list.
	 * @param template
	 */
	void setTemplate( XTemplate template );
	
	/**
	 * Sets the field's value field.
	 * @param valueField the value field
	 */
	void setValueField( String valueField );
	
}
