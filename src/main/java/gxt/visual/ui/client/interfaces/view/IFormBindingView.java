package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.Store;

/**
 * @author eugenp
 */
public interface IFormBindingView extends IBindingsView{
	
	/**
	 * Searches the form's fields, and adds a binding to and field without a binding.
	 */
	void autoBind();
	
	void bind( ModelData model );
	
	/**
	 * Returns the form binding's store.
	 * @return the store
	 */
	Store getStore();
	
	/**
	 * Sets the form binding's store. When set, edits will done using record instances from the store, rather than editing the model directly.
	 * @param store the store
	 */
	void setStore( Store store );

}
