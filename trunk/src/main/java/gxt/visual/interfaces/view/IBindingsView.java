package gxt.visual.interfaces.view;

import java.util.Collection;

import com.extjs.gxt.ui.client.binding.FieldBinding;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.form.Field;

/**
 * @author eugenp
 */
public interface IBindingsView{
	
	/**
	 * Adds a field binding.
	 * @param binding the binding instance to add
	 */
	void addFieldBinding( FieldBinding binding );
	
	/**
	 * Binds the model instance.
	 * @param model the model
	 */
	void bind( final ModelData model );
	
	/**
	 * Clears all fields by setting the value for each field to <code>null</code>.
	 */
	void clear();
	
	/**
	 * Returns the field binding for the given field.
	 * @param field the field
	 * @return the field binding or null of no match
	 */
	FieldBinding getBinding( Field< ? > field );
	
	/**
	 * Returns all bindings.
	 * @return the collection of bindings
	 */
	Collection< FieldBinding > getBindings();
	
	/**
	 * Returns the currently bound model;
	 * @return the currently bound model;
	 */
	ModelData getModel();
	
	/**
	 * Removes a field binding.
	 * @param binding the binding instance to remove
	 */
	void removeFieldBinding( FieldBinding binding );
	
	/**
	 * Unbinds the current model.
	 */
	void unbind();

}
