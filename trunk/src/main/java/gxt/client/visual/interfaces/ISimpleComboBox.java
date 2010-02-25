package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.SimpleComboValue;

/**
 * @author eugenp
 */
public interface ISimpleComboBox< T > extends IComboBox< SimpleComboValue< T > >{
	
	void setSimpleValue( final T value );
	
	void add( T value );

}
