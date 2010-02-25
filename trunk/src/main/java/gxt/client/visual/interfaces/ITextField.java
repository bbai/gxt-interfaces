package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.Validator;

/**
 * @author eugenp
 */
public interface ITextField< D > extends IField< D >{
	
	void setAllowBlank( final boolean allowBlank );
	
	void setValidator( final Validator validator );
	
	void setMinLength( int minLength );
	
	void setValue( D value );

}
