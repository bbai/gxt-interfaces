package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.Store;

/**
 * @author eugenp
 */
public interface IStoreFilterFieldView< M extends ModelData > extends ITriggerFieldView< M >{
	
	/**
	 * Binds the store to the field.
	 * @param store the store to add
	 */
	void bind( Store< M > store );
	
	/**
	 * Returns the current filter property.
	 * @return the property name
	 */
	String getProperty();
	
	/**
	 * Sets the filter property name to be filtered.
	 * @param property the property name
	 */
	void setProperty( String property );
	
	/**
	 * Unbinds the store from the field.
	 * @param store the store to be unbound
	 */
	void unbind( Store< M > store );

}
