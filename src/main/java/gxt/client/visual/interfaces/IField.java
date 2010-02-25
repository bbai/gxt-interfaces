package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.form.PropertyEditor;

/**
 * @author eugenp
 */
public interface IField< D > extends IBoxComponent{
	
	void setAutoValidate( final boolean autoValidate );
	void setValidationDelay( int validationDelay );
	void clearInvalid();
	
	void setFieldLabel( final String fieldLabel );
	
	PropertyEditor< D > getPropertyEditor();
	
	void setName( final String name );
	
	void setEmptyText( final String emptyText );
	String getEmptyText();
	
	D getValue();
	void setValue( final D value );
	
	String getRawValue();
	
	void reset();
	
	void setReadOnly( final boolean readOnly );
	
	void setPropertyEditor( PropertyEditor< D > propertyEditor );
	
	void setFireChangeEventOnSetValue( boolean fireChangeEventOnSetValue );
	
}
