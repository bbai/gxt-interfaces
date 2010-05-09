package gxt.visual.ui.client.interfaces.view;

import java.util.List;

import com.extjs.gxt.ui.client.widget.form.SimpleComboValue;

/**
 * @author eugenp
 */
public interface ISimpleComboBoxView< T > extends IComboBoxView< SimpleComboValue< T > >{
	
	/**
	 * Adds the values to the list.
	 * @param values the values
	 */
	void add( List< T > values );
	
	/**
	 * Adds the value.
	 * @param value the value
	 */
	void add( T value );
	
	/**
	 * Returns the model for the given value.
	 * @param value the value
	 * @return the corresponding model for the value
	 */
	SimpleComboValue< T > findModel( T value );
	
	/**
	 * Returns the selected index.
	 * @return the index or -1 if no selection
	 */
	int getSelectedIndex();
	
	/**
	 * Returns the simple value.
	 * @return the value
	 */
	T getSimpleValue();
	
	/**
	 * Removes the value.
	 * @param value the value
	 */
	void remove( T value );
	
	/**
	 * Removes all the values.
	 */
	void removeAll();
	
	/**
	 * Sets the combo value.
	 * @param value the value
	 */
	void setSimpleValue( T value );
	
}
